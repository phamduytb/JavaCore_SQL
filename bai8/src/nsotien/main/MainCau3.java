package nsotien.main;

import nsotien.model.Category;
import nsotien.model.Product;

import java.util.Scanner;

public class MainCau3 {
    public static void main(String[] args) {
        Category cg = new Category();
        cg.input();

        System.out.println("n :");
        int n = new Scanner(System.in).nextInt();
        Product[] productArr = new Product[n];

        for (int i = 0; i < productArr.length; i++) {
            System.out.println("price " + i);
            productArr[i] = new Product();
            productArr[i].input();
            productArr[i].setCategory(cg);
        }
        System.out.println("information");
        for (Product p : productArr) {
            p.getCategory().output();
            p.output();
        }

    }
}
