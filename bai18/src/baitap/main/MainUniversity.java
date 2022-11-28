package baitap.main;/*
java by nsotien tv .......
Name : nsotien
Time : 08:11
Date : 07/11/2022
*/

import baitap.entity.University;
import baitap.sevice.UniversityIml;

import java.sql.SQLException;
import java.util.Scanner;

public class MainUniversity {
    public static void main(String[] args) {

        while (true) {
            UniversityIml ui = new UniversityIml();
            University u = new University();
            System.out.println("menu university....");
            System.out.println("1. create");
            System.out.println("2. update");
            System.out.println("3. search");
            System.out.println("4. delete");
            System.out.println("5. out");
            int luachon = new Scanner(System.in).nextInt();
            try {
                if (luachon == 1) {
                    ui.createUniversity(u);
                    System.err.println("create succeed");
                } else if (luachon == 2) {
                    System.out.println("update name + address : ");
                    ui.updateUniversity(u);
                    System.err.println("update succeed");
                } else if (luachon == 3) {
                    System.out.println("search name : ");
                    ui.seachUniversity();
                    System.err.println("search succeed");
                } else if (luachon == 4) {
                    System.out.println("id delete : ");
                    ui.deleteUniversity();
                    System.err.println("delete succeed");
                } else if (luachon == 5) {
                    break;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
