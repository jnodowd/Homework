package chapter_9;

public class BubbleSortA 
{

	public static void main(String[] args) 
	{
		int number[] = {88, 33, 99, 22, 54};
		//	int number[] = {99, 88, 54, 33, 22};
					//	0, 1, 2, 3, 4
		int temp;
		boolean fixed = false;
		
		while(fixed==false)
		{
			fixed = true;
			
		for(int i = 0; i < number.length-1; i++)
		{
			if(number[i] > number[i + 1])
			    // if 8  >  5
			{	
				temp = number[i];
				number[i] = number[i+1];
				number[i+1] = temp;
				
				
				
				
//				temp = number[i+1];
//				     // store 5 in temp
//				number[i+1]=number[i];
//				     // put the 8 in 5's place
//				number[i]=temp;
				System.out.println(temp);
				fixed=false;
			}
		}
		}
		for(int i = 0; i < number.length; i++)
			System.out.println(number[i]);
	}
}
