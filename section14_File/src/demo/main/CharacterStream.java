package demo.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterStream {
	public static void main(String[] args) throws IOException {
		writeToFile();
		
		readToFile();
	}

	private static void readToFile() throws IOException {
		 // Tạo một binary Stream (luồng nhị phân), để đọc file.
        FileInputStream in = new FileInputStream("test.txt");
 
        // Tạo một Character stream (luồng ký tự) với mã hóa (encoding) là UTF-8.
        Reader reader = new InputStreamReader(in, "UTF-8");
 
        int i = 0;
        // Đọc lần lượt từng ký tự.
        while ((i = reader.read()) != -1) {
            // Ép kiểu (cast) thành một ký tự và in ra màn hình.
            System.out.print((char) i + " " + i + " ");
//            System.out.print((char) i );
        }
        reader.close();
		
	}

	private static void writeToFile() throws IOException {
		 // Tạo một OutputStream (luồng nhị phân) để ghi dữ liệu vào file.
       FileOutputStream OutputStream  = new FileOutputStream("test.txt");
 
        // Tạo một Character Stream (luồng ghi ký tự) với mã hóa (encoding) là UTF-8.
        Writer writer = new OutputStreamWriter(OutputStream, "UTF-8");
 
        String s = "Lập trình Java";
        writer.write(s);
        writer.close();
	}
}
