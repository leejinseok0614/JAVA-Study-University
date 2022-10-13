package ch06;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5 };

		for (int num : arr) {
			System.out.println(num);
		}
		System.out.println();

		IntStream is = Arrays.stream(arr);
		is.forEach(n -> System.out.println(n));
		// forEach는 하나씩 꺼내는 메소드.
		// 람다식을 써서 하나씩 꺼내서 출력한다고 표현.

		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
	}
}
