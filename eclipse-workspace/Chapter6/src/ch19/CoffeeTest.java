package ch19;

public class CoffeeTest {

	public static void main(String[] args) {

		Coffee etiopiacoffee = new EtiopiaAmerciano();
		etiopiacoffee.brewing();

		System.out.println();
		Coffee etiopialatte = new Latte(etiopiacoffee);
		etiopialatte.brewing();

		System.out.println();
		Coffee etiopiamocha = new Mocha(new Latte(etiopiacoffee));
		etiopiamocha.brewing();
	}
}
