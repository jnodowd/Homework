package chapter_9;

public class BubbleSortC 
{

	public static void main(String[] args) 
	{
		int someNums[] = {88, 33, 99, 22, 54};
		int a;
		int b;
		int temp;
		int comparisonsToMake = someNums.length-1;
		
		for(a=0; a<someNums.length-1; ++a)
			for(b=0; b<comparisonsToMake; ++b)
				if(someNums[b] > someNums[b+1])
				{
					temp = someNums[b];
					System.out.println(temp);
					someNums[b] = someNums[b+1];
					someNums[b+1] = temp;
				}
		for(int c = 0; c < someNums.length; c++)
			
			System.out.println(someNums[c]);
	}
}
