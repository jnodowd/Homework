import java.util.Scanner;

public class PaintCalculator
{
   public static void main(String[] args)
   {
      int length;
      int width;
      int height;
      double cost;
      
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Please enter the length of the room in feet>>");
      length = keyboard.nextInt();
      System.out.println("Please enter the width of the room in feet>>");
      width = keyboard.nextInt();
      System.out.println("Please enter the height of the room in feet>>");
      height = keyboard.nextInt();
      
      calculateWallArea(length,width,height);

      
      System.out.println("The cost to paint a "+length+"-by-" +width+"-foot room with "+height+"-foot ceilings is $"+ cost);
   }
   
   public static double calculateWallArea(int length, int width, int height)
   {
      double paintPrice = 32;
      int sqft;
      int galNeeded = 0;
      
      sqft = ((length*height)+(width*height))*2;
      calculateGallons(sqft);
      System.out.println(sqft);
      double cost = galNeeded * paintPrice;
      return cost;
      
   }
   public static int calculateGallons(int sqft)
   {
      int coverage = 350;
      int galNeeded = (sqft/coverage);
      System.out.println("It will take "+galNeeded+" gallons to paint the room.");
      return galNeeded;
   }
}