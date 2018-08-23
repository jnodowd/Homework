package chapter_9;

public class Employee9 
{
	private int empNum;
	private String lastName;
	private String firstName;
	private double salary;
	
	public int getEmpNum() {
		return empNum;
	}
	public void setEmpNum(int empNum) {
		this.empNum = empNum;
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
		this.salary = salary;
	}

	public static void bulbbleSort(Employee9[] array)
	{
		int a, b;
		Employee9 temp;
		int highSubscript = array.length - 1;
		for(a = 0; a < highSubscript; ++a)
			for(b = 0; b < highSubscript; ++b)
				if(array[b].getSalary() > array[b+1].getSalary())
				{
					temp = array[b];
					array[b] = array[b+1];
					array[b+1] = temp;
				}
				
	}
	
	
}
