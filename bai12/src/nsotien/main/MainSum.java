package nsotien.main;/*
java by nsotien tv .......
Name : nsotien
Time : 4:33 PM
Date : 10/25/22
*/

import java.util.Scanner;

public class MainSum {


    public static void main(String[] args) {

        while (true) {
            try {
                System.out.println("x = ");
                int x = new Scanner(System.in).nextInt();

                System.out.println("y = ");
                int y = new Scanner(System.in).nextInt();
                System.out.println("KQ : ");
                int sum = x + y;
                System.out.println(sum);
                break;
            } catch (Exception ex) {
                ex.printStackTrace();
                System.out.println("x or y = number ");
            }
        }
    }


}
