package nsotien.theory;

import java.util.Scanner;

public class Mang {
    public static void main(String[] args) {
        array();
    }

    public static void array() {
//        int[] arrays = new int[2];
        int[] arrays = {1, 2, 3};
//        System.out.println(arrays.length);
//        for (int i = 0; i < arrays.length; i++) {
//            System.out.println(i);
//            arrays[i] = new Scanner(System.in).nextInt();
//        }
//        for (int j = 0;j < arrays.length;j++) {
//            System.out.println(arrays[j]);
//        }
//        for (int j : arrays){
//            System.out.println(j);
//        }
        int sum = 0;
        for (int k = 0; k < arrays.length; k++) {
            sum += arrays[k];

        }
        System.out.println("tong la" + sum);

        int min = arrays[0];
        for (int t = 1; t < arrays.length; t++) {
            if (min > arrays[t]) {
                min = arrays[t];
            }
            System.out.println(min);
for (int i = 0;i < arrays.length - 1;i++){
    for (int j = i +1;j < arrays.length;j++) {
        if (arrays[i] < arrays[j]) {
            int k = arrays[i];
            arrays[j] = k ;
        }
    }
        }

    }
}

        }

