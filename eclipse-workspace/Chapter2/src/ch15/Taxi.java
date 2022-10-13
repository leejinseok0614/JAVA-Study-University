package ch15;

public class Taxi {
	String taxiName;
	int money;

	public Taxi(String taxiName) {
		this.taxiName = taxiName;
	}

	public void take(int money) {
		this.money += money;
	}

	public void showTaxiInfo() {
		System.out.print(taxiName + "택시 수입은 " + money + "입니다.");
	}
}
