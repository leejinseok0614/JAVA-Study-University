package ch08;

public class CustomerTest {

	public static void main(String[] args) {

		Customer CustomerLee = new Customer(20172926, 67889598, "경기도 화성시", 20220801, 1400, 15000, 13245928);

		System.out.println(CustomerLee.customerInfo());
	}
}
