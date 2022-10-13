package ch06;

public class GoldCustomer extends Customer {

	double saleRatio;

	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);

		saleRatio = 0.1;
		bonusRatio = 0.02;
		customerGrade = "Gold";
	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price -= (int) (price * saleRatio);
	}
}
