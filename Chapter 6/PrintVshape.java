package chapter_6;

public class PrintVshape 
{

	public static void main(String[] args) 
	{
		int i, j;
		for (i = 6 - 1; i >= 0; i--) 
		{
			// outer gap loop
			for (j = 6 - 1; j > i; j--) 
			{
				System.out.print(" ");
			}
			System.out.print("V");

			// inner gap loop
			for (j = 1; j < (i * 2); j++)
				System.out.print(" ");

			if (i >= 1)
				System.out.print("V");
			System.out.print("\n");
		}

	}

}
