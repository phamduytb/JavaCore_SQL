package baitap.main;/*
java by nsotien tv .......
Name : nsotien
Time : 08:11
Date : 07/11/2022
*/

import baitap.entity.Student;
import baitap.entity.University;
import baitap.sevice.StudentIml;
import baitap.sevice.UniversityIml;

import java.sql.SQLException;
import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {


        while (true) {
            StudentIml si = new StudentIml();
            Student s = new Student();
            System.err.println("menu student....");
            System.out.println("1. create");
            System.out.println("2. update");
            System.out.println("3. delete");
            System.out.println("4. search name student");
            System.out.println("5. search age student");
            System.out.println("6. search name university join ");
            System.out.println("7. search id student join ");
            System.out.println("8. out");
            int luachon = new Scanner(System.in).nextInt();
            try {
                if (luachon == 1) {
                    System.out.println("create student + university_id = ");
                    si.createStudent(s);
                    System.err.println("create succeed");
                } else if (luachon == 2) {
                    System.out.println("update student_name : ");
                    si.updateStudent(s);
                    System.err.println("update succeed");
                } else if (luachon == 3) {
                    System.out.println("delete by id student = ");
                    si.deleteStudent();
                    System.err.println("delete succeed");
                } else if (luachon == 4) {
                    System.out.println("search name student : ");
                    si.searchNameStudent();
                    System.err.println("search succeed");
                } else if (luachon == 5) {
                    System.out.println("search age = ");
                    si.searchAgeStudent();
                    System.err.println("search succeed");
                } else if (luachon == 6) {
                    System.out.println("search name university join : ");
                    si.searchNameUniversity();
                    System.err.println("search succeed");
                } else if (luachon == 7) {
                    System.out.println("search id student join : ");
                    si.searchIDStudent();
                    System.err.println("search succeed");
                } else if (luachon == 8) {
                    break;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
