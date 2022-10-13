package ch09;

public abstract class Computer {

	public abstract void display();

	public abstract void typing();

	public void turnon() {

		System.out.println("전원을 켭니다.");
	}

	public void turnoff() {

		System.out.println("전원을 끕니다.");
	}
}
