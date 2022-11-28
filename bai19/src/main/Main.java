package main;/*
java by nsotien tv .......
Name : nsotien
Time : 16:07
Date : 21/11/2022
*/

import entity.Product;
import sevice.BillImpl;
import sevice.ProductImpl;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("menu....");
            System.out.println("1. create product ");
            System.out.println("2. update product ");
            System.out.println("3. delete product ");
            System.out.println("4. search name product ");
            System.out.println("5. buy product - create bill ");
            System.out.println("6. find buydate product ");
            System.out.println("7. out ");
            int luaChon = new Scanner(System.in).nextInt();
            ProductImpl productimpl = new ProductImpl();
            BillImpl billimpl = new BillImpl();
            try {
                if (luaChon == 1) {
                    productimpl.createProductSevice();
                    System.err.println("create product succeed");
                } else if (luaChon == 2) {
                    productimpl.updateProductSevice();
                    System.err.println("update product succeed");
                } else if (luaChon == 3) {
                    System.out.println("delete id : ");
                    productimpl.deleteProductSevice();
                    System.err.println("delete product succeed");
                } else if (luaChon == 4) {
                    productimpl.searchProductSevice();
                    System.err.println("search name product succeed");
                } else if (luaChon == 5) {
                    billimpl.createBillSevice();
                    System.err.println("create bill succeed");
                } else if (luaChon == 6) {
                    billimpl.searchBillSevice();
                    System.err.println("find buydate product succeed");
                } else if (luaChon == 7) {
                    break;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
