package service;

import java.util.List;

import model.Person;

public interface ListExam {
	List<Person> input();
	
	void info(List<Person> list);
	
	void filter(List<Person> list);
	
	void delete(List<Person> list);
	
	void sortPerson(List<Person> list);
}
