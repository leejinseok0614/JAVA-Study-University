package ch02;

public class AddTest {

	public static void main(String[] args) {

		Add add = (x, y) -> {
			return x + y;
		};
		// Add add = (x,y) -> x+y;
		// 람다식 (Lamda expression)
		// 반환문은 중괄호 생략 불가능

		System.out.print(add.add(2, 3));
	}
}
