package ch16;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("이진석");

		System.out.println(Employee.getSerialNum());

		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("김유신");

		System.out.println(employeeLee.getEmployeeName() + "님의 사번은 " + employeeLee.getSerialNum());
		System.out.println(employeeKim.getEmployeeName() + "님의 사번은 " + employeeKim.getSerialNum());
	}
}
