package nsotien.bai6.model;

import java.util.Scanner;

public class School {
    private int id;
    private String name;
    private String adress;


    public void input() {
        Scanner nst1 = new Scanner(System.in);
        System.out.println("id =");
        id = nst1.nextInt();

        Scanner nst2 = new Scanner(System.in);
        System.out.println("name =");
        name = nst2.nextLine();

        Scanner nst3 = new Scanner(System.in);
        System.out.println("adress =");
        adress = nst3.nextLine();
    }

    public void output() {
        System.out.println("information");
        System.out.println(id);
        System.out.println(name);
        System.out.println(adress);

    }

    public School() {
    }

    public School(int id, String name, String adress) {
        this.id = id;
        this.name = name;
        this.adress = adress;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
