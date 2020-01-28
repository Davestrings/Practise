package Practise;

public class Employee {
	private String lastName;
	private String firstName;
	private double salary;
	
	
	public Employee(String lastName, String firstName, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		if(salary < 0.0) {
			this.salary = 0.0;
		}else {
			this.salary = salary;
		}
	}
	
	public double yearlySalary() {
		double yearlySalary = salary *12;
		return yearlySalary;
		
	}
	
	public double raise() {
		double raise = yearlySalary() + (yearlySalary() * 0.1);
		return raise;
	}
	
}
