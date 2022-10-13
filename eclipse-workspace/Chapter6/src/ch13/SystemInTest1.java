package ch13;

import java.io.IOException;
import java.io.InputStreamReader;

//입출력 스트림

public class SystemInTest1 {

	public static void main(String[] args) {

		System.out.println("알파벳 여러개를 쓰고 [Enter]를 누르세요. ");

		int i;

		try {
			InputStreamReader irs = new InputStreamReader(System.in); // 바이트 단위는 모두 가능
			while ((i = irs.read()) != '\n') {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
