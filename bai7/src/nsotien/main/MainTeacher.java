package nsotien.main;

import nsotien.model.cau1.Teacher;

import java.util.Scanner;

public class MainTeacher {
    public static void main(String[] args) {
        System.out.println("m = ");
        int m = new Scanner(System.in).nextInt();
        Teacher[] t = new Teacher[m];

        for (int i = 0; i < t.length; i++) {
            t[i] = new Teacher();
            t[i].input();
        }

        for (Teacher x : t) {
            System.out.println("info");
            x.output();
        }
    }
}
