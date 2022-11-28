package nsotien.main;/*
java by nsotien tv .......
Name : nsotien
Time : 3:16 PM
Date : 10/29/22
*/

import nsotien.model.Person;
import nsotien.sevice.ListExamSeviceIml;

import java.util.List;

public class MainExam {
    public static void main(String[] args) {
        ListExamSeviceIml lesi = new ListExamSeviceIml();
        lesi.input();
        // cau 1
        lesi.output();
        // cau 2
        lesi.filter();
    }
}
