
public class NestedLoops {

	public static void main(String[] args) 
	{
		for(int outer =1; outer <= 6; outer++)
		{	
			for(int inner = 1; inner<=outer; inner++)
				System.out.print(" ");
				System.out.print("V");
				System.out.println();
		}
		for(int outer1 = 6; outer1 <= 1; outer1++)
		{	
			for(int inner1 = 6; inner1<=outer1; inner1++)
				System.out.print(" ");
				System.out.print("V");
				System.out.println();
		}

	}

}
