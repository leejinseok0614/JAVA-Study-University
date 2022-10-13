package ch08;

import java.util.ArrayList;

class Animal {

	public void move() {
		System.out.println("동물이 움직입니다.");
	}

	public void eating() {
		System.out.println("밥을 먹습니다.");
	}
}

class Human extends Animal {

	public void move() {
		System.out.println("사람이 움직입니다.");
	}

	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {

	public void move() {
		System.out.println("호랑이가 네 발로 움직입니다.");
	}

	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {

	public void move() {
		System.out.println("독수리가 날라다닙니다.");
	}

	public void flying() {
		System.out.println("독수리가 양날개를 펴고 날라다닙니다.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {

		Animal hanimal = new Human();
		Animal tanimal = new Tiger();
		Animal eanimal = new Eagle();

		AnimalTest test = new AnimalTest();
///		test.moveAnimal(tanimal);
///		test.moveAnimal(hanimal); 
///		test.moveAnimal(eanimal);

		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(hanimal);
		animalList.add(eanimal);
		animalList.add(tanimal);

		for (Animal animal : animalList) {
			animal.move();
		}

		test.testDownCasting(animalList);
	}

	public void testDownCasting(ArrayList<Animal> list) {

		for (int i = 0; i < list.size(); i++) {

			Animal animal = list.get(i);

			if (animal instanceof Human) {

				Human human = (Human) animal;
				human.readBook();
			}

			else if (animal instanceof Tiger) {

				Tiger tiger = (Tiger) animal;
				tiger.eating();
			}

			else if (animal instanceof Eagle) {

				Eagle eagle = (Eagle) animal;
				eagle.flying();
			} else {
				System.out.println("Non Supposed Type");
			}
		}
	}

	public void moveAnimal(Animal animal) {
		animal.move();
		animal.eating();
	}
}
