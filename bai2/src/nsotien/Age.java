package nsotien.baitap

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {

        System.out.println("nhap so tuoi");
        int age = new Scanner(System.in).nextInt();
        if (age < 1) {
            System.out.println("so sinh");
        } else if (age >= 1 && age <= 3) {
            System.out.println("em be");
        } else if (age > 3 && age <= 18) {
            System.out.println("tre em");
        } else if (age > 18 && age <= 60) {
            System.out.println("nguoi lon");
        } else {
            System.out.println("null");
        }
    }
}
