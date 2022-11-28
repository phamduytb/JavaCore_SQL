package nsotien.baitap;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {


        while (true) {
            System.out.println("menu");
            System.out.println("1. bun");
            System.out.println("2. mien");
            System.out.println("3. com");
            System.out.println("4. pho");
            int a = new Scanner(System.in).nextInt();
            if (a == 1) {
                System.out.println("bun");
                break;
            } else if (a == 2) {
                System.out.println("mien");
                break;
            } else if (a == 3) {
                System.out.println("com");
                break;
            } else if (a == 4) {
                System.out.println("pho");
                break;
            } else {
                System.out.println("moi ban chon lai");

            }

        }
    }
}
