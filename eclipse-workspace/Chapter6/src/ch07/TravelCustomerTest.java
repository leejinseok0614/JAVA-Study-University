package ch07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TravelCustomerTest {

	public static void main(String[] args) {

		TravelCustomer cutomerLee = new TravelCustomer("이순신", 40, 100);
		TravelCustomer cutomerKim = new TravelCustomer("김유신", 20, 100);
		TravelCustomer cutomerHong = new TravelCustomer("홍길동", 13, 50);

		List<TravelCustomer> customerlist = new ArrayList<>();
		customerlist.add(cutomerLee);
		customerlist.add(cutomerKim);
		customerlist.add(cutomerHong);

		System.out.println("== 고객 명단 추가된 순서대로 출력 ==");
		customerlist.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));

		System.out.println("\n== 여행 비용 ==");
		int total = customerlist.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("총 여행 비용은 :" + total + "입니다");

		System.out.println("\n== 20세 이상 고객 명단 정렬하여 출력 ==");
		customerlist.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted()
				.forEach(s -> System.out.println(s));
	}
}
