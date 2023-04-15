package demo.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


	//-----------Đọc ghi file nhị phân-------------------//
public class BinaryStream {
	public static void main(String[] args) throws IOException {
		
		// Đoc ghi văn bản thông thường
		writeToFile();
		
		reaToFile();
		
		// Đọc ghi đối tượng
		
		
	}

	private static void reaToFile() throws IOException {
		FileInputStream input = new FileInputStream("demo.txt");
		
		// cach 1 - Đọc từng byte một
		
		int i = input.read();
		
		while (i != -1) {
			System.out.print((char) i + " " + i + " ");
			i = input.read();
		}
		
		
		//cach 2 - Đọc 1 phát cả mảng byte luôn
//		int size = input.available();
//		
//		byte[] data = new byte[size];
//		
//		input.read(data);
//		
//		String result = new String(data);
//		
//		System.out.println(result);
		

		input.close();
		
		
	}

	private static void writeToFile() throws IOException {
		
		String s = "Tôi";
		FileOutputStream output = new FileOutputStream("demo.txt");
		
		output.write(s.getBytes());
		
		System.out.println("Write done!!!");
		
		output.close();
		
	}
}
