package nsotien.theory;

import java.util.Scanner;

public class JvString {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        if (phone(s)) {
            System.out.println(s + " hop le");

            String provider = checkPhone(s);
            System.out.println(provider);
        } else System.out.println(s + " null");


    }

    public static String checkPhone(String p) {
        String prefix = p.substring(0, 3);

        if (prefix.equals("098") || prefix.equals("097")) {
            return "vetel";
        } else if (prefix.equals("091")) {
            return "vina";
        } else
            return "mobi";

    }

    public static boolean phone(String p) {
        if (p.length() == 10) {
            char x = p.charAt(0);
            if (x == '0') {
                for (int i = 1; i < p.length(); i++) {
                    char c = p.charAt(i);
                    if (c >= '0' && c <= '9') {
                        return true;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
