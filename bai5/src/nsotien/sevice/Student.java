package nsotien.sevice;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private String address;
    private String major;

    public void input() {

        System.out.println("nhap id");
        id = new Scanner(System.in).nextInt();

        System.out.println("nhap name");
        name = new Scanner(System.in).nextLine();

        System.out.println("nhap address");
        address = new Scanner(System.in).nextLine();

        System.out.println("nhap major");
        major = new Scanner(System.in).nextLine();
    }

    public void output() {
        System.out.println("information is student : ");
        System.out.println(id);
        System.out.println(name);
        System.out.println(address);
        System.out.println(major);

    }

    public Student() {

    }

    public Student(int id, String name, String address, String major) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.major = major;
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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }


}
