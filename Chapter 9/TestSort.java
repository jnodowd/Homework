package chapter_9;
//Filename: TestSort.java
//Written by: Jon O'Dowd
//Written on: 08/22/2018

import java.util.Scanner;

public class TestSort 
{

	public static void main(String[] args) 
	{
	//	int[] someNums = new int[5];
		
	//	Scanner keyboard = new Scanner(System.in);
	//	int a, b, temp;
		

		
		
		InsertionSort is = new InsertionSort();
		System.out.println("Insertion Sort");
		is.insertionSort();
		System.out.println();
		
		BubbleSort bs = new BubbleSort();
		System.out.println("Bubble Sort");
		bs.bubbleSort();
		
	}



}
