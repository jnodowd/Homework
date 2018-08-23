package chapter_9;
//Filename: CheckerBoard.java
//Written by: Jon O'Dowd
//Written on: 08/21/2018

public class CheckerBoard 
{

    public static void main(String[] args) 
    {
    	String[][] board = new String[8][8];

        for (int i = 0; i < 8; i++) 
        {
        	for (int j = 0; j < 8; j++) 
        	{
        		board[i][j] = null;
        		if((i+j)%2==0)
        		{
//        			value = "B";
//        			else
//        				value = "W";
        		}
        		//        		board[i][j] = (i + j) % 2 == 0 ? "B" : "W";
        	}
        }

        for (int i = 0; i < 8; i++) 
        {
        	for (int j = 0; j < 8; j++) 
        	{
        		System.out.print(board[i][j]+" ");
        	}
        
        	System.out.println();
        }
    }
}
