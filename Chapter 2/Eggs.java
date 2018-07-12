import javax.swing.JOptionPane;
public class Eggs
{
   public static void main(String[] args)
   {
      final int eggsPerDzn = 12;
      double dznPrice = 3.25;
      double singlePrice = 0.45;
      double eggs;
      String eggsString;
      eggsString = JOptionPane.showInputDialog(null, "Please enter the number of eggs you would like to order...");
      eggs = Double.parseDouble(eggsString);
      
      double dznOrdered = eggs / eggsPerDzn;
      dznOrdered = dznOrdered * 100;
      long roundedAnswer = Math.round(dznOrdered);
      dznOrdered = roundedAnswer / 100;
      
      double orderedSingle = eggs % eggsPerDzn;
      double dznPriceTotal = dznOrdered * dznPrice;
      double singlePriceTotal = orderedSingle * singlePrice;
      double orderTotalPrice = dznPriceTotal + singlePriceTotal;
      
      System.out.println("You ordered a total of " + eggs + " eggs.");
      System.out.println("That's " + dznOrdered + " dozen at $" + dznPrice + " per dozen and " + orderedSingle + " loose eggs at " + singlePrice + " each for a total of $" + orderTotalPrice + ".");
   }
} 