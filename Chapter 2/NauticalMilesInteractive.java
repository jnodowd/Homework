import java.util.Scanner;
public class NauticalMilesInteractive
{
   public static void main(String[] agrs)
   {
      Scanner input = new Scanner(System.in);
      final double KILOS_PER_NM = 1.852;
      final double MILES_PER_NM = 1.150779;
      double nauticalMiles;
      
      System.out.println("Please enter the number of nautical miles...");
      nauticalMiles = input.nextDouble();
      
      double kilometers = nauticalMiles * KILOS_PER_NM;
      double miles = nauticalMiles * MILES_PER_NM;
      
      System.out.println("There are " + miles + " miles in " + nauticalMiles + " nautical miles.");
      System.out.println("There are " + kilometers + " kilometers in " + nauticalMiles + " nautical miles.");      
   }
}