package demo.Set;

public class Person {
	private int id;
	private String name;
	
	public Person() {
		
	}
	
	

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
	
	// Override lại hai hàm equal() và hashCode xem hai đối tượng có giống nhau không
	// Tính toán mã băm (hash code) của đối tượng, những đối tượng có cũng mã băm được lưu vào chung môt bucket
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		System.out.println(id + name.hashCode());
		return (id + name.hashCode());
	}
	
	// Những đối tượng có cùng mã băm, ta so sánh giá trị
	// Nếu cùng giá trị đối tượn sau ghi đè đối tượn trước, nếu khác nhau đối tượng sau sẽ thêm vào phái sau theo kiểu linkedList
	@Override
	public boolean equals(Object obj) {
		if (id == ((Person) obj).getId() && name.compareTo(((Person) obj).getName()) == 0) {
			return true;
		}
		return false;
	}
	
	
}
