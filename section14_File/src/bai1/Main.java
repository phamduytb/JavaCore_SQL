package bai1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		String s = "Hello trung tâm Java - File";
		System.out.println("Write data to file");
		writeFile(s);
		System.out.println();
		
		System.out.println("Data in file before append");
		System.out.println(readFile());
		System.out.println();
		
		System.out.println("Data in file after append");
		appendFile();
		System.out.println(readFile());
	}

	private static void appendFile() {
		StringBuilder st = new StringBuilder("");
		
		String s = readFile();
		
		st.append(s + ". I am here");
		
		String result = st.toString();
		
		writeFile(result);
		
		
		
	}

	private static String readFile() {
		StringBuilder s = new StringBuilder("");
		try {
			FileInputStream inputStream = new FileInputStream("data.txt");
			
			int c = inputStream.read();
			
			while (c != -1) {
				
				
				s.append((char) c);
				c = inputStream.read();
			}
			inputStream.close();
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return s.toString();
	}

	private static void writeFile(String s) {
		
		File file = new File("data.txt");
		
		
		try {
			FileOutputStream outputStream = new FileOutputStream(file);
			
			byte[] writeFile = s.getBytes();
			
			outputStream.write(writeFile);
			
			outputStream.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
