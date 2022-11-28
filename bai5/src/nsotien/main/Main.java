package nsotien.main;

import nsotien.entity.Chair;
import nsotien.entity.Laptop;
import nsotien.entity.Table;

import nsotien.sevice.Student;
import nsotien.sevice.Teacher;

import nsotien.sevice.CourseScore;

public class Main {
    public static void main(String[] args) {
/**
 * cau 1
 */
        Laptop l = new Laptop("red", "VN", 500, 1999);
        System.out.println(l.getYear());
        System.out.println(l.getColor());
        System.out.println(".....");

        Table t = new Table();
        t.setColor("black");
        t.setStuff("lim");
        System.out.println(t.getColor());
        System.out.println(t.getStuff());
        System.out.println(".....");


        Chair c = new Chair();
        c.setProducer("USA");
        c.setPrince(200);
        System.out.println(c.getProducer());
        System.out.println(c.getPrince());
        System.out.println(".....");
/**
 * cau 2
 */
        Student s = new Student();
        System.out.println("student");
        s.input();
        s.output();

        Teacher tr = new Teacher();
        System.out.println("teacher");
        tr.input();
        tr.output();

        /**
         * cau 3
         */
        CourseScore cs = new CourseScore();
        System.out.println("CourseScore");
        cs.input();
        cs.output();
    }
}