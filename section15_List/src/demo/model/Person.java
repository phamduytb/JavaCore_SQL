package demo.model;

public class Person {
	private int id;
	private String name;

	
	public Person(int id, String name) {
		super();
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

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	//@Override
	//public int compareTo(Person o) {
		// Sắp xếp theo id
//		if (id < o.getId()) {
//			return 1;
//		} 
//		return -1;
		
		// Sắp xếp theo tên
		//return name.compareTo(o.getName());
		//return o.getName().compareTo(name);
	//}
	
	
}
