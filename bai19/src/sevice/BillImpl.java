package sevice;/*
java by nsotien tv .......
Name : nsotien
Time : 16:17
Date : 21/11/2022
*/

import entity.Bill;
import entity.Product;
import repository.BillRepository;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BillImpl implements BillInterface {
    @Override
    public void input(Bill bill) throws SQLException {
// input id product
        while (true) {
            BillRepository billRepository = new BillRepository();
            System.out.println("id product :");
            int id = new Scanner(System.in).nextInt();
            bill.setProduct(billRepository.getIdProduct(id));
            if (bill.getProduct() != null) {
                break;
            } else
                System.out.println("k co id product");
        }
// input quantity product
        while (true) {
            BillRepository billRepository = new BillRepository();
            System.out.println("quantity product :");
            bill.setQuantity(new Scanner(System.in).nextInt());
            if (bill.getQuantity() > bill.getProduct().getQuantity()) {
                System.out.println("k du so luong");
            } else
                break;
        }
// input buydate
        try {
            System.out.println("buydate product :");
            String buydate = new Scanner(System.in).nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            bill.setBuyDate(sdf.parse(buydate));
        } catch (ParseException pe) {
            System.out.println("sai dinh dang ngay");
        }
// output price product
        bill.setPrice(bill.getProduct().getPrice());


    }

    @Override
    public void output(Bill bill) throws SQLException {
        System.out.println("id bill = " + bill.getId());
        System.out.println("quantity bill = " + bill.getId());
        System.out.println("price bill = " + bill.getId());
        if (bill.getBuyDate() != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("buydate = " + sdf.format(bill.getBuyDate()));
        }
        ProductImpl product = new ProductImpl();
        product.output(bill.getProduct());

    }

    @Override
    public void checkBillSevice() throws SQLException {

    }

    @Override
    public void createBillSevice() throws SQLException {
        BillRepository billRepository = new BillRepository();
        Bill bill = new Bill();
        input(bill);
        billRepository.createBill(bill);
    }

    @Override
    public void loadBillSevice() throws SQLException {

    }

    @Override
    public void searchBillSevice() throws SQLException {
        BillRepository billRepository = new BillRepository();
        Date from = new Date();
        Date to = new Date();
        // date from
        while (true) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                System.out.print("Nhap ngay from (dd/MM/yyyy): ");
                from = dateFormat.parse(new Scanner(System.in).nextLine());
                break;
            } catch (ParseException ex) {
                System.out.println("Nhap lai ngay");
            }
        }
        // date to
        while (true) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                System.out.print("Nhap ngay to (dd/MM/yyyy): ");
                to = dateFormat.parse(new Scanner(System.in).nextLine());
                break;
            } catch (ParseException ex) {
                System.out.println("Nhap lai ngay");
            }
        }

        List<Bill> bills = billRepository.findBuyDate((java.sql.Date) from, (java.sql.Date) to);
        for (Bill bill : bills)
            output(bill);

    }
}
