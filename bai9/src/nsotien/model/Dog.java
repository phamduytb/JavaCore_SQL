package nsotien.model;

public class Dog extends Animal {
    private String dogBreeds;

    public Dog() {
    }

    public Dog(int id, String color, String dogBreeds) {
        super(id, color);
        this.dogBreeds = dogBreeds;
    }

    public String getDogBreeds() {
        return dogBreeds;
    }

    public void setDogBreeds(String dogBreeds) {
        this.dogBreeds = dogBreeds;
    }
}
