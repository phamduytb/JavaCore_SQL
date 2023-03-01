package section12_Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainFile {
	public static void main(String[] args) {
		write();
		read();
	}
	
	//---------------- Đọc ghi text------------------------//
	
	// Ghi file text
	public static void write() {
		String filename = "data.txt";
		
		File file = new File(filename);
		
		if(file.exists()) {
			file.delete();
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			String s = "Hello";
			
			// Chuyển chuỗi thành mảng byte để ghi vào file
			byte[] keycodes = s.getBytes();
			
			fileOutputStream.write(keycodes);
			
			//Đóng file sau khi đã ghi xong
			fileOutputStream.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	// đọc file text
	
	public static void read() {
		String filename = "data.txt";
		
		File file = new File(filename);
		
		if (file.exists()) {
			
			try {
				FileInputStream  fileInputStream = new FileInputStream(file);
				int c = fileInputStream.read();
				
				while (c != -1) {
					System.out.print((char) c);
					c = fileInputStream.read();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
}
