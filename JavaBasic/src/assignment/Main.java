package assignment;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("----------Tính Chu vi diện tích hình vuông-----------");
		System.out.print("Nhập cạnh hình vuông: ");
		double hv = Double.parseDouble(in.nextLine());
		System.out.println("Chu vi hình vuông: " + Square.findPerimeter(hv));
		System.out.println("Diện tích hình vuông: " + Square.findArea(hv));
		
		System.out.println("----------Tính Chu vi diện tích hình chữ nhật-----------");
		System.out.print("Nhập cạnh thứ nhất: ");
		double cn1 = Double.parseDouble(in.nextLine());
		System.out.print("Nhập cạnh thứ hai: ");
		double cn2 = Double.parseDouble(in.nextLine());
		System.out.println("Chu vi hình chữ nhật: " + Rectangle.findPerimeter(cn1, cn2));
		System.out.println("Diện tích hình chữ nhật: " + Rectangle.findArea(cn1, cn2));
		
		System.out.println("----------Tính Chu vi diện tích hình tam giác-----------");
		System.out.print("Nhập cạnh thứ nhất: ");
		double tg1 = Double.parseDouble(in.nextLine());
		System.out.print("Nhập cạnh thứ hai: ");
		double tg2 = Double.parseDouble(in.nextLine());
		System.out.print("Nhập cạnh thứ ba: ");
		double tg3 = Double.parseDouble(in.nextLine());
		System.out.println("Chu vi hình tam giác: " + Triangle.findPerimeter(tg1, tg2, tg3));
		System.out.println("Diện tích hình tam giác: " + Triangle.findArea(tg1, tg2, tg3));
		
		System.out.println("----------Tính Chu vi diện tích hình tròn-----------");
		System.out.print("Nhập bán kính: ");
		double bk = Double.parseDouble(in.nextLine());
		System.out.println("Chu vi hình tròn: " + Cricle.findPerimeter(bk));
		System.out.println("Diện tích hình tròn: " + Cricle.findArea(bk));
		
		System.out.println("-------------Kết thúc----------");
	}
}
