package demo.main;

// Đa luồng
public class ThreadJava extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(super.getName() + ": " + i);
		}
	}
	public static void main(String[] args) {
		ThreadJava[] threadJavas = new ThreadJava[10000];
		
		for (int i = 0; i < 10; i++) {
			threadJavas[i] = new ThreadJava();
			threadJavas[i].setName("threa" + i);
			threadJavas[i].start();
		}
		
//		t1.start();
//		t2.start();
	}
}
