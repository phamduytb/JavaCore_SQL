package nsotien.baitap;

import java.util.Scanner;

public class Mang {
    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;
        System.out.println("n = ");
        int n = new Scanner(System.in).nextInt();
        int[] array = new int[n];
        System.out.println("nhap cac phan tu trong mang");
        for (int i = 0; i < array.length; i++) {
            array[i] = new Scanner(System.in).nextInt();

        }

        for (int x : array) {
            System.out.println(x);
            sum += x;
            mul *= x;
        }
        System.out.println("tong = " + sum);
        System.out.println("tich = " + mul);
        /**
         * tang dan
         */

        for (int i = 0; i < 5 ; i++) {
            int min = i;

            for (int j = i + 1; j < 5; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
                for (int x : array) {

                    System.out.println(x);
                }




    }

    }

}
