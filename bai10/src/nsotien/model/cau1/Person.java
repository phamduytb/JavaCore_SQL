package nsotien.model.cau1;

  public abstract class Person {
    private int age;
    private String name;

    public Person() {
    }
    public abstract void salary();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
