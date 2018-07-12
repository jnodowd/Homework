import java.util.Scanner;
public class InchesToFeetInteractive 
{
	public static void main(String[] args) 
   {
      Scanner input = new Scanner(System.in);
		final int inchesPerFoot = 12;
		int inches;

      System.out.print("Input the number of inches...");
      inches = input.nextInt();

		int feet = inches / inchesPerFoot;
		int remInches = inches % inchesPerFoot;
		
		System.out.println(inches + "inches is " + feet + " feet and " + remInches + " inches.");
	}

}
