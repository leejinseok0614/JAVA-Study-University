package ch04;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student();

		studentLee.studentID = 12345;
		studentLee.setStudentName("LEE");
		studentLee.address = "서울 강남구";

		studentLee.showStudentInfo();
	}
}
