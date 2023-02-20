package companyMain;

import java.util.ArrayList;
import java.util.Scanner;

import company.Developer;
import company.Employee;
import company.Leader;
import company.Tester;

public class Main {
	public static void main(String[] args) {
		
//		ArrayList<Employee> list = new ArrayList<>();
		ArrayList<Developer> developers = new ArrayList<>();
		ArrayList<Leader> leaders = new ArrayList<>();
		ArrayList<Tester> testers = new ArrayList<>();
		boolean exit = false;
		
		while(true) {
			System.out.println("-------------Menu------------");
			System.out.println("1.Nhập thông tin Developer");
			System.out.println("2. In thông tin Developer");
			System.out.println("3.Nhập thông tin Tester");
			System.out.println("4. In thông tin Tester");
			System.out.println("5.Nhập thông tin Leader");
			System.out.println("6. In thông tin Leader");
			System.out.println("7.Tìm kiếm developer có ngôn ngữ lập trình java");
			System.out.println("8.Tìm kiếm leader có teamSize > 10");
			System.out.println("0.Exit");
			
			System.out.println("------------Lựa chọn của bạn là: -----------------");
			int choice = new Scanner(System.in).nextInt();
			switch(choice) {
				case 0: 
					System.out.println("Dừng chương trình");
					exit = true;
					break;
					
				case 1: 
					System.out.println("Nhập thông tin Developer: ");
					Developer d = new Developer();
					d.input();
					developers.add(d);
					break;
					
				case 2: 
					System.out.println("In thông tin Developer: ");
					for(Developer de : developers) {
						de.info();
					}
					break;
					
				case 3: 
					System.out.println("Nhập thông tin Tester: ");
					Tester t = new Tester();
					t.input();
					testers.add(t);
					break;
					
				case 4:
					System.out.println("In thông tin tester: ");
					for (Tester te : testers) {
						te.info();
					}
					break;
					
				case 5:
					System.out.println("Nhập thông tin Leader: ");
					Leader l = new Leader();
					l.input();
					leaders.add(l);
					break;
					
				case 6:
					System.out.println("In thông tin leader: ");
					for (Leader le : leaders) {
						le.info();
					}
					break;
					
				case 7:
					System.out.println("Developer có ngôn ngữ lập trình java: ");
					for (Developer dj: developers) {
						if(dj.getProgramLanguage().equals("java")) {
							dj.info();
						}
					}
					break;
					
				case 8:
					System.out.println("Leader có teamSize > 10");
					for (Leader leader: leaders) {
						if(leader.getTeamSize() > 10) {
							leader.info();
						}
					}
					break;
					
				default: 
					System.out.println("Chỉ nhập từ 0 đến 8");
			}
			if(exit == true) {
				break;
			}
		}
	}
}
