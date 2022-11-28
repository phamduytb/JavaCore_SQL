package nsotien.main;/*
java by nsotien tv .......
Name : nsotien
Time : 2:30 PM
Date : 10/29/22
*/

import nsotien.model.Person;
import nsotien.sevice.PersonSeviceIml;

import java.util.ArrayList;
import java.util.List;

public class MainPerson {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person person1 = new Person();
        Person person2 = new Person();
        PersonSeviceIml ps = new PersonSeviceIml();


        ps.input(person1);
        ps.input(person2);
        personList.add(person1);
        personList.add(person2);
        System.out.println(person1.equals(person2));


    }
}
