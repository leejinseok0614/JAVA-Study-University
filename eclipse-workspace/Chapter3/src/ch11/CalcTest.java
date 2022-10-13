package ch11;

public class CalcTest {

	public static void main(String[] args) {

		Calc calc = new CompleteCalc();
		System.out.println(calc.add(10, 10));
		System.out.println(calc.substract(10, 5));
		System.out.println(calc.times(10, 10));
		System.out.println(calc.divide(10, 10));
	}
}
