package nsotien.model;

import java.util.Scanner;

public class Car {
    private String model;
    private Person person;

    public void input() {

        model = new Scanner(System.in).nextLine();

    }

    public void output() {
        System.out.println("model car = " + model);
    }

    public Car() {
    }

    public Car(String model, Person person) {
        this.model = model;
        this.person = person;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
