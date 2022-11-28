package entity;/*
java by nsotien tv .......
Name : nsotien
Time : 16:08
Date : 21/11/2022
*/

import java.util.Date;

public class Bill {
    private int id;
    private int quantity;
    private double price;
    private Date buyDate;
    private Product product;

    public Bill() {
    }

    public Bill(int id, int quantity, double price, Date buyDate, Product product) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.buyDate = buyDate;
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(Date buyDate) {
        this.buyDate = buyDate;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
