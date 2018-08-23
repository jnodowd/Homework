package chapter_8;
import java.util.*;
public class Example 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Car[] cars = new Car[3];
		String temp;
		
		
		for (int i = 0; i < cars.length; ++i) {
			System.out.println("Enter the car model...");
			temp = input.nextLine();
			cars[i] = new Car();
			cars[i].setModel(temp);
		}
		
		for (int i = 0; i < cars.length; ++i)
		System.out.println("The model is: " + cars[i].getModel());

			
			
			
	}
	
}
