import java.util.Scanner;
public class EggsModified
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      final int eggsPerDzn = 12;
      double dznPrice = 3.25;
      double singlePrice = 0.45;
      int eggs;
      System.out.print("Please enter the number of eggs you would like to order...");
      eggs = input.nextInt();
      int dznOrdered = eggs / eggsPerDzn;
      int orderedSingle = eggs % eggsPerDzn;
      double dznPriceTotal = dznOrdered * dznPrice;
      double singlePriceTotal = orderedSingle * singlePrice;
      double orderTotalPrice = dznPriceTotal + singlePriceTotal;
      
      System.out.println("You ordered a total of " + eggs + " eggs.");
      System.out.println("That's " + dznOrdered + " dozen at $" + dznPrice + " per dozen and " + orderedSingle + " loose eggs at " + singlePrice + " each for a total of $" + orderTotalPrice + ".");
   }
}