package ch24;

public class StudentSubjectTest {

	public static void main(String[] args) {

		Student studentLee = new Student(1001, "Lee");

		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 100);

		Student studentKim = new Student(1001, "Kim");

		studentKim.addSubject("국어", 70);
		studentKim.addSubject("수학", 80);

		studentLee.showScoreInfo();
		System.out.println("=============");
		studentKim.showScoreInfo();
	}
}
