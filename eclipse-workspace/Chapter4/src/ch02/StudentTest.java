package ch02;

public class StudentTest {

	public static void main(String[] args) {

		Student std1 = new Student(100, "Lee");
		Student std2 = new Student(100, "Lee");
		
		System.out.println(std1 == std2);	
		System.out.println(std1.equals(std2));	
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		Integer i = 100;
		System.out.println(i.hashCode()); 
	}
}
