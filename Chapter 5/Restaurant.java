//Filename: Restaurant.java
//Written by: Jon O'Dowd
//Written on: 07/21/2018

import java.util.Scanner;
public class Restaurant {

	public static void main(String[] args) 
	{
		int foodType;
		String orderMsg = null;
		
		//Codes for entrees and toppings
		final int SANDWICH_CODE = 1;
		final int SALAD_CODE = 2;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Type 1 for sandwich or 2 for salad...");
		foodType = input.nextInt();
		
		switch(foodType)
		{
		case(SANDWICH_CODE):
			orderMsg = "Sandwich";
			break;
		case(SALAD_CODE):
			orderMsg = "Salad";
			break;
		}
		
		if(foodType == 1)
		{
			System.out.println("You have ordered a " + orderMsg + " - now pick your toppings...");
			sandwichTopping();
		}		
		else 
		{
			System.out.println("You have ordered a " + orderMsg + " - now pick your toppings...");
			saladTopping();
		}
	}
	public static  void sandwichTopping()
	{
		double sandPrice = 7;
		double condLettuce = 0;
		double condTomato = 0;
		double condCheese = 0;
		double totalPrice = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Type 3 for lettuce or 9 for none");
		int sandLettuce = input.nextInt();
		if (sandLettuce == 3)
			condLettuce = 1;
		else
			condLettuce = 0;
		System.out.println("Type 4 for tomato or 9 for none");
		int sandTomato = input.nextInt();
		if (sandTomato == 4)
			condTomato = 1;
		else
			condTomato = 0;
		System.out.println("Type 5 for cheese or 9 for none");
		int sandCheese = input.nextInt();
		if (sandCheese == 5)
			condCheese = 1;
		else
			condCheese = 0;
		System.out.println("Your Receipt: Sandwich $" + sandPrice);
		if (condLettuce == 1)
		System.out.println("with Lettuce: $" + condLettuce);
		if (condTomato == 1)
		System.out.println("with Tomato: $" + condTomato);
		if (condCheese == 1)
		System.out.println("with Cheese: $" + condCheese);
		totalPrice = (sandPrice + condLettuce + condTomato + condCheese);
		System.out.println("Total Price: $" + totalPrice);
		
	}
	public static void saladTopping()
	{
		double salPrice = 7;
		double topTomatoes = 0.0;
		double topCheese = 0.0;
		double totalPrice;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Type 6 for tomatoes or 9 for none");
		int salTomatoes = input.nextInt();
			if (salTomatoes == 6)
				topTomatoes = 0.50;
			else
				topTomatoes = 0;
		
		System.out.println("Type 7 for cheese or 9 for none");
		int salCheese = input.nextInt();
			if (salCheese == 7)
				topCheese = 0.50;
			else
				topCheese = 0;
		
		System.out.println("Your Receipt: Salad $" + salPrice);
		if (salTomatoes == 6)
		System.out.println("with Lettuce: $" + topTomatoes);
		if (salCheese == 7)
		System.out.println("with Tomato: $" + topCheese);
		totalPrice = (salPrice + topTomatoes + topCheese);
		System.out.println("Total Price: $" + totalPrice);
	}
}