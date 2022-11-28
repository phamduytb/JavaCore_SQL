package sevice;/*
java by nsotien tv .......
Name : nsotien
Time : 16:17
Date : 21/11/2022
*/

import entity.Category;
import entity.Product;
import repository.JDBC;
import repository.ProductRepository;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductImpl implements ProductInterface {
    @Override
    public void input(Product product) throws SQLException {
        System.out.println("name : ");
        product.setName(new Scanner(System.in).nextLine());
        System.out.println("quantity : ");
        product.setQuantity(new Scanner(System.in).nextInt());
        System.out.println("price : ");
        product.setPrice(new Scanner(System.in).nextDouble());
        while (true) {
            ProductRepository productRepository = new ProductRepository();
            System.out.println("id category : ");
            int id = new Scanner(System.in).nextInt();
            Category category = productRepository.getIdCategory(id);
            if (category != null) {
                product.setCategory(category);
                break;
            } else
                System.out.println("id category ko co");
            break;
        }
    }

    public void input01(Product product) throws SQLException {
        System.out.println("id : ");
        product.setId(new Scanner(System.in).nextInt());
        System.out.println("name : ");
        product.setName(new Scanner(System.in).nextLine());
        System.out.println("quantity : ");
        product.setQuantity(new Scanner(System.in).nextInt());
        System.out.println("price : ");
        product.setPrice(new Scanner(System.in).nextDouble());
        while (true) {
            ProductRepository productRepository = new ProductRepository();
            System.out.println("id category : ");
            int id = new Scanner(System.in).nextInt();
            Category category = productRepository.getIdCategory(id);
            if (category != null) {
                product.setCategory(category);
                break;
            } else
                System.out.println("id category ko co");
            break;
        }
    }


    @Override
    public void output(Product product) throws SQLException {

        System.out.println("name = " + product.getName());
        System.out.println("quantity = " + product.getQuantity());
        System.out.println("price = " + product.getPrice());
        CategoryImpl categoryimpl = new CategoryImpl();
        categoryimpl.output(product.getCategory());
    }

    public void output01(Product product) throws SQLException {
        System.out.println("id = " + product.getId());
        System.out.println("name = " + product.getName());
        System.out.println("quantity = " + product.getQuantity());
        System.out.println("price = " + product.getPrice());
    }


    @Override
    public void createProductSevice() throws SQLException {
        ProductRepository productRepository = new ProductRepository();
        Product product = new Product();
        input(product);
        productRepository.createProduct();
    }

    @Override
    public void updateProductSevice() throws SQLException {
        ProductRepository productRepository = new ProductRepository();
        Product product = new Product();
        input01(product);
        productRepository.updateProduct();
    }

    @Override
    public void deleteProductSevice() throws SQLException {
        ProductRepository productRepository = new ProductRepository();
        int id = new Scanner(System.in).nextInt();
        productRepository.deleteProduct(id);
    }

    @Override
    public void searchProductSevice() throws SQLException {
        ProductRepository productRepository = new ProductRepository();
        String name = new Scanner(System.in).nextLine();
        List<Product> productList = productRepository.searchProduct(name);
        System.out.println("have name " + name);
        for (Product p : productList)
            output(p);
    }
}
