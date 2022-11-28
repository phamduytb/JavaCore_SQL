package sevice;/*
java by nsotien tv .......
Name : nsotien
Time : 16:07
Date : 21/11/2022
*/

import entity.Product;

import java.sql.SQLException;

public interface ProductInterface {
    void input(Product product) throws SQLException;

    void output(Product product) throws SQLException;

    void createProductSevice() throws SQLException;

    void updateProductSevice() throws SQLException;

    void deleteProductSevice() throws SQLException;

    void searchProductSevice() throws SQLException;
}
