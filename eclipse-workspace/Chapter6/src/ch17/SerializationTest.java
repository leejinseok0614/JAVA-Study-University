package ch17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {

	String name;
	String job;

	public Person() {

	}

	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}

	public String toString() {
		return name + ", " + job;
	}
}

public class SerializationTest {

	public static void main(String[] args) {

		Person personlee = new Person("이진석", "개발자");
		Person personyong = new Person("용현정", "회사원");

		try (FileOutputStream fos = new FileOutputStream("serial.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {

			oos.writeObject(personlee);
			oos.writeObject(personyong);
		} catch (IOException e) {

			System.out.println(e);
		}

		try (FileInputStream fos = new FileInputStream("serial.txt");
				ObjectInputStream ois = new ObjectInputStream(fos)) {

			Person pLee = (Person) ois.readObject();
			Person pYong = (Person) ois.readObject();

			System.out.println(pLee);
			System.out.println(pYong);
		} catch (IOException e) {

			System.out.println(e);
		} catch (ClassNotFoundException e) {

			System.out.println(e);
		}
	}
}
