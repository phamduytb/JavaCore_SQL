package company;

import java.util.Scanner;

public class Tester extends Employee{
	private String testTools;
	
	public Tester() {
		
	}

	public String getTestTools() {
		return testTools;
	}

	public void setTestTools(String testTools) {
		this.testTools = testTools;
	}
	
	public void input() {
		super.input();
		System.out.println("Nhập test tool: ");
		testTools = new Scanner(System.in).nextLine();
	}
	
	public void info() {
		super.info();
		System.out.println(" |testTool: " + testTools);
	}
}
