package chapter_6;
//Filename: Triangle.java
//Written by: Jon O'Dowd
//Written on: 07/26/2018
import java.util.Scanner;
public class CoffeeShop 
{

	public static void main(String[] args) 
	{
		int selection;
		int response;
		int drink = 0;
		final int COFFEE = 1;
		final int ESPRESSO = 2;
		final int TEA = 3;
		int addIced;
		int addCream;
		int addSugar;
		int addCaramel;
		int addChocolate;
		int addOneShot;
		int addTwoShots;
		double coffeePrice = 3.25;
		double espressoPrice = 4.25;
		double teaPrice = 2.75;
		int xtra;
		double cream = 0.50;
		double sugar = 0.50;
		int ice = 0;
		int caramel = 0;
		int chocolate = 0;
		int shot1 = 0;
		double shot2 = 1.25;
		Scanner input = new Scanner(System.in);

		
		while(drink < 4)
		{
			System.out.println("Would you like to order a drink? 1 for YES; 2 for NO");
			drink = input.nextInt();
			System.out.println("Enter 1 for coffee, 2 for espresso, 3 for tea");
			selection = input.nextInt();
			while(selection < 2)
			{
				//System.out.println("You chose " + drink);
				System.out.println("Do you want iced? 1 for YES; 2 for NO");
				addIced = input.nextInt();
				System.out.println("Do you want cream? 1 for YES; 2 for NO");
				addCream = input.nextInt();
				System.out.println("Do you want sugar? 1 for YES; 2 for NO");
				addSugar = input.nextInt();
				break;
				
			}
			while(selection > 1 && drink < 3)
			{
				//System.out.println("You chose " + drink);
				System.out.println("Do you want caramel? 1 for YES; 2 for NO");
				addCaramel = input.nextInt();
				System.out.println("Do you want chocolate? 1 for YES; 2 for NO");
				addChocolate = input.nextInt();
				System.out.println("Do you want one shot? 1 for YES; 2 for NO");
				addOneShot = input.nextInt();
				System.out.println("Do you want two shots? 1 for YES; 2 for NO");
				addTwoShots = input.nextInt();
				
			}
			
			//++drink;
			
		}
		
		
		
		
		


	}

}
