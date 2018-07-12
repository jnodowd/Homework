public class Sandwich
{
   String mainIngredient = "tuna";
   String breadDescription = "wheat";
   double price = 4.99;
      
   public Sandwich()
   {
      mainIngredient = "turkey";
      breadDescription = "rye";
      price = 5.99;
       
   }
   
   public void setMainIngredient(String ingredient)
   {
      mainIngredient = ingredient;
   }   
   public String getMainIngredient()
   {
      return mainIngredient;
   } 
   
   public void setBreadDescription(String bread)
   {
      breadDescription = bread;
   }
   public String getBreadDescription()
   {
      return breadDescription;
   }
   
   public void setPrice(double pr)
   {
      price = pr;
   }
   public double getPrice()
   {
      return price;
   }
   
}