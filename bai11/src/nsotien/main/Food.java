package nsotien.main;/*
java by nsotien tv .......
Name : nsotien
Time : 4:14 PM
Date : 10/25/22
*/

import nsotien.model.FoodMenu;

public class Food {
    public static void main(String[] args) {
        for (FoodMenu f : FoodMenu.values() ){
            System.out.println(f.getId() + " = " + f.getName());}
    }
}
