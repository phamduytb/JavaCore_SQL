package bai2_Anonymous;

public class Main {
	public static void main(String[] args) {
		Employee employee = new Employee() {
			public void salary() {
				System.out.println("50 triệu");
			}
		};
		
		employee.salary();
	}
}
