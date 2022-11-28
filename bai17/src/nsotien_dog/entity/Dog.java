package nsotien_dog.entity;/*
java by nsotien tv .......
Name : nsotien
Time : 09:03
Date : 08/11/2022
*/

public class Dog {
    private int id;
    private String name;
    private float weight;
    private int age;

    public Dog() {
    }

    public Dog(int id, String name, float weight, int age) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
