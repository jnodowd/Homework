package chapter_6;

public class V 
{
	public static void main(String[] args){
	}
	public void drawV(int hight)
		{
			int rowLen = (hight-1)*2;

	        for(int i=0; i<hight; i++)
	        {
	            int start = i;
	            int end = rowLen-i;
	            for(int j=0;j<=rowLen; j++)
	            {
	                if(j==end)
	                {
	                    System.out.println("*");
	                    break;
	                }
	                else if(j==start)
	                {
	                    System.out.print("*");
	                }
	                else
	                {
	                    System.out.print(" ");
	                }
	            }
	        }
	    }
	}




