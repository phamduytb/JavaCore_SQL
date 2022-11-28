package nsotien_house.sevice;/*
java by nsotien tv .......
Name : nsotien
Time : 09:07
Date : 08/11/2022
*/

import nsotien_house.entity.House;
import nsotien_house.repository.HouseRepository;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class HouseIml implements HouseInterface {
    @Override
    public void input(House h) {
        System.out.println("id = ");
        h.setId(new Scanner(System.in).nextInt());
        System.out.println("name = ");
        h.setName(new Scanner(System.in).nextLine());
        System.out.println("color = ");
        h.setColor(new Scanner(System.in).nextLine());
        System.out.println("address = ");
        h.setAddress(new Scanner(System.in).nextLine());
    }

    @Override
    public void output(House h) {
        System.out.println("id :" + h.getId());
        System.out.println("name :" + h.getName());
        System.out.println("color :" + h.getColor());
        System.out.println("address :" + h.getAddress());
    }

    @Override
    public void createHouse() throws SQLException {
        HouseRepository hr = new HouseRepository();
        House h = new House();
        System.out.println("create info :");
        input(h);
        hr.create(h);
        System.err.println("create succeed");
    }

    @Override
    public void updateHouse() throws SQLException {
        HouseRepository hr = new HouseRepository();
        House h = new House();
        System.out.println("update name,weight,age by id :");
        input(h);
        hr.update(h);
        System.err.println("update succeed");
    }

    @Override
    public void deleteHouse() throws SQLException {
        HouseRepository hr = new HouseRepository();
        System.out.println("id delete :");
        int id = new Scanner(System.in).nextInt();
        hr.delete(id);
        System.err.println("delete succeed");
    }

    @Override
    public void searchHouse() throws SQLException {
        HouseRepository hr = new HouseRepository();
        System.out.println("search address = ");
        String address = new Scanner(System.in).nextLine();
        System.out.println("infor have address " + address + " : ");
        List<House> houseList = hr.search(address);
        for (House x : houseList)
            output(x);
        System.err.println("search succeed");
    }

    @Override
    public void readHouse() throws SQLException {
        HouseRepository hr = new HouseRepository();
        System.out.println("info dog = ");
        List<House> houseList = hr.read();
        for (House x : houseList)
            output(x);
    }
}
