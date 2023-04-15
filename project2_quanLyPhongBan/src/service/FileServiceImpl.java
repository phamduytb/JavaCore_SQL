package service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import model.Department;
import model.Employee;

public class FileServiceImpl implements IFileService{
	
	// Ghi vào file danh sách Product
	public  void writeToFile(List<Object> objects) {
		try {
			FileOutputStream outputStream = new FileOutputStream("objects.txt");
			ObjectOutputStream obj = new ObjectOutputStream(outputStream);
			obj.writeObject(objects);
			obj.flush();
			outputStream.flush();
			obj.close();
			outputStream.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Đọc danh sách Product từ file
	public  List<Object> readToFile() {
		List<Object> objects = new ArrayList<>();
		File file = new File("objects.txt");
		if (file.exists()) {
			try {
				FileInputStream inputStream = new FileInputStream(file);
				ObjectInputStream obj = new ObjectInputStream(inputStream);
				objects = (List<Object>) obj.readObject();
				obj.close();
				inputStream.close();
				return objects;
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		return new ArrayList<>();
	}
	
	
}
