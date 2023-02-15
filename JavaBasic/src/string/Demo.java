package string;

import java.util.StringTokenizer;

public class Demo {
	public static void main(String[] args) {
		//------------String là imutable------------------
//		String s = "duy";
//		System.out.println(s.hashCode());
//		String s1 = s;
//		System.out.println(s1.hashCode());
//		s = s.concat(" bom");
//		System.out.println(s.hashCode());
		
		//---------------So sánh String-------------------//
//		String s = "bom";
//		System.out.println(s.hashCode());
//		String st = new String("bom");
//		System.out.println(st.hashCode());
//		String st1 = new String("bom");
//		System.out.println(st1.hashCode());
		
		// == so sánh tham chiếu
		//System.out.println(s == st);
		//equals so sánh nội dung
		//System.out.println(s.equals(st1));
		//compareTo so sánh giá trị theo thứ tự từ điển trả về số nguyên
		//System.out.println(s.compareTo(st1));
		
		//------------ StringBuffer( Phương thức đồng bộ - chạy một cách tuần tự) và StringBuilder ( Phương thức bất đồng bộ)--------
		// Tạo ra các String có thể thay đổi được
		
		//---------------StringTokenlize--------------//
		// Cho phép tách 1 chuỗi thành các phần tử token của nó
		String s = "duy oi,! la duy,    oi";
		StringTokenizer st = new StringTokenizer(s);
		System.out.println("Số token: " + st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		StringTokenizer st1 = new StringTokenizer(s, " !");
		System.out.println("Số token: " + st1.countTokens());
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		
		StringTokenizer st2 = new StringTokenizer(s," !,");
		System.out.println("Số token: " + st2.countTokens());
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
	}
}
