package nsotien.model;

import java.util.Scanner;

public class House {
    private String addressHouse;
    private Person person;

    public void input() {

        addressHouse = new Scanner(System.in).nextLine();

    }

    public void output() {
        System.out.println("address = " + addressHouse);

    }

    public House() {
    }

    public House(String addressHouse, Person person) {
        this.addressHouse = addressHouse;
        this.person = person;
    }

    public String getAddressHouse() {
        return addressHouse;
    }

    public void setAddressHouse(String addressHouse) {
        this.addressHouse = addressHouse;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
