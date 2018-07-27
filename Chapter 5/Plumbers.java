//Filename: Plumbers.java
//Written by: Jon O'Dowd
//Written on: 07/21/2018

import java.util.Scanner;

import chapter_5.OuterClass.InnerClass;

public class Plumbers 
{
	private static int orderType;
	private static int roomCount = 0;
	private static int pipeCount = 0;
	
	class InnerClass 
	{
		private int rate1 = 300;
		private int rate2 = 500;
		private int rate3 = 750;
		private int rate4 = 50;
		private int rate5 = 70;
		private int rate6 = 100;
		
		public void invoke() 
		{
			findData();
			
		}
	}
	
	public void findData() 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1 for Flood, 2 for Burst Pipes...");
		orderType = input.nextInt();
		
		
		if (orderType == 1)
		{	
			System.out.println("You chose Flood Damage.");
			System.out.println("Type the number of rooms that were damaged...");
			roomCount = input.nextInt();
		}	
		else
		{	System.out.println("You chose Burst Pipes");
			System.out.println("Type the number of pipes that burst...");
			pipeCount = input.nextInt();
		}
	}
	
	public static void main(String[] args)
	{
		Plumbers.InnerClass innerObj = new Plumbers().new InnerClass();
		
		innerObj.invoke();
		
		if (roomCount == 0)
			System.out.println();
		else if ((roomCount >= 1) && (roomCount < 2))
			System.out.println("Your estimate for " + roomCount + "Room(s) is $" + innerObj.rate1);
		else if ((roomCount == 2) || (roomCount < 3))
			System.out.println(roomCount + "Room(s) - Your estimate is $" + innerObj.rate2);
		else if ((roomCount != 2) || (roomCount >= 3))
			System.out.println(roomCount + "Room(s) - Your estimate is $" + innerObj.rate3);
		
		if (pipeCount == 0)
			System.out.println();
		else if ((pipeCount >= 1) && (pipeCount < 2))
			System.out.println(pipeCount + "Pipe(s) - Your estimate is $" + innerObj.rate4);
		else if ((pipeCount == 2) || (pipeCount < 3))
			System.out.println(pipeCount + "Pipe(s) - Your estimate is $" + innerObj.rate5);
		else if ((pipeCount != 2) || (pipeCount >= 3))
			System.out.println(pipeCount + "Pipe(s) - Your estimate is $" + innerObj.rate6);
			
	}

}