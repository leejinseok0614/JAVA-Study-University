package ch19;

public class Latte extends Decorator {
	// 상위 클래스에 default costructor가 없으므로 반드시 super사용.

	public Latte(Coffee coffee) {
		super(coffee);
	}

	public void brewing() {
		super.brewing();
		System.out.println("Adding Milk");
	}
}
