package demo.main;

//Async Bất đồng bộ
public class AsyncThread {
	
		public static void main(String[] args) {
			BankAccount account = new BankAccount();
			
			Thread[] threads = new Thread[10];
			
			for (int i = 0; i < 10; i++) {
				threads[i] = new Thread(account);
				threads[i].start();
			}
		}
		
}

// tránh: deaalock
class BankAccount implements Runnable {
	
	int balance = 10;
	
	//lock: 1 thread vào các thằng khác không vào được - synchronized : đồng bộ
	private synchronized void withdraw() {
		// rut tien 10
		balance -= 10;
		
		//sleep
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (balance >= 0) {
			System.out.println("OK");
		} else {
			System.out.println("Erro");
		}
	}

	@Override
	public void run() {
		
		withdraw();
		
	}
	
}
