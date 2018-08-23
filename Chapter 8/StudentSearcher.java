package chapter_8;
////Filename: StudentSearcher.java
//Written by: Jon O'Dowd
//Written on: 08/09/2018

//Write a program that reads in a student file and creates Student.java objects with the following fields: first name, last name, GPA, and student ID. 
//The objects will be stored in an array of Students in a class named StudentSearcher.java. 
//Provide the user with a list of possible student IDs to search from. 
//When a user enters in a student ID, the program will search the array and display the found student's GPA. 
//The program will continue to search students until the user exits the program.

import java.util.*;
public class StudentSearcher {
	
	public static void main(String[] args)
	{
		String userInput = "";
		int numInput;

		// declares an Array
		Student[] arr = new Student[3];  // allocating memory for 3 objects of type Student.
		
        // initialize the first elements of the array
        arr[0] = new Student("Mike","Crawford", 1234, 3.75);
        arr[1] = new Student("Sue","Stevens", 4567, 3.65);
        arr[2] = new Student("Allen","Mitchell", 7890, 3.95);
        
        System.out.println("Here are the student Id's..." + "\n 1234" + "\n 4567" + "\n 7890");
        System.out.println("Please enter the student Id to search for the student...");
        int x = 0;
        
        do
        {
	        Scanner input = new Scanner(System.in);
	        userInput = input.nextLine();
	        numInput = Integer.parseInt(userInput);
	        int i = 0;
			while(i >= 0 && numInput != arr[i].getStudentId()) ++i;
			double gpa = arr[i].getGpa();
			System.out.println("Gpa for Student Id: " + arr[i].getStudentId() + " is " + gpa);
			System.out.println("Enter another Student Id or enter 9999 to exit");
			
        } while (userInput != "9999");
  	
	}
}
