package nsotien.main;/*
java by nsotien tv .......
Name : nsotien
Time : 4:50 PM
Date : 10/25/22
*/

import nsotien.model.ZeroException;

public class MainZero {
    public static void main(String[] args) {
        try {
            thuong(5, 0);
        } catch (ZeroException z) {
            z.setEurro("eurro : b = 0");
            System.out.println(z.getEurro());
        }
    }

    public static void thuong(int a, int b) throws ZeroException {
        try {
            System.out.println("KQ = " + a / b);
        } catch (Exception e) {
            throw new ZeroException("...");
        }
    }
}
