package nsotien.entity;

public class Chair extends Person {
    private String stuff;

    public Chair() {
    }

    public Chair(String color, String producer, double prince, String stuff) {
        super(color, producer, prince);
        this.stuff = stuff;
    }

    public String getStuff() {
        return stuff;
    }

    public void setStuff(String stuff) {
        this.stuff = stuff;
    }
}
