package model;

public class Person {
	private int id;
	private String name;
	private int age;
	
	public Person() {
		
	}

	public Person(int id, String name, int age) {
		
		this.id = id;
		this.name = name;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			if (this.age == ((Person) obj).getAge()) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "id: " + id + " |name: " + name + " |age: " + age;
	}
	
	
}
