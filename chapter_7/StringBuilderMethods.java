package chapter_7;
//filename: StringBuilderMethods.java
//written by: Jon O'Dowd
//written on: 08/04/2018


public class StringBuilderMethods 
{
	public static void main(String[] args) 
	{
		StringBuilder str = new StringBuilder("singing");
		System.out.println(str);
		
		str.append(" in the dead of ");
		System.out.println(str);
		
		str.insert(0, "Black");
		System.out.println(str);
		str.insert(5, "bird ");
		System.out.println(str);
		str.append("night");
		System.out.println(str);
	}
}
