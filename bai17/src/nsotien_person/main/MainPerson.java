package nsotien_person.main;/*
java by nsotien tv .......
Name : nsotien
Time : 16:46
Date : 05/11/2022
*/

import nsotien_person.entity.Person;
import nsotien_person.sevice.PersonIml;

import java.sql.SQLException;
import java.util.Scanner;

public class MainPerson {
    public static void main(String[] args) {
        while (true) {
            System.out.println("menu.....");
            System.out.println("1.create");
            System.out.println("2.update");
            System.out.println("3.delete");
            System.out.println("4.read");
            System.out.println("5.search");
            System.out.println("6.out");
            int a = new Scanner(System.in).nextInt();
            if (a == 1) {
                PersonIml pi = new PersonIml();
                Person p = new Person();
                try {
                    pi.createPerson();
                } catch (SQLException se) {
                    se.printStackTrace();
                }
            } else if (a == 2) {
                PersonIml pi = new PersonIml();
                try {
                    pi.updatePerson();
                } catch (SQLException se) {
                    se.printStackTrace();
                }
            } else if (a == 3) {
                PersonIml pi = new PersonIml();
                try {
                    pi.deletePerson();
                } catch (SQLException se) {
                    se.printStackTrace();
                }
            } else if (a == 4) {
                PersonIml pi = new PersonIml();
                try {
                    pi.readPerson();
                } catch (SQLException se) {
                    se.printStackTrace();
                }
            } else if (a == 5) {
                PersonIml pi = new PersonIml();
                try {
                    pi.seachPerson();
                } catch (SQLException se) {
                    se.printStackTrace();
                }
            }
        }
    }
}
