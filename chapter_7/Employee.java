package chapter_7;
//filename: Employee.java
//written by: Jon O'Dowd
//written on: 08/04/2018

public class Employee {
	
	//Object Variables
	String firstName;
	String lastName;
	int empId2;
	double wage2;
	
	
	//Constructor method
	public Employee(String name1, String name2, int Id, double hourly)
	{
		firstName = name1;
		lastName = name2;
		empId2 = Id;
		wage2 = hourly;
	}

	//Accessor methods
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getEmpId2() {
		return empId2;
	}

	public void setEmpId(int empId2) {
		this.empId2 = empId2;
	}

	public double getWage2() {
		return wage2;
	}

	public void setWage2(double wage2) {
		this.wage2 = wage2;
	}
	
	
	public void getCustData()
	{
		System.out.println("     First Name: " + firstName);
		System.out.println("     Last Name: " + lastName);
		System.out.println("     Employee Id: " + empId2);
		System.out.println("     Wage: $" + wage2);
	}
	

}
