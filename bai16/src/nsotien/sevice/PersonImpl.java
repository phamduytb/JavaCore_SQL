package nsotien.sevice;/*
java by nsotien tv .......
Name : nsotien
Time : 19:26
Date : 24/11/2022
*/

import nsotien.entity.Person;

import java.util.Scanner;

public class PersonImpl implements PersonInterface {
    @Override
    public void input(Person person) {
        System.out.println("id : ");
        person.setId(new Scanner(System.in).nextInt());
        System.out.println("name : ");
        person.setName(new Scanner(System.in).nextLine());
        System.out.println("age : ");
        person.setAge(new Scanner(System.in).nextInt());
    }

    @Override
    public void output(Person person) {
        System.out.println("id = " + person.getId());
        System.out.println("name = " + person.getName());
        System.out.println("age = " + person.getAge());
    }
}
