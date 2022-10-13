package ch15;

public class UltraSuperLevel extends PlayerLevel {

	public void run() {
		
		System.out.println("매우 엄청 빠르게 달립니다.");
	}

	@Override
	public void jump() {

		System.out.println("아주 매우 높이 jump 합니다.");
	}

	@Override
	public void turn() {

		System.out.println("turn 을 잘 합니다.");
	}

	@Override
	public void showLevelMessage() {

		System.out.println("****** 숙련자 레벨입니다. ******");
	}
}
