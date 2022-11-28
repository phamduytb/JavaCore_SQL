package nsotien.model;/*
java by nsotien tv .......
Name : nsotien
Time : 4:12 PM
Date : 10/25/22
*/

public enum FoodMenu {
    CAFE(1, "Cafe"),
    MILK_TEA(2, "Milk_tea");
    private int id;
    private String name;

    FoodMenu(int id, String name) {
        this.id = id;
        this.name = name;
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
}
