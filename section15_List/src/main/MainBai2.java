package main;

import java.util.ArrayList;
import java.util.List;

import model.Person;
import service.ListExam;
import service.impl.ListExamImpl;

public class MainBai2 {
	public static void main(String[] args) {
		ListExam exam = new ListExamImpl();
		List<Person> persons = new ArrayList<>();
		
		persons = exam.input();
		
		exam.info(persons);
		
		exam.filter(persons);
		
		exam.delete(persons);
		
		exam.sortPerson(persons);
	}
}
