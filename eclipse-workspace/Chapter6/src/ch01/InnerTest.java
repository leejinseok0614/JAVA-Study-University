package ch01;

class OutClass {

	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;

	// 인스턴스 내부 클래스
	public OutClass() {
		inClass = new InClass();
	}

	/* private */ class InClass { // Private선언시 내부에서만 사용 가능!
		int iNum = 100;

		// static int sInNum = 500;는 사용할 수 없다. 정적 변수는 InClass내부에서 사용 불가능

		void inTest() {

			System.out.println("OutClass Num = " + num + " (외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + " (외부 클래스의 Static 변수)");
			System.out.println("InClass uNum = " + iNum + " (내부 클래스의 인스턴스 변수)");
		}
	}

	public void usingClass() {
		inClass.inTest();
	}

	// 정적 내부 클래스
	static class InStaticClass {

		int iNum = 100;
		static int sInNum = 200;

		void inTest() {
			// 정적 클래스에서는 외부 클래스의 인스턴스 변수 사용 불가능 (외부와 상관없이 사용될수도 있기 때문)
			// System.out.println("OutClass Num = " + num + " (외부 클래스의 인스턴스 변수)");
			System.out.println("InClass uNum = " + iNum + " (내부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + " (외부 클래스의 Static 변수)");
			System.out.println("InClass sInNum = " + sInNum + " (내부 클래스의 Static 변수)");
		}

		static void sTest() {
			// 생성되지 않았을 수도 있기 때문에 내부 클래스의 인스턴스 변수 사용 불가능
			// System.out.println("InClass uNum = " + iNum + " (내부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + " (외부 클래스의 Static 변수)");
			System.out.println("InClass sInNum = " + sInNum + " (내부 클래스의 Static 변수)");
		}
	}
}

public class InnerTest {

	public static void main(String[] args) {

		/*
		 * OutClass outClass = new OutClass(); outClass.usingClass();
		 * 
		 * //문법적으로는 가능하지만 잘 사용하지 않는 방식 OutClass.InClass inner = outClass.new InClass();
		 * inner.inTest();
		 */

		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
	}
}
