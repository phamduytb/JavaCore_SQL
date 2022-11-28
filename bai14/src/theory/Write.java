package theory;/*
java by nsotien tv .......
Name : nsotien
Time : 12:24
Date : 28/11/2022
*/

import entity.Product;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Write {
    public static void main(String[] args) {

        String txt = "test";
        String [] arr = {"a","b","c"};
        Product product1 = new Product(1,"drink",5.6);
        Product product2 = new Product(2,"food",7);
        Product product3 = new Product(3,"book",5.9);
        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        try{
            FileWriter fileWriter = new FileWriter("test.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Product p : productList) {
                bufferedWriter.write(p.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
