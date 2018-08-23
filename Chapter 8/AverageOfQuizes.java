package chapter_8;
//Filename: AverageOfQuizes.java
//Written by: Jon O'Dowd
//Written on: 08/05/2018
import java.util.*;

public class AverageOfQuizes 
{
	public static void main(String[] args) 
	{
	//The AverageOfQuizzes program declares an array that can hold 10 quiz scores.
		int[] scores = new int[10]; 
		int score = 0; 
		int count = 0; 
		int total = 0; 
		final int QUIT = 999;
		final int MAX = 10; 
		Scanner input = new Scanner(System.in); 
		
	//The user is prompted for the first quiz score
		System.out.print("Enter quiz score or " + QUIT + " to quit >> "); 
		score = input.nextInt(); 
		
	//A while loop starts and continues as long as the user does not enter 999,
		while(score != QUIT)
		{	
			scores[count] = score;	//Within the loop, the entered score is placed in the scores array, 
			total += scores[count];	//The score is added to a running total 
			++count;				//The count of scores is incremented 
			if(count == MAX)		//If the score just entered is the tenth score, the score is forced to 999 and the loop ends; 
				score = QUIT; 
			else
			{ 						//otherwise, the user is prompted for the next score.
				System.out.print("Enter next quiz score or " + QUIT + " to quit >> "); 
				score = input.nextInt(); 
				} 
			}
		System.out.print("\nThe scores entered were: ");  	//When the loop eventually ends, "count" holds the number of scores entered. 
		for(int x = 0; x < count; ++x) 						//The variable "count" then can be used to control the output loop and to calculate the average score
			System.out.print(scores[x] + " "); 				//This line prints each score followed by a space (all on one line)
		if(count != 0) 
			System.out.println("\n The average is " + (total * 1.0 / count));   //"total" is the running total of all the scores entered.
		else 
			System.out.println("No scores were entered.");
	}
}
