package chapter_7;
//filename: EmployeeData.java
//written by: Jon O'Dowd
//written on: 08/04/2018

import java.util.Scanner;
public class EmployeeData {
	
	public static void main(String[] args)
	{
		String firstName = "";
		String lastName = "";
		String userInput = "";
		String empId = "";
		int empId2;
		String wage = "";
		double wage2;
		int x = 0;
		String finished = "n";
		while (finished.equalsIgnoreCase("n"))
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter the Employee's Data separated by exactly one space; first name, last name, numeric ID, and hourly wage.");
			System.out.println("");
			System.out.println("For Example");
			System.out.println("John Smith 123456 12.50");
			System.out.println("");

			userInput = input.nextLine();
			int startSpace = userInput.indexOf(" ");
			int space2 = userInput.indexOf(" ", startSpace+1);
			int lastSpace = userInput.lastIndexOf(" ");
			
			firstName = userInput.substring(0, startSpace);
			lastName = userInput.substring((startSpace + 1), space2);
			empId = userInput.substring((space2 + 1), lastSpace);
			empId2 = Integer.parseInt(empId);
			wage = userInput.substring(lastSpace, userInput.length());
			wage2 = Double.parseDouble(wage);
			
			Employee e1 = new Employee(firstName, lastName, empId2, wage2);
			e1.getCustData();
			System.out.println("Are you finished? Y/N");
			finished = input.nextLine();
		}
			++x;
	}
}


