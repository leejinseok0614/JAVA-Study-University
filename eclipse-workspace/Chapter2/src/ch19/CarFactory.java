package ch19;

public class CarFactory {

	private static CarFactory instance = new CarFactory();

	private CarFactory() {
	};

	private static int serialNum = 10001;

	public Car createCar() {
		Car car = new Car();
		car.setCarNum(serialNum);
		serialNum++;

		return car;
	}

	public static CarFactory getInstance() {
		if (instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
}