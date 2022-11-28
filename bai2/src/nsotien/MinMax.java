package nsotien.baitap;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        System.out.println("a =");
        int a = new Scanner(System.in).nextInt();
        System.out.println("b =");
        int b = new Scanner(System.in).nextInt();
        System.out.println("c =");
        int c = new Scanner(System.in).nextInt();
        //a = 1,b = 2,c = 3
        double max = (a > b) ? a : b;
        max = (max > c) ? max : c;
        System.out.println(max);

        double min = (a < b) ? a : b;
        min = (min < c) ? min : c;
        System.out.println(min);
    }

//    public static void check(int a,int b,int c){
//        return;
//    }

}
