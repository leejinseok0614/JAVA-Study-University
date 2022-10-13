package ch15;

public class Person {
	String personName;
	int money;

	public Person(String personName, int money) {
		this.personName = personName;
		this.money = money;
	}

	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= money;
	}

	public void showInfo() {
		System.out.print(personName + "¥‘¿« ≥≤¿∫ µ∑¿∫ " + money + "¿‘¥œ¥Ÿ.");
	}
}
