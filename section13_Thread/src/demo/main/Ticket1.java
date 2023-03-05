package demo.main;

public class Ticket1 extends Thread{
	private  int ticket = 2;
	
	public void run() {
		buyTicket();
	}
	
	public synchronized void buyTicket() {
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(ticket);
		
		
		if (ticket > 0) {
			System.out.println("Can buy");
		} else {
			System.out.println("Out of ticket");
		}
		ticket -= 1;
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
