package baitap.entity;/*
java by nsotien tv .......
Name : nsotien
Time : 08:14
Date : 07/11/2022
*/

public class Student {
    private int id;
    private String name;
    private int age;
    private University university;

    public Student() {
    }

    public Student(int id, String name, int age, University university) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.university = university;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }
}
