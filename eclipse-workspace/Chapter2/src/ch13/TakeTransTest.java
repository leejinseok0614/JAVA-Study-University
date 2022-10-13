package ch13;

public class TakeTransTest {
	public void main(String[] args) {

		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("Tomas", 10000);

		Bus bus100 = new Bus(100);
		studentJ.takeBus(bus100);

		Subway greenSubway = new Subway(2);
		studentT.takeSubway(greenSubway);

		studentJ.showInfo();
		studentT.showInfo();

		bus100.showBusInfo();
		greenSubway.showSubwayInfo();
	}
}
