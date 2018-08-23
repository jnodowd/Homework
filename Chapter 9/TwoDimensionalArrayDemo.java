package chapter_9;

import java.util.Scanner;
public class TwoDimensionalArrayDemo 
{

	public static void main(String[] args) 
	{
		int[][] arr = new int[3][3];
		Scanner input = new Scanner(System.in);
		int row, column;
		final int QUIT = 99;
		
		System.out.println("Enter a row or " + QUIT + " to quit>>");
		row = input.nextInt();
		
		while(row != QUIT)
		{
			System.out.print("Enter a column>>");
			column = input.nextInt();
			if(row < arr.length && column < arr[row].length)
			{
				arr[row][column]++;
				for(int r = 0; r < arr.length; ++r)
				{
					for(int c = 0; c < arr[r].length; ++c)
						System.out.print(arr[r][c] + " ");
					System.out.println();
				}
			}
			else
				System.out.println("Invalid position selected");
			
			System.out.print("Enter a row or " + QUIT + " to quit>>");
			row = input.nextInt();
		}

	}

}
