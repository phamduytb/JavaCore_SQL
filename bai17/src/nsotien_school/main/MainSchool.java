package nsotien_school.main;/*
java by nsotien tv .......
Name : nsotien
Time : 10:30
Date : 08/11/2022
*/

import nsotien_school.sevice.SchoolIml;

import java.sql.SQLException;
import java.util.Scanner;

public class MainSchool {
    public static void main(String[] args) {
        while (true) {
            SchoolIml si = new SchoolIml();
            System.err.println("menu....");
            System.out.println("1. create ....");
            System.out.println("2. update ....");
            System.out.println("3. delete ....");
            System.out.println("4. search ....");
            System.out.println("5. read ....");
            System.out.println("6. out ....");
            int luachon = new Scanner(System.in).nextInt();
            if (luachon == 1) {
                try {
                    si.createSchool();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else if (luachon == 2) {
                try {
                    si.updateSchool();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else if (luachon == 3) {
                try {
                    si.deleteSchool();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else if (luachon == 4) {
                try {
                    si.searchSchool();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else if (luachon == 5) {
                try {
                    si.readSchool();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else if (luachon == 6) {
                break;
            }
        }
    }
}
