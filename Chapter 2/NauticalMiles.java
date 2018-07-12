public class NauticalMiles
{
   public static void main(String[] agrs)
   {
      final double KILOS_PER_NM = 1.852;
      final double MILES_PER_NM = 1.150779;
      double nauticalMiles = 54;
      
      double kilometers = nauticalMiles * KILOS_PER_NM;
      double miles = nauticalMiles * MILES_PER_NM;
      
      System.out.println("There are " + miles + " miles in " + nauticalMiles + " nautical miles.");
      System.out.println("There are " + kilometers + " kilometers in " + nauticalMiles + " nautical miles.");      
   }
}