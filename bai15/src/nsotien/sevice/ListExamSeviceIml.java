package nsotien.sevice;/*
java by nsotien tv .......
Name : nsotien
Time : 3:03 PM
Date : 10/29/22
*/

import nsotien.model.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListExamSeviceIml implements ListExamSevice {

    List<Person> personList = new ArrayList<>();
    PersonSeviceIml ps = new PersonSeviceIml();



    @Override
    public List<Person> input() {

        while (true) {
            Person p = new Person();
            System.out.println("Vui long nhap thong tin Person");
            ps.input(p);
            personList.add(p);

            System.out.println("Tiep tuc ? (1:Out) (2:Continue)");
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            if (option == 1) {
                break;
            }
        }
        return personList;
    }

    @Override  //cau1
    public List<Person> output() {
        for (Person x : personList)
            ps.output(x);
        return null;
    }
    @Override  //cau1
    public List<Person> filter() {
        System.out.println("infor age < 20");
        for (Person x : personList)
            if (x.getAge() < 20 )
                ps.output(x);
        return null;
    }

    @Override
    public List<Person> delete() {
        Iterator<Person> ip = new Iterator<Person>();
        return null;
    }

    @Override
    public List<Person> sortPerson() {
        return null;
    }
}
