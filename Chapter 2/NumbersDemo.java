public class NumbersDemo
{
   public static void main(String[] args)
   {
      int v1 = 15;
      int v2 = 24;

      displayTwiceTheNumber(v1,v2);
      displayNumberPlusFive(v1,v2);
      displayNumberSquared(v1,v2);
   }

   public static void displayTwiceTheNumber(int v1, int v2)
   {
      int newV1;
      int newV2;
      int rate = 2;
      newV1 = v1 * rate;
      newV2 = v2 * rate;
      
      System.out.println("Twice the value of v1 is " + newV1);
      System.out.println("Twice the value of v2 is " + newV2);
   }
   public static void displayNumberPlusFive(int v1, int v2)
   {
      int newV1;
      int newV2;
      int rate = 2;
      newV1 = v1 + 5;
      newV2 = v2 + 5;
      
      System.out.println("v1 " + v1 + " plus five = " + newV1);
      System.out.println("v2 " + v2 + " plus five = " + newV2);
   }
   public static void displayNumberSquared(int v1, int v2)
   {
      int newV1;
      int newV2;
      newV1 = v1 * v1;
      newV2 = v2 * v2;
      
      System.out.println("v1 squared is: " + newV1);
      System.out.println("v2 squared is: " + newV2);
    }  
   
}