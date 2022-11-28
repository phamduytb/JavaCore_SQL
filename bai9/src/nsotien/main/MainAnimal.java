package nsotien.main;

import nsotien.model.Animal;
import nsotien.model.Chicken;
import nsotien.model.Dog;

import java.util.Scanner;

public class MainAnimal {
    public static void main(String[] args) {


        while (true) {
            System.out.println("MENU>>>>>");
            System.out.println("1. DOG");
            System.out.println("2. CHICKEN");
            System.out.println("3. OUT");
            int luaChon = new Scanner(System.in).nextInt();
            if (luaChon == 1) {
                System.out.println("n(dog[]) :");
                int n = new Scanner(System.in).nextInt();
                Animal[] dArr = new Dog[n];
                for (int i = 0; i < dArr.length; i++) {
                    dArr[i] = new Dog();
                    input(dArr[i]);
                }
                System.out.println("information dog : ");
                for (Animal d : dArr) {
                    output(d);
                }
            } else if (luaChon == 2) {
                System.out.println("m(chicken[]) :");
                int m = new Scanner(System.in).nextInt();
                Animal[] cArr = new Chicken[m];
                for (int i = 0; i < cArr.length; i++) {
                    cArr[i] = new Chicken();
                    input(cArr[i]);
                }
                System.out.println("information chicken : ");
                for (Animal c : cArr) {
                    output(c);
                }
            } else if (luaChon == 3) {
                break;
            } else
                System.out.println("CHON LAI");

        }

    }

    public static void input(Animal animal) {
        Scanner sc = new Scanner(System.in);
        System.out.println("id :");
        animal.setId(sc.nextInt());;
        sc.nextLine();
        System.out.println("color :");
        animal.setColor(sc.nextLine());


        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            System.out.println("dogBreeds :");
            dog.setDogBreeds(sc.nextLine());
        }

        if (animal instanceof Chicken) {
            Chicken chicken = (Chicken) animal;
            System.out.println("sex :");
            chicken.setSex(sc.nextLine());
        }

    }

    public static void output(Animal animal) {
        System.out.println("id = " + animal.getId());
        System.out.println("color = " + animal.getColor());

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            System.out.println("dogBreeds = " + dog.getDogBreeds());
        }

        if (animal instanceof Chicken) {
            Chicken chicken = (Chicken) animal;
            System.out.println("dogBreeds = " + chicken.getSex());
        }

    }
}
