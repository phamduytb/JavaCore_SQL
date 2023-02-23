package demo.main;

import java.util.Scanner;

import demo.model.Person;
import demo.model.Student;
import demo.model.Teacher;

public class Main {
	public static void main(String[] args) {
		
		Teacher t = new Teacher();
		// đa hình, new thằng nào gọi hàm thằng đấy
		Person p = new Teacher(); 	// upcasting
		Person p1 = new Student();
		Object o = new Teacher();
		
		p1.getDemo();
		//Su dung
		p.input();// runtime: teacher- | Khi code(compiletime) gọi input của Person, khi chạy(runtime) gọi input của Teacher
		
		p1.input();
		
		print(p);
		print(p1);
		
		//o.input();// o không có hàm input nên khi code(compiletime) không gọi được input
	}
	
	// áp dụng: Viết 1 hàm in để dùng cho nhiều đối tượng khác nhau
	public static void print(Person p) {
		
		
		// ép kiểu
		if (p instanceof Teacher) {
			Teacher t = (Teacher) p;	// downcasting
			System.out.println(t.getDepartment());
		}
		
		if (p instanceof Student) {
			Student s = (Student) p;
			System.out.println(s.getGrade());
		}
	}
	
	// áp dụng: Viết 1 hàm nhập để dùng cho nhiều đối tượng khác nhau
	public static void enter(Person p) {
		System.out.println("Mời bận nhập id: ");
		p.setId(new Scanner(System.in).nextLine()); 
		System.out.println("Mời bạn nhập tên: ");
		p.setName(new Scanner(System.in).nextLine());
		
		if (p instanceof Teacher) {
			Teacher t = (Teacher) p;	// downcasting
			System.out.println("Mời bạn nhập phòng ban của giáo viên: ");
			t.setDepartment(new  Scanner(System.in).nextLine()); 
		}
		
		if (p instanceof Student) {
			Student s = (Student) p;
			System.out.println("Nhập tên lớp: ");
			s.setGrade(new  Scanner(System.in).nextLine());
		}
	}
}
