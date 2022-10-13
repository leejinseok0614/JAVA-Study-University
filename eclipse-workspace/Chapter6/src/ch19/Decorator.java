package ch19;

public abstract class Decorator extends Coffee {

	Coffee coffee; // 인자로 받고 멤버로 가지고 있게 설정

	public Decorator(Coffee coffee) {
		this.coffee = coffee;
	}

	@Override
	public void brewing() {

		coffee.brewing();
	}
}
