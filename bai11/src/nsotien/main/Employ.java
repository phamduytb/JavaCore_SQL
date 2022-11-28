package nsotien.main;/*
java by nsotien tv .......
Name : nsotien
Time : 4:25 PM
Date : 10/25/22
*/

import nsotien.model.Employee;

public class Employ {
    public static void main(String[] args) {
        Employee e = new Employee(2, "nsotien") {
            @Override
            public void salary() {
                System.out.println("money = 10_000_000");
            }
        };
        System.out.println("id =" + e.getId());
        System.out.println("name =" + e.getName());
        e.salary();

    }
}
