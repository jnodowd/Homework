public class Percentages
{
   public static void main(String[] args)
   {
      double v1 = 4;
      double v2 = 10;
      
      computePercent(v1,v2);
      computePercent(v2,v1);
   }
   
   public static void computePercent(double v1, double v2)
   {
      
      double percent = (v1/v2) *100;
      
      System.out.println(v1+" is "+percent+"% of "+v2);
   }
}