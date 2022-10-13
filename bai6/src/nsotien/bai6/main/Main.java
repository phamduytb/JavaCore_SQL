package nsotien.bai6.main;

import java.util.Scanner;

import nsotien.bai6.model.School;

public class Main {

    
    public static void main(String[] args) {
        System.out.println("infomation student");
        System.out.println("n = ");
        int n = new Scanner(System.in).nextInt();
        School[] sc = new School[n];

        for (int i = 0; i < sc.length; i++) {
            sc[i] = new School();
            sc[i].input();
        }

        for (School x : sc) {
            x.output();
        }
/**
 * chứa tên trường
 */
        System.out.println("find name school");
        String check = new Scanner(System.in).nextLine();
        for (School x : sc) {
            if (x.getName().contains(check)) {
                x.output();
            } else
                System.out.println("null");
        }
    }
}

