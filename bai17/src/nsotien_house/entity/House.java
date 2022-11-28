package nsotien_house.entity;/*
java by nsotien tv .......
Name : nsotien
Time : 09:03
Date : 08/11/2022
*/

public class House {
    private int id;
    private String name;

    private String color;

    private String address;

    public House() {
    }

    public House(int id, String name, String color, String address) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
