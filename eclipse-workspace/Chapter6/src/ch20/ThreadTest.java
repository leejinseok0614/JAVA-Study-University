package ch20;

class MyThread extends Thread {
	// Thread는 따로 구현해야 할 메소드가 반드시 있는건 아님.
	// Thread를 상속받아서 모든 메소드 사용이 가능하다.

	public void run() {

		int i;

		for (i = 1; i <= 200; i++) {
			System.out.print(i + "\t");
		}
	}
}

public class ThreadTest {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread() + "Start"); // 메인스레드 -> 1개
		MyThread th1 = new MyThread(); // Thread1 -> 2개
		MyThread th2 = new MyThread(); // Thread2 - > 3개

		th1.start();
		th2.start();
		System.out.println(Thread.currentThread() + "End");
	}
}
