package baitap.sevice;/*
java by nsotien tv .......
Name : nsotien
Time : 08:47
Date : 07/11/2022
*/

import baitap.entity.Student;
import baitap.entity.University;
import baitap.repository.JDBC;
import baitap.repository.StudentRepository;
import baitap.repository.UniversityRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentIml implements StudentDao {


    @Override
    public void input(Student s) throws SQLException {
        System.out.println("id : ");
        s.setId(new Scanner(System.in).nextInt());
        System.out.println("name : ");
        s.setName(new Scanner(System.in).nextLine());
        System.out.println("age : ");
        s.setAge(new Scanner(System.in).nextInt());
        // thiết lập quan hệ has - a để nhập id university
        while (true) {
            System.out.println("university id : ");
            UniversityRepository ur = new UniversityRepository();
            int idU = new Scanner(System.in).nextInt();
            University u = ur.getIdUniversity(idU);
            if (u != null) {
                s.setUniversity(u);
                break;
            } else { // nếu id bên university null
                System.out.println("id university ban nhap ko co: ");
                break;
            }
        }
    }


    @Override
    public void output(Student s) {
        System.out.println("id = " + s.getId());
        System.out.println("name = " + s.getName());
        System.out.println("age = " + s.getAge());
        // thiết lập quan hệ has - a để xuất id university
        if (s.getUniversity() != null) {
            System.out.println("university = ");
            UniversityIml universityIml = new UniversityIml();
            universityIml.output(s.getUniversity());
        }
    }

    @Override //thêm bảng
    public void createStudent(Student s) throws SQLException {
        StudentRepository sr = new StudentRepository();
        input(s);
        sr.createS(s);
    }

    @Override // sửa bảng
    public void updateStudent(Student s) throws SQLException {
        StudentRepository sr = new StudentRepository();
        input(s);
        sr.updateS(s);
    }

    @Override // xoá theo id student
    public void deleteStudent() throws SQLException {
        StudentRepository sr = new StudentRepository();
        int id = new Scanner(System.in).nextInt();
        sr.deleteS(id);
    }

    @Override // tìm kiếm theo tên học sinh output student
    public void searchNameStudent() throws SQLException {
        StudentRepository sr = new StudentRepository();
        String name = new Scanner(System.in).nextLine();
        System.err.println("have name " + name + " : ");
        List<Student> studentList = sr.seachNameS(name);
        for (Student x : studentList)
            output(x);
    }

    @Override // tìm kiếm theo tuổi học sinh output student
    public void searchAgeStudent() throws SQLException {
        StudentRepository sr = new StudentRepository();
        int age = new Scanner(System.in).nextInt();
        System.err.println("have age " + age + " : ");
        List<Student> studentList = sr.seachAgeS(age);
        for (Student x : studentList)
            output(x);
    }

    @Override // tìm kiếm theo name university join 2 bảng
    public void searchNameUniversity() throws SQLException {
        StudentRepository sr = new StudentRepository();
        String name = new Scanner(System.in).nextLine();
        System.err.println("have name is = ");
        List<Student> studentList = sr.getNameU(name);
        for (Student x : studentList)
            output(x);
    }

    @Override // tìm kiếm theo id student join 2 bảng
    public void searchIDStudent() throws SQLException {
        StudentRepository sr = new StudentRepository();
        int id = new Scanner(System.in).nextInt();
        System.err.println("have id is " + id + " : ");
        List<Student> studentList = sr.getidS(id);
        for (Student x : studentList)
            output(x);
    }
}
