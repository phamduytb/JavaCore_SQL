package nsotien.main;

import nsotien.model.cau1.Student;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        System.out.println("n = ");
        int n = new Scanner(System.in).nextInt();
        Student[] s = new Student[n];

        for (int i = 0; i < s.length; i++) {
            s[i] = new Student();
            s[i].input();
        }

        for (Student x : s) {
            System.out.println("info");
            x.output();
        }
    }
}
