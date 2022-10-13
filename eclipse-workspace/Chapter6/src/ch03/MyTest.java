package ch03;

public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * MyNumber number = (x,y) -> { if(x>y) return x; else return y; };
		 */
		MyNumber number = (x, y) -> x > y ? x : y;
		System.out.print(number.getMax(10, 20));
	}

}
