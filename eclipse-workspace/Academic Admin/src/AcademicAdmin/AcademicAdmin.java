
package AcademicAdmin;

import java.util.Scanner;

public class AcademicAdmin {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("학생의 수를 입력하세요: ");
		int num = sc.nextInt();

		String student[][] = new String[num][5]; // [학생의수][과목수]

		for (int i = 0; i < student.length; i++) {
			for (int j = 0; j < student[i].length; j++) {
				student[i][j] = " ";
			}
		}

		while (true) {
			System.out.println("----------메뉴------------");
			System.out.println("1. 학생 정보 추가");
			System.out.println("2. 학생 정보 삭제");
			System.out.println("3. 학생 정보 검색");
			System.out.println("4. 학생 정보 수정");
			System.out.println("5. 학생 정보 출력");
			System.out.println("6. 과목의 총점과 평균");
			System.out.println("-------------------------");
			System.out.print("메뉴 번호를 입력하세요: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				insert(student);
				break;
			case 2:
				delete(student);
				break;
			case 3:
				search(student);
				break;
			case 4:
				update(student);
				break;
			case 5:
				print(student);
				break;
			case 6:
				math(student);
				break;
			}
		}
	}

	// 학생 정보 추가
	static void insert(String student[][]) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < student.length; i++) {
			System.out.print("이름: ");
			String name = sc.next();

			System.out.print("나이: ");
			String age = sc.next();

			System.out.print("국어: ");
			String kor = sc.next();

			System.out.print("영어: ");
			String eng = sc.next();

			System.out.print("수학: ");
			String math = sc.next();

			student[i][0] = name;
			student[i][1] = age;
			student[i][2] = kor;
			student[i][3] = eng;
			student[i][4] = math;

			System.out.print("입력완료 \n");
		}
	}

	// 학생 정보 삭제
	static void delete(String student[][]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("정보를 삭제할 이름을 입력하세요: ");
		String name = sc.next();

		int deleteIndex = -1;

		for (int i = 0; i < student.length; i++) {
			if (name.equals(student[i][0])) {
				deleteIndex = i;
				break;
			}
		}

		if (deleteIndex == -1) {
			System.out.println("삭제할 학생의 데이터가 없습니다.");
		} else {
			for (int i = 0; i < student[deleteIndex].length; i++) {
				student[deleteIndex][i] = " ";
			}

			System.out.println("데이터 삭제를 완료했습니다. \n");
		}
	}

	// 학생 정보 검색
	static void search(String student[][]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("검색할 학생의 이름: ");
		String name = sc.next();

		int searchIndex = -1;

		for (int i = 0; i < student.length; i++) {
			if (name.equals(student[i][0])) {
				searchIndex = -1;
				break;
			}
		}

		if (searchIndex == -1) {
			System.out.println("검색한 이름의 데이터가 없습니다.");
		} else {
			for (int i = 0; i < student.length; i++) {
				if (student[i][0].equals("")) {
					for (i = 0; i < student.length; i++) {
						for (int j = 0; j < student.length; j++) {
							System.out.println("검색한 학생의 정보는 : " + student[i][j]);
						}
					}
				}

			}
		}
	}

	// 학생 정보 수정
	static void update(String student[][]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("수정할 학생의 이름: ");
		String name = sc.next();

		for (int i = 0; i < student.length; i++) {
			System.out.print("이름: ");
			String newName = sc.next();

			System.out.print("나이: ");
			String newAge = sc.next();

			System.out.print("국어: ");
			String newKor = sc.next();

			System.out.print("영어: ");
			String newEng = sc.next();

			System.out.print("수학: ");
			String newMath = sc.next();

			student[i][0] = newName;
			student[i][1] = newAge;
			student[i][2] = newKor;
			student[i][3] = newEng;
			student[i][4] = newMath;

			System.out.print("입력완료 \n");
		}
	}

	// 학생 정보 출력
	static void print(String student[][]) {

		for (int i = 0; i < student.length; i++) {
			System.out.println("이름: " + student[i][0]);
			System.out.println("나이: " + student[i][1]);
			System.out.println("국어 점수: " + student[i][2]);
			System.out.println("영어 점수: " + student[i][3]);
			System.out.println("수학 점수: " + student[i][4]);
			System.out.println("출력 완료 \n");
		}
	}

	// 학생 성적의 합과 평균
	static void math(String student[][]) {
		Scanner sc = new Scanner(System.in);

		int sum = 0; //성적의 합
		int avg = 0; //성적의 평균
		
		System.out.print("이름을 입력해주세요: ");
		String name = sc.next();
		
		//String 형태의 문자 점수를 int형으로 형변환
		for(int i=0; i<student.length; i++) {
			sum = Integer.parseInt(student[i][2]) + Integer.parseInt(student[i][3]) + Integer.parseInt(student[i][4]);
			avg = sum / 3;
		}
		
		System.out.println(name + " 학생의 성적의 총합은 " + sum + "이고, 평균은 " + avg + "입니다.");
	}
}
