package main;/*
java by nsotien tv .......
Name : nsotien
Time : 12:40
Date : 28/11/2022
*/

import entity.Product;
import sevice.ProductSevice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cau2Main {

    public static void main(String[] args) {
        Cau2Main cau2Main = new Cau2Main();
        cau2Main.writeProduct();
        cau2Main.readProduct();
    }

    public void writeProduct() {
        try {
            Product product1 = new Product(1, "drink", 5.6);
            Product product2 = new Product(2, "food", 7);
            Product product3 = new Product(3, "book", 5.9);
            List<Product> productList = new ArrayList<>();
            productList.add(product1);
            productList.add(product2);
            productList.add(product3);
            FileWriter fileWriter = new FileWriter("product.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Product p : productList) {
                bufferedWriter.write(p.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void readProduct() {
        try {
            FileReader fileReader = new FileReader("product.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while (true) {
                line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
