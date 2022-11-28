package nsotien.main;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        System.out.println("a = ");
        int a = new Scanner(System.in).nextInt();
        double x = nst1(a);
        System.out.println(x);
        double y = nst2(a);
        System.out.println(y);
        double z = nst3(a);
        System.out.println(z);
    }

    public static double nst1(double a) {
        return Math.sqrt(a);
    }

    public static double nst2(double a) {
        return Math.pow(a, 2);
    }

    public static double nst3(double a) {
        return Math.PI * a;

    }

}
