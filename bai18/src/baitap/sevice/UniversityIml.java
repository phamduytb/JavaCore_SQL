package baitap.sevice;/*
java by nsotien tv .......
Name : nsotien
Time : 08:08
Date : 07/11/2022
*/

import baitap.entity.University;
import baitap.repository.UniversityRepository;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class UniversityIml implements UniversityDao {
    @Override
    public void input(University u) {
        System.out.println("id : ");
        u.setId(new Scanner(System.in).nextInt());
        System.out.println("name : ");
        u.setName(new Scanner(System.in).nextLine());
        System.out.println("address : ");
        u.setAddress(new Scanner(System.in).nextLine());
    }

    @Override
    public void output(University u) {
        System.out.println("id = " + u.getId());
        System.out.println("name = " + u.getName());
        System.out.println("address = " + u.getAddress());
    }

    @Override
    public void createUniversity(University u) throws SQLException {
        UniversityRepository ur = new UniversityRepository();
        input(u);
        ur.createU(u);
    }

    @Override
    public void updateUniversity(University u) throws SQLException {
        UniversityRepository ur = new UniversityRepository();
        input(u);
        ur.updateU(u);
    }

    @Override
    public void deleteUniversity() throws SQLException {
        UniversityRepository ur = new UniversityRepository();
        int id = new Scanner(System.in).nextInt();
        ur.deleteU(id);
    }

    @Override
    public void seachUniversity() throws SQLException {
        UniversityRepository ur = new UniversityRepository();
        String name = new Scanner(System.in).nextLine();
        System.err.println("have name is = ");
        List<University> universityList = ur.searchU(name);
        for (University x : universityList)
            output(x);
    }
}
