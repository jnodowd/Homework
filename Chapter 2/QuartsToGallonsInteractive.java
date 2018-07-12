import java.util.Scanner;
public class QuartsToGallonsInteractive
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      final int quartsPerGal = 4;
      int jobQuarts;
      int jobGallons;
      int jobPartialGal;
      System.out.print("Please enter the total number of quarts...");
      jobQuarts = input.nextInt();
      
      jobGallons = jobQuarts / quartsPerGal;
      jobPartialGal = jobQuarts % quartsPerGal;
      
      System.out.println("A job that needs "+jobQuarts + " quarts requires "+jobGallons + " gallons plus "+jobPartialGal + " quarts.");
      
   }
}