package ch21;

public class JoinTest extends Thread {

	int start;
	int end;
	int total = 0;
	
	public JoinTest(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	public void run() {
	
		int i; 
		
		for(i=start; i<=end; i++) {
			
			total += i;
		}
	}
	
	public static void main(String[] args) {
		
		JoinTest join1 = new JoinTest(1, 50);
		JoinTest join2 = new JoinTest(51, 100);
		
		join1.start();
		join2.start();
		
		try{
			join1.join();
			join2.join();
			
		}catch (InterruptedException e) {
			System.out.println(e);
		}
		
		int lastTotal = join1.total + join2.total;
		
		System.out.println("join1.total = " + join1.total);
		System.out.println("join2.total = " +join2.total);
		
		System.out.println("lastTotal = " + lastTotal);
	}
}
