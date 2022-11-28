package nsotien.model;/*
java by nsotien tv .......
Name : nsotien
Time : 4:24 PM
Date : 10/25/22
*/

public class Employee {
    private int id;
    private String name;

    public void salary() {
        System.out.println("money = 50_000_000");
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
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
}
