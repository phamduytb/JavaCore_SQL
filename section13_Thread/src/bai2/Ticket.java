package bai2;

public class Ticket implements Runnable{
	private int ticket = 1;
	@Override
	public void run() {
		
		sell();
	}
	
	public synchronized void sell() {
		
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
