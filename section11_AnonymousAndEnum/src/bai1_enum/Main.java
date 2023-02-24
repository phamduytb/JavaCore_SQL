package bai1_enum;

public class Main {
	public static void main(String[] args) {
		for (FoodMenu foodMenu : FoodMenu.values()) {
			System.out.println(foodMenu.getId() + " " + foodMenu.getName());
		}
	}
}
