import java.util.Scanner;

public class TestSandwich
{
   public static void main(String [] args)
   { 
       String ingredient;
       String bread;
       double price;
       
       Sandwich firstIngredient = new Sandwich();
       Sandwich secIngredient = new Sandwich();
       Scanner keyboard = new Scanner(System.in);
       
      System.out.print("Enter main ingredient >> "); 
      ingredient = keyboard.nextLine();
      System.out.print("Enter bread type >>");
      bread = keyboard.nextLine(); 
      System.out.print("Enter price >>");
      price = keyboard.nextDouble();

       
       firstIngredient.setMainIngredient(ingredient);
       firstIngredient.setBreadDescription(bread);
       firstIngredient.setPrice(price);
       
       
       System.out.println("Ingredient details:");
       System.out.println(firstIngredient.getMainIngredient()+ " on "+ bread + " for $"+ price);
       
       System.out.println("Second Ingredient details");
       System.out.println(secIngredient.getMainIngredient()+ " on "+ secIngredient.getBreadDescription() + " for $"+ secIngredient.getPrice());

      }
}