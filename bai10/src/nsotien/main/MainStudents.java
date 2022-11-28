package nsotien.main;

import nsotien.model.cau3.Student;
import nsotien.service.StudenImpl;

import java.util.Scanner;

public class MainStudents {
    public static void main(String[] args) {
        StudenImpl sm = new StudenImpl();
        System.out.println("n = ");
        int n = new Scanner(System.in).nextInt();
        Student[] studentArr = new Student[n];
        for (int i = 0; i < n; i++) {
            studentArr[i] = new Student();

            sm.input(studentArr[i]);
        }
        for (Student s : studentArr) {
            sm.output(s);
        }

        /**
         * age >>>
         */
        Student max = studentArr[0];
        System.out.println("Sinh Vien age >>>>>");
        for (int i = 0;i < studentArr.length;i++){
            if (studentArr[i].getAge() == max.getAge()){
                sm.output(studentArr[i]);
            }
        }

    }
}
