package ch01;

class Outer2 {

	int outNum = 100;
	static int sNum = 200;

	Runnable getRunnable(int i) { // 클래스를 Thread화는 인터페이스 // 스택메모리에 저장됨.

		int num = 400;

		return new Runnable() { // 지역클래스

			int localNum = 500;

			@Override
			public void run() {

				// i = 50;
				// num = 20;
				// 오류가 나는 이유는, 메소드 호출과 생성 시점이 다르기 때문이다.
				// final로 처리가 되어서 외부 지역변수는 메소드 호출이 끝나도 사라지지 않고, 상수 메모리에 따로 잡힘.

				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("LocalNum = " + localNum);

				System.out.println("OutNum = " + outNum + " (외부 클래스 인스턴스 변수)");
				System.out.println("Outter.sNum = " + Outer2.sNum + " (외부 클래스 정적 변수)");
			}
		};
	}

	Runnable runnable = new Runnable() {

		@Override
		public void run() {

			System.out.println("Runnable class");
		}
	};
}

public class AnonumousInnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer2 out = new Outer2();
		Runnable runner = out.getRunnable(100);

		runner.run(); // 호출을 위해서 스택에 잡지 말고 상수 메모리에 따로 저장해야 함.

		out.runnable.run();
	}

}
