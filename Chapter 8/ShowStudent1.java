package chapter_8;
import java.util.*;
import javax.swing.*;
import java.util.Scanner;

public class ShowStudent1 
{
	public static void main(String[] args)
	{
	// variables from Student
	String Name;
	String StudentID;
	String Address;
	
	// asking the user how many they would like to add
	int choice;
	Student[] StArray;
	
    System.out.print("How many new Students are you going to add: ");
    Scanner in = new Scanner(System.in);
    choice = Integer.parseInt(in.nextLine());
	
	//creating student array of chosen amount
    StArray = new Student[choice];
    
	//asking user for the variables and trying to display them? 
	for (int x = 0; x < StArray.length; x++)
	{
	Name = JOptionPane.showInputDialog("Enter First and Last Name:");
	StudentID = JOptionPane.showInputDialog("Enter StudentID");
	Address = JOptionPane.showInputDialog("Enter Adress"); 
	
	Student[]  Object = new Student[x];	
	StArray[x] = Object[x];
	System.out.println(Object[x]);
	
	}
	
	}
  
}