package bai2;

public class Main2 {
	public static void main(String[] args) {
		Ticket ticket = new Ticket();
		
		Thread thread = new Thread(ticket);
		
		Thread thread2 = new Thread(ticket);
		
		thread.start();
		thread2.start();
	}
}
