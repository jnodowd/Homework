package chapter_6;
// Filename:  DemoIncrement.java
// Written by: Jon O'Dowd
// Written on: 07/23/2018

public class DemoIncrement 
{
	public static void main(String[] args) 
	{
		int v = 4;
		int plusPlusV = ++v;
		v = 4;
		int vPlusPlus = v++;
		
		System.out.println("v is " + v);
		System.out.println("++v is " + plusPlusV);
		System.out.println("v++ is " + vPlusPlus);
		

	}

}
