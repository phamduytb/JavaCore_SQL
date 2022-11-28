package nsotien.main;

import nsotien.model.Car;
import nsotien.model.Means;
import nsotien.model.Train;
import nsotien.service.MeanService;

import java.util.Scanner;

public class MainMeans {
    public static void main(String[] args) {
        MeanService ms = new MeanService();
        while (true) {
            System.out.println("MENU>>>>");
            System.out.println("1. Train");
            System.out.println("2. Car");
            System.out.println("3. OUT");
            int luaChon = new Scanner(System.in).nextInt();

            if (luaChon == 1) {
                Means m1 = new Train();
                System.out.println("import train :");
                ms.input(m1);
                ms.output(m1);
            } else if (luaChon == 2) {
                Means m2 = new Car();
                System.out.println("import car :");
                ms.input(m2);
                ms.output(m2);
            } else if (luaChon==3)
                break;

        }
    }
}
