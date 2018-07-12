public class QuartsToGallons
{
   public static void main(String[] args)
   {
      final int quartsPerGal = 4;
      int jobQuarts = 18;
      int jobGallons;
      int jobPartialGal;
      
      jobGallons = jobQuarts / quartsPerGal;
      jobPartialGal = jobQuarts % quartsPerGal;
      
      System.out.println("A job that needs "+jobQuarts + " quarts requires "+jobGallons + " gallons plus "+jobPartialGal + " quarts.");
      
   }
}