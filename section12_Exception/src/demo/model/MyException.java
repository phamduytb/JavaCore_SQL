package demo.model;

// Chú ý khi extends Runtime thì bên code không bắt phải try, cath
// Không nên dùng Runtime thì khi code không có gợi ý có exception
public class MyException extends Exception{
	private int code;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	
}
