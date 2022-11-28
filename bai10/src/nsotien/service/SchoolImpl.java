package nsotien.service;

import nsotien.model.cau3.School;

import java.util.Scanner;

public class SchoolImpl implements SchoolService {

    @Override
    public void input(School sl) {
        System.out.println("id school :");
        sl.setId(new Scanner(System.in).nextInt());
        System.out.println("name school :");
        sl.setName(new Scanner(System.in).nextLine());
    }

    @Override
    public void output(School sl) {
        System.out.println("id school = " + sl.getId());
        System.out.println("name school = " + sl.getName());
    }
}
