package nsotien_house.main;/*
java by nsotien tv .......
Name : nsotien
Time : 09:04
Date : 08/11/2022
*/

import nsotien_house.sevice.HouseIml;

import java.sql.SQLException;
import java.util.Scanner;

public class MainHouse {
    public static void main(String[] args) {
        while (true) {
            HouseIml di = new HouseIml();
            System.err.println("menu ....");
            System.out.println("1.create ....");
            System.out.println("2.update ....");
            System.out.println("3.delete ....");
            System.out.println("4.search ....");
            System.out.println("5.read ....");
            System.out.println("6.out ....");
            int luachon = new Scanner(System.in).nextInt();
            if (luachon == 1) {
                try {
                    di.createHouse();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else if (luachon == 2) {
                try {
                    di.updateHouse();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else if (luachon == 3) {
                try {
                    di.deleteHouse();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else if (luachon == 4) {
                try {
                    di.searchHouse();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else if (luachon == 5) {
                try {
                    di.readHouse();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else if (luachon == 6) {
                break;
            }
        }
    }
}
