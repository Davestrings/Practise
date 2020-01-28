package Practise;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee Dammy = new Employee("Oladele", "Damilola", 5000);
		System.out.printf("$%.3f%n",Dammy.yearlySalary());
		System.out.printf("$%.3f%n", Dammy.raise());
		
		Employee Gbemi = new Employee("Olaolu", "Opeyemi", 300);
		System.out.println(Gbemi.raise());
		
		Gbemi.setSalary(3000);
		System.out.println(Gbemi.yearlySalary());
	}

}
