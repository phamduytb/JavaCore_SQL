package demo.service;

import demo.model.Person;

//Khai báo hàm chức năng
public interface IPersonService {
	public abstract void print(Person p);
	
	// public abstract ( Ngầm định)
	void input(Person p);
}
