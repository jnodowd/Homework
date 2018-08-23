package chapter_8;
////Filename: Student.java
//Written by: Jon O'Dowd
//Written on: 08/09/2018

//Write a program that reads in a student file and creates Student.java objects 
// with the following fields: first name, last name, GPA, and student ID. 
//The objects will be stored in an array of Students in a class named StudentSearcher.java. 
//Provide the user with a list of possible student IDs to search from. 
//When a user enters in a student ID, the program will search the array and display the 
// found student's GPA. 
//The program will continue to search students until the user exits the program.

public class Student 
{
	//Object Variables
	private String firstName;
	private String lastName;
	private int studentId; 
	private double gpa;
	
	//Constructor method
	public Student(String F, String L, int I, double G)
	{
		firstName = F;
		lastName = L;
		studentId = I;
		gpa = G;
		
	}

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

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
}
