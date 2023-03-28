package main;

public class WrapperClass {
	public static void main(String[] args) {
		// WrapperClass có thể tự động nâng lên hạ xuống kiểu cơ bản - kiểu dối tượng
		String s = "aaa";
		
		int x= 10;
		
		Integer y = new Integer(10);
		Integer z = 10; // autobox
		
		int sum = x + y + z;
		
		System.out.println(x == y);
		System.out.println(new Long(10) == new Long(10));
		
	}
}
