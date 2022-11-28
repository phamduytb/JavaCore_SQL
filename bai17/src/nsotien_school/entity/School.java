package nsotien_school.entity;/*
java by nsotien tv .......
Name : nsotien
Time : 10:03
Date : 08/11/2022
*/

public class School {
    private int id;
    private String name;
    private String address;

    public School() {
    }

    public School(int id, String name, String address) {
        this.id = id;
        this.name = name;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
