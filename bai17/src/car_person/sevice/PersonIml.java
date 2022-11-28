package nsotien.car_person.sevice;
/*
java by nsotien tv .......
Name : nsotien
Time : 16:07
Date : 05/11/2022
*/

import nsotien.car_person.entity.Person;
import nsotien.car_person.repository.PersonRepository;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class PersonIml implements PersonInterface {
    @Override
    public void input(Person p) {

        System.out.println("...");
        System.out.println("id = ");
        p.setId(new Scanner(System.in).nextInt());
        System.out.println("name = ");
        p.setName(new Scanner(System.in).nextLine());
        System.out.println("age = ");
        p.setAge(new Scanner(System.in).nextInt());
        System.out.println("country = ");
        p.setCountry(new Scanner(System.in).nextLine());
        System.out.println("date (dd/mm/yyyy) = ");
        String birthDate = new Scanner(System.in).nextLine();
        //nhập ngày vào : convertd string -> date
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            p.setBirthdate(sdf.parse(birthDate));
        } catch (ParseException pe) {
            System.out.println("sai");
        }
    }

    @Override
    public void output(Person p) {
        System.out.println("id : " + p.getId());
        System.out.println("name : " + p.getName());
        System.out.println("age : " + p.getAge());
        System.out.println("country : " + p.getCountry());
        // lấy ngày ra
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("date : " + sdf.format(p.getBirthdate()));

    }
    // nhập thông tin person vào bảng

    @Override
    public void createPerson() throws SQLException {
        Person p = new Person();
        PersonRepository pr = new PersonRepository();
        input(p);
        pr.create(p);
        System.out.println("input succeed");
    }
    // xoá danh sách

    @Override
    public void deletePerson() throws SQLException {
        PersonRepository pr = new PersonRepository();
        System.out.println("id delete =");
        int id = new Scanner(System.in).nextInt();
        pr.delete(id);
        System.out.println("delete succeed");
    }

    // sửa danh sách
    @Override
    public void updatePerson() throws SQLException {
        Person p = new Person();
        PersonRepository pr = new PersonRepository();
        System.out.println("update age person = ");
        input(p);
        pr.update(p);
        System.out.println("update succeed");

    }

    // xuất thông tin danh sách person
    @Override
    public void readPerson() throws SQLException {
        Person p = new Person();
        PersonRepository pr = new PersonRepository();
        System.err.println("infor person : ");
        List<Person> personList = pr.readAll();
        for (Person x : personList) {
            output(x);
        }
        System.err.println("infor succeed");

    }
    // xuất thông tin danh sách person có name là s

    @Override
    public void seachPerson() throws SQLException {
        Person p = new Person();
        PersonRepository pr = new PersonRepository();
        System.err.println("search name = ");
        System.err.println("infor have name = ");
        String s = new Scanner(System.in).nextLine();
        List<Person> personList = pr.search(s);
        for (Person x : personList)
            output(x);
        System.err.println("search succeed");

    }


}
