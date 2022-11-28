package nsotien.sevice;/*
java by nsotien tv .......
Name : nsotien
Time : 2:29 PM
Date : 10/29/22
*/

import nsotien.model.Person;

import java.util.Scanner;

public class PersonSeviceIml implements PersonSevice {
    Person p = new Person();

    @Override
    public void input(Person p) {
        System.out.println("......");
        System.out.println("id = ");
        p.setId(new Scanner(System.in).nextInt());
        System.out.println("age = ");
        p.setAge(new Scanner(System.in).nextInt());
        System.out.println("name = ");
        p.setName(new Scanner(System.in).nextLine());
    }

    @Override
    public void output(Person p) {
        System.out.println("infor person : ");
        System.out.println("id : " + p.getId());
        System.out.println("age : " + p.getAge());
        System.out.println("name : " + p.getName());
    }
}
