package demo.model;

import java.io.Serializable;

public class Category implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3L;
	// Để lưu một đối tượng vào file thì đối tượng phải là con của  Serializable
	// serialVersionUID đánh dấu phiên bản của đối tượng trong file
	private int id;
	private String name;
	
	// Có thể tạo thêm mảng các product nhưng ít dùng
	
	
	public Category() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
