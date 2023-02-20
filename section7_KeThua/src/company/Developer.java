package company;

import java.util.Scanner;

public class Developer extends Employee{
	private String programLanguage;
	
	public Developer() {
		
	}

	public String getProgramLanguage() {
		return programLanguage;
	}

	public void setProgramLanguage(String programLanguage) {
		this.programLanguage = programLanguage;
	}
	
	public void input() {
		super.input();
		System.out.println("Nhập ngôn ngữ lập trình: ");
		programLanguage = new Scanner(System.in).nextLine();
	}
	
	public void info() {
		super.info();
		System.out.println(" programLanguage: " + programLanguage);
		
	}
}
