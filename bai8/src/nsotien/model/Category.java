package nsotien.model;

import java.util.Scanner;

//thứ hạng
public class Category {
    private int id;
    private String name;
    private Product[] products;

    public void input() {
        System.out.println("id :");
        id = new Scanner(System.in).nextInt();

        System.out.println("name :");
        name = new Scanner(System.in).nextLine();
    }

    public void output() {
        System.out.println("id = " + id);
        System.out.println("name = " + name);
    }

    public Category() {
    }

    public Category(int id, String name) {
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

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
}
