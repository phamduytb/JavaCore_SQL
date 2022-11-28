package nsotien.main;

import nsotien.model.Countries;
import nsotien.model.Person;

import java.util.Scanner;

public class MainCau2 {
    public static void main(String[] args) {
        Countries c = new Countries();
        c.input();
        System.out.println("n = ....");
        int n = new Scanner(System.in).nextInt();
        Person[] personArr = new Person[n];

        for (int i = 0; i < personArr.length; i++) {
            personArr[i] = new Person();
            personArr[i].input();
            personArr[i].setCountries(c);
        }
        System.out.println("infomation");
        for (Person p : personArr) {
            p.output();
            p.getCountries().output();
        }
    }
}
