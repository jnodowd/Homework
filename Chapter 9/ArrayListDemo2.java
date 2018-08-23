package chapter_9;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class ArrayListDemo2 
{
	public static void main(String[] args) 
	{
		ArrayList<String> students = new ArrayList<String>();
		String name;
		final int LIMIT = 4;
		for(int x = 0; x < LIMIT; ++x)
		{
			name = JOptionPane.showInputDialog(null, "Enter a student's name");
			students.add(name);
		}
		
		//Sorts the list before printing
		Collections.sort(students);
		
		//Prints the list
		System.out.println("The names are " + students);
		
	}

}
