package ch08;

public class Customer {

	public int customerNumber;
	public int phoneNumber;
	public String customerAddress;
	public int date;
	public int time;
	public int price;
	public int menuNumber;

	public Customer(int customerNumber, int phoneNumber, String customerAddress, int date, int time, int price,
			int menuNumber) {
		this.customerNumber = customerNumber;
		this.phoneNumber = phoneNumber;
		this.customerAddress = customerAddress;
		this.date = date;
		this.time = time;
		this.price = price;
		this.menuNumber = menuNumber;
	}

	public String customerInfo() {
		return "주문 접수 번호: " + customerNumber + "\n주문 핸드폰 번호: " + phoneNumber + "\n주문자 주소: " + customerAddress
				+ "\n주문 날짜: " + date + "\n주문 시간: " + time + "\n가격: " + price + "\n메뉴번호: " + menuNumber;
	}
}
