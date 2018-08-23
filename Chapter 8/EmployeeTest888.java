package chapter_8;
import java.util.*;
public class EmployeeTest888 {

	public static void main(String[] args) 
	{
		int START_NUM = 0;
		double STARTING_SALARY = 0.0;
		String userInput = "";
		
		Scanner input = new Scanner(System.in);
		Employee[] emps = new Employee[2];
		System.out.println("Enter starting num for employee id num...");
//		int empId;
//		empId = input.nextInt();
		
		
		userInput = input.nextLine();
		int startSpace = userInput.indexOf(" ");
		int space2 = userInput.indexOf(" ", startSpace+1);
		

		

		
		
		for(int x = 0; x < emps.length; ++x)
			emps[x] = new Employee(START_NUM, STARTING_SALARY);
		
		for (int x = 0; x < emps.length; ++x)
			System.out.println("Employee Number: " + emps[x].getEmpNum() + " Starting Salary: " + emps[x].getempSal());

	}

}
