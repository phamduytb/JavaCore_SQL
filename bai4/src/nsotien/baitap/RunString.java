package nsotien.baitap;

import javax.sound.midi.MidiFileFormat;
import java.util.Scanner;

public class RunString {
    public static void main(String[] args) {
        System.out.println("text input 1 : "); // ABCD
        String string1 = new Scanner(System.in).nextLine();

        System.out.println(string1.length()); //cau1

        System.out.println("text input 2 : ");
        String string2 = new Scanner(System.in).nextLine();

        System.out.println(string1.contains(string2)); //cau2

        char x = 'A';
        int count = 0;
        for (int i = 0; i < string1.length(); i++) {
            if (string1.charAt(i) == x) {
                count++;
            }
        }
        System.out.println(count);  //cau3

        String[] text = string1.split("\\s");
        for (String y : text) {
            System.out.println(y);  //cau4
        }


        System.out.println("nhap sdt");
        String s3 = new Scanner(System.in).nextLine();
        if (checkPhone(s3)) {
            System.out.println("sdt ban la :" + nhaMang(s3));
        } else
            System.out.println("sdt ban nhap sai");

    }

    /**
     * cau5
     *
     * @param phone
     * @return
     */
    public static boolean checkPhone(String phone) {
        if (phone.charAt(0) == '0' && phone.length() == 10) {
            for (int i = 0; i < phone.length(); i++) {
                char a = phone.charAt(i);
                if (!(a == '0' || a == '1' || a == '2' || a == '3' ||
                        a == '4' || a == '5' || a == '6' || a == '7' ||
                        a == '8' || a == '9')) {
                    return false;
                }
            }
            return true ;
        }
        return false;
    }

    public static String nhaMang(String phone) {
        String ss = phone.substring(0, 3);
        if (ss.equals("097") || ss.equals("098")) {
            return "vetel";
        } else if (ss.equals("095") || ss.equals("094")) {
            return "vina";
        }
        return "uknow";
    }
}
