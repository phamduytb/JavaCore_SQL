package nsotien.sevice;/*
java by nsotien tv .......
Name : nsotien
Time : 19:28
Date : 24/11/2022
*/

import nsotien.entity.Person;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetImpl implements SetInterface {
    PersonImpl personi = new PersonImpl();

    @Override
    public Set<Person> input() {
        Set<Person> personSet = new HashSet<Person>();  // khai báo SET
        while (true) {
            System.out.println("input person :");
            Person person = new Person();
            personi.input(person);  // nhập thông tin person
            personSet.add(person); // add person vào SET
            System.out.println("1. continue");
            System.out.println("2. out");
            int luaChon = new Scanner(System.in).nextInt();
            if (luaChon == 2) { // dùng để hỏi người dùng có add tiếp person vào SET ko
                break;
            }
        }
        return personSet;
    }

    @Override
    public void output(Set<Person> personSet) { // personSet đại diện cho danh sách người trong SET
        for (Person p : personSet) {
            personi.output(p);
        }
    }

    @Override
    public void filter(Set<Person> personSet) {
        for (Person p : personSet) {
            if (p.getAge() < 20) {
                personi.output(p);
            }
        }
    }

    @Override
    public void delete(Set<Person> personSet) {
        Iterator<Person> personIterator = personSet.iterator();  // interator bổ trợ cho việc tìm name chứa A
        while (personIterator.hasNext()) {
            Person person = personIterator.next();
            if (person.getName().toUpperCase().contains("A")) { // tìm name chứa A
                personIterator.remove(); // xoá người name chứa A
            }
        }
        System.out.println("infor after");
        output(personSet);  // gọi danh sách set sau khi xoá


    }
}
