package nsotien.model;

import java.util.Scanner;

public class Person {
    private int age;
    private String name;
    private House[] houses;
    private Car[] cars;
    private Countries countries;


    public void input() {
        System.out.println("enter the following");
        System.out.println("age :");
        age = new Scanner(System.in).nextInt();

        System.out.println("name :");
        name = new Scanner(System.in).nextLine();
    }

    public void output() {
        System.out.println("age = " + age);
        System.out.println("name = " + name);
    }

    public Person() {
    }

    public Person(int age, String name, Countries countries) {
        this.age = age;
        this.name = name;
        this.countries = countries;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Countries getCountries() {
        return countries;
    }

    public void setCountries(Countries countries) {
        this.countries = countries;
    }

    public House[] getHouses() {
        return houses;
    }

    public void setHouses(House[] houses) {
        this.houses = houses;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }
}
