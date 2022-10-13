package ch04;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer(970614, "이진석");
		customerLee.bonusPoint = 1000;
		int price = customerLee.calcPrice(1000);
		System.out.println(customerLee.showCustomerInfo() + price);

		VIPCustomer customerKim = new VIPCustomer(980126, "용현정");
		customerKim.bonusPoint = 10000;
		price = customerKim.calcPrice(1000);
		System.out.println(customerKim.showCustomerInfo() + price);
	}
}