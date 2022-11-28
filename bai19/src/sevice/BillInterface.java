package sevice;/*
java by nsotien tv .......
Name : nsotien
Time : 16:08
Date : 21/11/2022
*/

import entity.Bill;

import java.sql.SQLException;

public interface BillInterface {
    void input(Bill bill) throws SQLException;

    void output(Bill bill) throws SQLException;

    void checkBillSevice() throws SQLException;

    void createBillSevice() throws SQLException;

    void loadBillSevice() throws SQLException;

    void searchBillSevice() throws SQLException;
}
