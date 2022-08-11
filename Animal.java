package trungtamjava;

public class Animal {
	private String name;
	private String original;
	private int price;

	public Animal() {
		
	}

	public Animal(String name, String original, int price) {
		super();
		this.name = name;
		this.original = original;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOriginal() {
		return original;
	}

	public void setOriginal(String original) {
		this.original = original;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
