
//Filename: CoffeeShop2.java
//Written by: Jon O'Dowd
//Written on: 07/26/2018

import java.util.Scanner;
public class CoffeeShop2
{

	public static void main(String[] args) 
	{
		int selection = 0;
		int drink = 0;
		int addIced = 0;
		int addCream = 0;
		int addSugar = 0;
		int addCaramel = 0;
		int addChocolate = 0;
		int addOneShot = 0;
		int addTwoShots = 0;
		
		double coffeePrice = 3.25;
		double espressoPrice = 4.25;
		double teaPrice = 2.75;
		
		double cream = 0.50;
		double sugar = 0.50;
		double ice = 0.00;
		double caramel = 0.00;
		double chocolate = 0.00;
		double shot1 = 0.00;
		double shot2 = 1.25;
		double subtotal = 0;
		double subtotal2 = 0;
		double subtotal3 = 0;
		Scanner input = new Scanner(System.in);
		
		int response = 1;
		while(response < 100)
		{
			System.out.println("Enter 1 for coffee, 2 for espresso, 3 for tea, or 9 for none");
			selection = input.nextInt();
			
			//Selection for Coffee
			while(selection == 1)
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
			
			//Selection for Espresso
			while(selection == 2)
			{
				//System.out.println("You chose " + drink);
				System.out.println("Do you want Caramel? 1 for YES; 2 for NO");
				addCaramel = input.nextInt();
				System.out.println("Do you want Chocolate? 1 for YES; 2 for NO");
				addChocolate = input.nextInt();
				System.out.println("Do you want one shot? 1 for YES; 2 for NO");
				addOneShot = input.nextInt();
				System.out.println("Do you want two shots? 1 for YES; 2 for NO");
				addTwoShots = input.nextInt();
				break;
			}
			
			//Selection for Tea
			while(selection == 3)
			{
				break;
			}
		
			//Selection to end order
			while(selection > 3)
			{
				break;
			}
	++response;
	
			if (selection == 1)
			{	System.out.println("Charge for Coffee: $" + coffeePrice);
				if (addIced == 1)
					System.out.println("Charge for Iced: $" + ice);

				if (addCream == 1)
					System.out.println("Charge for Cream: $" + cream);

				if (addSugar == 1)
					System.out.println("Charge for Sugar: $" + sugar);

				subtotal = ((coffeePrice) + (ice) + (cream) + (sugar));
				System.out.println("Your subtotal for Coffee is: $" + subtotal);
			}
			if (selection == 2)
			{	System.out.println("Charge for Espresso: $" + espressoPrice);
				if (addCaramel == 1)
					System.out.println("Charge for Caramel: $" + caramel);
				if (addChocolate == 1)
					System.out.println("Charge for Chocolate: $" + chocolate);
				if (addOneShot == 1)
					System.out.println("Charge for One Shot: $" + shot1);
				if (addTwoShots == 1)
					System.out.println("Charge for Two Shots: $" + shot2);
				subtotal2 = ((espressoPrice) + (caramel) + (chocolate) + (shot1) + (shot2));
				System.out.println("Your subtotal for Espresso is: $" + subtotal2);
			}	
			if (selection ==3)
			{	System.out.println("Charge for Tea: $" + teaPrice);
				subtotal3 = (teaPrice);
				System.out.println("Your subtotal for Tea is: $" + subtotal3);
			}
			
			if (selection > 3)
			{	
				System.out.println("Your bill is: $" + ((subtotal) + (subtotal2) + (subtotal3)));
				break;

			}
		}
	}
}
