package bai1;

public class Main {
	public static void main(String[] args) {
		
		MyThread[] myThreads = new MyThread[1000];
		
		for (int i = 0; i < 1000; i++) {
			myThreads[i] = new MyThread();
			myThreads[i].start();
		}
	}
}
