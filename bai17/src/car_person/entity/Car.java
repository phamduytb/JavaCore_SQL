package nsotien.car_person.entity;/*
java by nsotien tv .......
Name : nsotien
Time : 19:26
Date : 10/11/2022
*/

import nsotien.car_person.entity.Person;

public class Car {
    private int id;
    private String name;
    private String color;

    private double price;
    private Person personOwner;

    public Car() {
    }

    public Car(int id, String name, String color, double price, Person personOwner) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.price = price;
        this.personOwner = personOwner;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Person getPersonOwner() {
        return personOwner;
    }

    public void setPersonOwner(Person personOwner) {
        this.personOwner = personOwner;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
