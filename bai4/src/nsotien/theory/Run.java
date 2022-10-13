package nsotien.theory;

import java.util.Scanner;

public class Run {
    public static void main(String args[]) {
        validateVTPhone("0984758874");
    }

    public static boolean validateVTPhone(String phone) {
        if (phone.length() == 10) {
            String preFix = phone.substring(0, 3);
            if (preFix.equals("097") || preFix.equals("098")) {


                for (int i = 0; i < phone.length(); i++) {
                    char c = phone.charAt(i);
                    if (!(c == '0' || c == '1' || c == '2' || c == '3'
                            || c == '4' || c == '5' || c == '6' || c == '7'
                            || c == '8' || c == '9')) {
                        return false;
                    }
                }

                return true;
            }
        }
        return false;
    }
}

