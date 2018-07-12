import java.util.Scanner;

public class BookstoreCredit
{
   public static void main(String[] args)
   {
      String name;
      double gpa;
      
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Please enter your first name ..");
      name = keyboard.nextLine();
      System.out.println("Please enter your GPA >>");
      gpa = keyboard.nextDouble();
      
      computeCredit(name,gpa);
      
   }
   
   public static void computeCredit(String name, double gpa)
   {
      double credit = gpa * 10;
      
      System.out.println("Thank you "+name+". With a GPA of " + gpa + " your Bookstore Credit is $"+credit+".");
       
   }
}