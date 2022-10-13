package nsotien.bai5.model;

public class Laptop extends Person {
    private int year;

    public Laptop() {
    }

    public Laptop(String color, String producer, double prince, int year) {
        super(color, producer, prince);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
