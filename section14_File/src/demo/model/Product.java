package demo.model;

public class Product {
	private String id, name;

	
	public Product(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//@Override
//	public boolean equals(Object obj) {
//		if (id.equals(((Product) obj).getId()) && name.equals(((Product) obj).getName()) ) {
//			return true;
//		}
//		return false;
//	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}
	
	
}
