package Basic;

public class ExIf1 {
	public static void main(String[] args) {
		int age = 13;
		int charge;

		if (age < 8) {
			charge = 1000;
			System.out.println("미 취학 아동입니다.");
		} else if (age <= 14) {
			charge = 2000;
			System.out.println("초등학생입니다.");
		} else {
			charge = 3000;
			System.out.println("일반입입니다.");
		}

		System.out.println("입장료는 " + charge + "원입니다.");
	}
}
