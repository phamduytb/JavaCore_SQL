package nsotien_school.sevice;/*
java by nsotien tv .......
Name : nsotien
Time : 10:20
Date : 08/11/2022
*/

import nsotien_school.entity.School;
import nsotien_school.repository.SchoolRepository;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class SchoolIml implements SchoolInterface {
    SchoolRepository sr = new SchoolRepository();

    @Override
    public void input(School s) {
        System.out.println("id = ");
        s.setId(new Scanner(System.in).nextInt());
        System.out.println("name = ");
        s.setName(new Scanner(System.in).nextLine());
        System.out.println("address = ");
        s.setAddress(new Scanner(System.in).nextLine());
    }

    @Override
    public void output(School s) {
        System.out.println("id :" + s.getId());
        System.out.println("name :" + s.getName());
        System.out.println("address :" + s.getAddress());
    }

    @Override
    public void createSchool() throws SQLException {
//        SchoolRepository sr = new SchoolRepository();
        School s = new School();
        System.out.println("create school :");
        input(s);
        sr.create(s);
        System.err.println("create succeed");
    }

    @Override
    public void updateSchool() throws SQLException {
//        SchoolRepository sr = new SchoolRepository();
        School s = new School();
        System.out.println("update name,address :");
        input(s);
        sr.update(s);
        System.err.println("update succeed");
    }

    @Override
    public void deleteSchool() throws SQLException {
        System.out.println("id delete :");
        int id = new Scanner(System.in).nextInt();
        sr.delete(id);
        System.err.println("delete succeed");
    }

    @Override
    public void searchSchool() throws SQLException {
        System.out.println("search name school :");
        String name = new Scanner(System.in).nextLine();
        List<School> schoolLists = sr.search(name);
        System.out.println("name school have " + name + " :");
        for (School x : schoolLists)
            output(x);
        System.err.println("search succeed");

    }

    @Override
    public void readSchool() throws SQLException {
        System.out.println("info school :");
        List<School> schoolList = sr.read();
        for (School x : schoolList)
            output(x);
    }
}
