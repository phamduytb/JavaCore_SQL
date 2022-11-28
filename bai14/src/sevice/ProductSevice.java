package sevice;/*
java by nsotien tv .......
Name : nsotien
Time : 13:15
Date : 28/11/2022
*/

import entity.Product;

import java.util.Scanner;

public class ProductSevice {
    public void input(Product product) {
        System.out.println("id :");
        product.setId(new Scanner(System.in).nextInt());
        System.out.println("name :");
        product.setName(new Scanner(System.in).nextLine());
        System.out.println("price :");
        product.setPrice(new Scanner(System.in).nextDouble());
    }
    public void output(Product product) {
        System.out.println("id = " + product.getId());
        System.out.println("name = " + product.getName());
        System.out.println("price = " + product.getPrice());
    }
}
