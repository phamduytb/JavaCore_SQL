package nsotien.baitap;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        System.out.println("menu hom nay");
        System.out.println("0 . bun");
        System.out.println("1 . pho");
        System.out.println("2 . mien");
        System.out.println("3 . chao");
        System.out.println("moi ban chon so mon ");
        int a = new Scanner(System.in).nextInt();
        switch (a) {
            case 0:
                System.out.println("oder bun");
                break;
            case 1:
                System.out.println("oder pho");
                break;
            case 2:
                System.out.println("oder mien");
                break;
            case 3:
                System.out.println("oder chao");
                break;
            default:
                System.out.println("chon sai");
        }


    }
}
