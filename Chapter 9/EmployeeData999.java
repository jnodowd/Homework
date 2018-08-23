package chapter_9;
//filename: EmployeeData.java
//written by: Jon O'Dowd
//written on: 08/04/2018

import java.util.Scanner;

import chapter_8.Employee;
public class EmployeeData999 {
	
	public static void main(String[] args)
	{
		
		String firstName = "";
		String lastName = "";
		String userInput = "";
		String empId = "";
		int empId2 = 0;
		String wage = "";
		double wage2 = 0;
		int x = 0;
		String finished = "n";
		
		Employee999 e1 = new Employee999(firstName, lastName, empId2, wage2);
		
		
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many Employees do you want to enter?");
		int length;
		length = keyboard.nextInt();
		Employee999[] emps = new Employee999[length];
		
		System.out.println("Please enter the Employee's Data separated by exactly one space; first name, last name, numeric ID, and hourly wage.");
		System.out.println("");
		System.out.println("For Example");
		System.out.println("John Smith 123456 12.50");
		System.out.println("");
		
		
		
		for (int counter = 0; counter < length; counter++)
		{

				System.out.println("Enter the next Employee");
				Scanner input = new Scanner(System.in);
				
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
				
				emps[counter] = new Employee999(firstName, lastName, empId2, wage2);
				

		}
		
		for (int counter = 0; counter < length; counter++)
			System.out.println(emps[counter]);
	//	System.out.println("Employee #" + (counter+1) + "\n" + emps[counter]);
		
		
		
		
		
		
	}
}


