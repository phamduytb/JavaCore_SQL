package nsotien.sevice;

import java.util.Scanner;

public class Teacher  {
    private int id;
    private String name;
    private String address;
    private String facility;

    public void input() {
        Scanner nst1 = new Scanner(System.in);
        System.out.println("nhap id");
        id = nst1.nextInt();

        Scanner nst2 = new Scanner(System.in);
        System.out.println("nhap name");
        name = nst2.nextLine();

        Scanner nst3 = new Scanner(System.in);
        System.out.println("nhap address");
        address = nst3.nextLine();

        Scanner nst4 = new Scanner(System.in);
        System.out.println("nhap facility");
        facility = nst4.nextLine();
    }

    public void output() {
        System.out.println("information is teacher : ");
        System.out.println(id);
        System.out.println(name);
        System.out.println(address);
        System.out.println(facility);

    }

    public Teacher() {

    }

    public Teacher(int id, String name, String address, String facility) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.facility = facility;
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

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }
}
