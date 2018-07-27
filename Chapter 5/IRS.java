//Filename: IRS.java
//Written by: Jon O'Dowd
//Written on: 07/21/2018

import java.util.Scanner;
public class IRS 
{
	
	private static int q1;  //no W-2
	private static int q2;  //No receipts
	private static int q3;  //Child decuctions greater than three
	private static int childDed;

	class InnerClass
	{
		private int tax1 = 500;
		private int tax2 = 300;
		private int tax3 = 1000;
		public void evaluate()
		{
			askQs();
		}
	}
	public void askQs()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1 for no W-2's or 2 if they are included...");
		q1 = input.nextInt();
		System.out.println("Enter 1 for no receipts or 2 if they are included...");
		q2 = input.nextInt();
		System.out.println("Enter number of child deductions...");
		q3 = input.nextInt();
		
		
	}
	public static void main(String[] args)
	{
	
		IRS.InnerClass innerObj = new IRS().new InnerClass();
		innerObj.evaluate();
		
		if ((q1<2) || (q2<2) || (q3>3))
		{	System.out.println("Your audit has Failed.");
			System.out.println("Here is your bill: ");
		}
		else
		{	System.out.println("Pass");
		}
		
		if (q1 == 1)
			System.out.println("Fine for no W-2: $" + innerObj.tax1);
			
		if (q2 == 1)
			System.out.println("Fine for no receipts: $" + innerObj.tax2);
		if (q3 >3)
			if(q1==1 && q2==1)
				System.out.println("Fine for child decuctions greater than three: $" + innerObj.tax3);
			else
				System.out.println(innerObj.tax3 = 0);
	}
}