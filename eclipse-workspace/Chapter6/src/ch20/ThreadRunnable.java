package ch20;

class MyRunnable implements Runnable {
	// Runnalbe의 경우에는 Start가 바로 불가능 (Start는 Thread의 메소드)

	public void run() {

		int i;

		for (i = 1; i <= 200; i++) {
			System.out.print(i + "\t");
		}
	}
}

public class ThreadRunnable {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread() + "Start"); // 메인스레드 -> 1개

		MyRunnable runnable = new MyRunnable();

		Thread th1 = new Thread(runnable);
		Thread th2 = new Thread(runnable);

		th1.start();
		th2.start();

		System.out.println(Thread.currentThread() + "End");
	}
}
