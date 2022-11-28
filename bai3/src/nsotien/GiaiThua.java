package nsotien.baitap;

import java.util.Scanner;

public class GiaiThua {
    public static void main(String[] args) {
        System.out.println("n = ");
        int n = new Scanner(System.in).nextInt();
        int nul = 1;
        for (int i = 1;i <= n;i++) {
            nul *= i ;
        }
        System.out.println(nul);
    }
}
