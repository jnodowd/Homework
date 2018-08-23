package chapter_8;
import java.util.*;
public class EmployeeTest {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Employee[] emps = new Employee[7];
		System.out.println("Enter starting num for employee id num...");
		
		
		
		final int START_NUM = 101;
		final double STARTING_SALARY = 15_000;
		for(int x = 0; x < emps.length; ++x)
			emps[x] = new Employee(START_NUM + x, STARTING_SALARY);
		
		for (int x = 0; x < emps.length; ++x)
			System.out.println("Employee Number: " + emps[x].getEmpNum() + " Starting Salary: " + emps[x].getempSal());

	}

}
