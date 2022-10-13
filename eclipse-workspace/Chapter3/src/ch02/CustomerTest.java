package ch02;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer();
		customerLee.setCustomerName("이진석");
		customerLee.setCustomerID(970614);
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());

		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerName("용현정");
		customerKim.setCustomerID(980126);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
	}
}