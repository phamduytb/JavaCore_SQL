package nsotien.main;/*
java by nsotien tv .......
Name : nsotien
Time : 19:43
Date : 24/11/2022
*/

import nsotien.entity.Person;
import nsotien.sevice.SetImpl;
import nsotien.sevice.SetInterface;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainPerson {
    public static void main(String[] args) {
        SetImpl set = new SetImpl();
        Set<Person> personSet = set.input(); // add thông tin person vào SET
        while (true) {
            System.out.println("menu ....");
            System.out.println("1. info person ");
            System.out.println("2. filter person age < 20 ");
            System.out.println("3. delete person has (a)");
            System.out.println("4. out ");
            int luaChon = new Scanner(System.in).nextInt();
            if (luaChon == 1) {
                set.output(personSet);
                System.err.println("infor sucessed");
            } else if (luaChon == 2) {
                set.filter(personSet);
                System.err.println("filter age <20 sucessed");
            } else if (luaChon == 3) {
                set.delete(personSet);
                System.err.println("delete name has (a) sucessed");
            } else if (luaChon == 4) {
                break;
            }
        }
    }

}
