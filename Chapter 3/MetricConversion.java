import java.util.Scanner;

public class MetricConversion
{
   public static void main(String[] args)
   {
      int num;
      
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Please enter a number >> ");
      num = keyboard.nextInt();
      
      convertToCentimeters(num);
      convertToLiters(num);
   }
   
   public static void convertToCentimeters(int num)
   {
      final double CENTS_IN_INCH = 2.54;
      double cents = num*CENTS_IN_INCH;
      System.out.println("There are "+ cents + " centimeters in " + num + " inches.");
      
   }
   
   public static void convertToLiters(int num)
   {
      final double GAL_IN_LITER = 3.7854;
      double liters = num*GAL_IN_LITER;
      System.out.println("There are " + liters + " liters in " + num + " gallons.");
   }
}