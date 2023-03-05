package demo.main;

import bai2.Ticket;

public class MainTicket1 {
	public static void main(String[] args) {
		Ticket1 ticket1 = new Ticket1();
		Ticket1 ticket2 = new Ticket1();
		Ticket1 ticket3 = new Ticket1();
		
		ticket1.start();
		ticket2.start();
		ticket3.start();
	}
}
