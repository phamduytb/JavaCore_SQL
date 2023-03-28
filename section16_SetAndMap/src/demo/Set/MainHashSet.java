package demo.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainHashSet {
	public static void main(String[] args) {
		
//		Set<String> list = new HashSet<>();
//		list.add("a");
//		list.add("a");
//		list.add("b");
//		list.add("c");
//		list.add("e");
//		list.add("f");
//		for (String s : list) {
//			System.out.println(s);
//		}
		
		// Sử dụng hashSet với kiểu dữ liệu người dùng tự định nghĩa
		
		Set<Person> persons = new HashSet<>();
		
		persons.add(new Person(1, "duy"));
		persons.add(new Person(1, "duy"));
		persons.add(new Person(2, "Truong"));
		persons.add(new Person(2, "Bom"));
		
		Iterator<Person> itr = persons.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
