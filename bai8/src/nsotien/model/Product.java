package nsotien.model;

import java.util.Scanner;

//sản phẩm
public class Product {
    private double price;
    private Category category;

    public void input() {
        System.out.println("price :");
        price = new Scanner(System.in).nextDouble();
    }

    public void output() {
        System.out.println("price = " + price);
    }

    public Product() {
    }

    public Product(double price, Category category) {
        this.price = price;
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
