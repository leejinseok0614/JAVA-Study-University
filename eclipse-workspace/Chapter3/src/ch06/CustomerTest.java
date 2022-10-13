package ch06;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<>();

		Customer customerT = new Customer(10010, "Tomas");
		Customer customerS = new Customer(10011, "Sam");
		Customer customerJ = new GoldCustomer(10012, "James");
		Customer customerL = new GoldCustomer(10013, "Lee");
		Customer customerY = new VIPCustomer(10014, "Yong");

		customerList.add(customerT);
		customerList.add(customerS);
		customerList.add(customerJ);
		customerList.add(customerL);
		customerList.add(customerY);

		/*
		 * for(Customer customer : customerList) {
		 * System.out.println(customer.showCustomerInfo()); }
		 * 
		 * int price = 10000;
		 * 
		 * for(Customer customer : customerList) {
		 * 
		 * int cost = customer.calcPrice(price);
		 * System.out.println(customer.getCustomerName() + "님이 " + cost + "원 지불하셨습니다.");
		 * System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는 " +
		 * customer.bonusPoint + "입니다."); }
		 */

		if (customerJ instanceof GoldCustomer) {
			GoldCustomer vc = (GoldCustomer) customerJ;
			System.out.println(customerJ.showCustomerInfo());
		}
	}
}