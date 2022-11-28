package nsotien.car_person.entity;/*
java by nsotien tv .......
Name : nsotien
Time : 19:28
Date : 10/11/2022
*/

import java.util.Date;

public class Person {
    private int id;
    private String name;
    private int age;
    private String country;
    private Date birthdate;

    public Person() {
    }

    public Person(int id, String name, int age, String country, Date birthdate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.country = country;
        this.birthdate = birthdate;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}

