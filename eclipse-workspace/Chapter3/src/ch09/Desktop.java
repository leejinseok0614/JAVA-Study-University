package ch09;

public class Desktop extends Computer {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Dekstop Display");
	}

	@Override
	public void typing() {
		// TODO Auto-generated method stub
		System.out.println("Dekstop Typing");
	}

	public void turnoff() {

		System.out.println("전원을 끕니다.");
	}
}
