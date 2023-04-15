package model;

public class Category {

	private int id;
	private String name;
	
	// Có thể tạo thêm mảng các product nhưng ít dùng
	private Product[] products;
	
	public Category() {
		
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
