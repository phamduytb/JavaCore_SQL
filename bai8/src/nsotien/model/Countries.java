package nsotien.model;

import java.util.Scanner;

public class Countries {
    private String nameCity;
    private Person[] persons;

    public void input() {
        System.out.println("namecity :");
        nameCity = new Scanner(System.in).nextLine();

    }

    public void output() {
        System.out.println("nameCity = " + nameCity);
    }

    public Countries() {
    }

    public Countries(String nameCity) {
        this.nameCity = nameCity;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    public Person[] getPersons() {
        return persons;
    }

    public void setPersons(Person[] persons) {
        this.persons = persons;
    }
}
