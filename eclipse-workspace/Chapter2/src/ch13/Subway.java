package ch13;

public class Subway {

	int lineNumber;
	int passengerCount;
	int money;

	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	public void take(int money) {
		this.money += money;
		passengerCount++;
	}

	public void showSubwayInfo() {

		System.out.println(lineNumber + "번의 승객 수는 " + passengerCount + "이고, 수입은 " + money + "입니다.");
	}
}
