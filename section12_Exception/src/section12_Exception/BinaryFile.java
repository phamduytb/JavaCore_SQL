package section12_Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import demo.model.Category;

//Để lưu một đối tượng vào file thì đối tượng phải là con của  Serializable


public class BinaryFile {
	public static void main(String[] args) {
		 Category category = new Category();
		 category.setId(1);
		 category.setName("Quan ao");
		 
//		 writeObject(category);
		 readObject();
	}
	
	//
	public static void  writeObject(Category category) {
		String filename = "object.txt";
		
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(filename);
			
			//ObjectOutputStream giúp chuyển 1 đối tương về chuỗi nhị phân để lưu vào file
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			
			objectOutputStream.writeObject(category);
			
			objectOutputStream.close();
			
			fileOutputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void readObject() {
		
		String filename = "object.txt";
			
		try {
			FileInputStream  fileInputStream = new FileInputStream(filename);
			
			ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
			
			Object obj  = inputStream.readObject();
			
			Category c = (Category) obj;
			
			System.out.println(c.getId() + " " + c.getName());
			
			inputStream.close();
			
			fileInputStream.close();
			
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
}
