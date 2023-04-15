package company;

import java.util.Scanner;

public class Leader extends Employee{
	private int teamSize;
	
	public Leader() {
		
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	
	public void input() {
		super.input();
		System.out.println("Nhập số thành viên của nhóm: ");
		teamSize = new Scanner(System.in).nextInt();
	}
	
	public void info() {
		super.info();
		double bonus;
		if (teamSize <= 10) {
			bonus = 10000000 * 0.1;
		} 
		else {
			bonus = 10000000 * 0.5;
		}
		
		System.out.println(" |teamSize: " + teamSize + " |bonus: " + bonus);
	}
}
