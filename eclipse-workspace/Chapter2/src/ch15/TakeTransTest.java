package ch15;

public class TakeTransTest {
	public void main(String[] args) {

		Person personE = new Person("Edward", 20000);

		Taxi taxi = new Taxi("잘 간다 운수택시");
		personE.takeTaxi(taxi);

		personE.showInfo();
		taxi.showTaxiInfo();
	}
}
