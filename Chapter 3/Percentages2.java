import java.util.Scanner;

public class Percentages2
{
   public static void main(String[] args)
   {
      double v1;
      double v2;
      
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter the 1st number >>");
      v1 = keyboard.nextDouble();
      System.out.println("Enter the 2nd number >>");
      v2 = keyboard.nextDouble();
      
      computePercent(v1,v2);
      computePercent(v2,v1);
   }
   
   public static void computePercent(double v1, double v2)
   {
      
      double percent = (v1/v2) *100;
      
      System.out.println(v1+" is "+percent+"% of "+v2);
   }
}