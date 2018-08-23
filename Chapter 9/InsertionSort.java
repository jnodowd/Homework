package chapter_9;
//filename: InsertionSortDemo.java
//written by: Jon O'Dowd
//written on: 08/18/2018

import java.util.*;
public class InsertionSort 
{
	public static void insertionSort()
	{
		int[] someNums = new int[5];
		
		Scanner keyboard = new Scanner(System.in);
		int a, b, temp;
		
		for(a = 0;  a < someNums.length; ++a)
		{
			System.out.print("Enter number " + (a + 1) + " >> ");
			someNums[a] = keyboard.nextInt();
		}
		displayIS(someNums, 0);
		a = 1;
		while(a < someNums.length)
		{
			temp = someNums[a];
			b = a - 1;
			while(b >= 0 && someNums[b] > temp)
			{
				someNums[b + 1] = someNums[b];
				--b;
			}
			someNums[b + 1] = temp;
			displayIS(someNums, a);
			++a;
		}
		
		
	}

	public static void displayIS(int[] someNums, int a)
	{
		System.out.print("Iteration " + a + ": ");
		for(int x = 0; x < someNums.length; ++x)
			System.out.print(someNums[x] + " ");
		System.out.println();
		
		
	}
}
