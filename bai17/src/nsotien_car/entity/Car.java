package nsotien_car.entity;/*
java by nsotien tv .......
Name : nsotien
Time : 07:52
Date : 08/11/2022
*/

public class Car {
    private int id;
    private String name;
    private String color;
    private double prince;

    public Car() {
    }

    public Car(int id, String name, String color, double prince) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.prince = prince;
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

    public double getPrince() {
        return prince;
    }

    public void setPrince(double prince) {
        this.prince = prince;
    }
}
