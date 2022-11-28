package nsotien.entity;

public class Person {
    private String color;
    private String producer;
    private double prince;



    public Person() {
    }

    public Person(String color, String producer, double prince) {
        this.color = color;
        this.producer = producer;
        this.prince = prince;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getPrince() {
        return prince;
    }

    public void setPrince(double prince) {
        this.prince = prince;
    }
}
