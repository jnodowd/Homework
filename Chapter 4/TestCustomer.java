/*
   Student Name
   Java Programming #28865
   11/28/2017
      this class holds contact information
*/

public class Contact
{
   private String name;
   private String number;
   private String address;
   
   public Contact()//default constructor
   {
      name = "unknown";
      number = "unknown";
      address = "unknown";
   }
   
   public Contact(String n, String v, String a)//constructor with 3 parameters
   {
      name = n;
      number = v;
      address = a;
   }
   
   public void setName(String n)//mutator
   {
      name = n;
   }
   
   public String getName()//accessor
   {
      return name;
   }
   
   public void setNumber(String v)//mutator
   {
      number = v;
   }
   
   public String getNumber()//accessor
   {
      return number;
   }
   
   public void setAddress(String a)//mutator
   {
      address = a;
   }
   
   public String getAddress()//accessor
   {
      return address;
   }
}

 

 

 

/*
   Student Name
   Java Programming #28865
   11/28/2017
      This program provides a menu to add/remove/charge order for
     personal contacts
*/

import java.util.Scanner;

public class MyContact
{
   private static Contact[] contacts = new Contact[0];
   private static Scanner keyboard = new Scanner(System.in);
   
   public static void main(String[] args)
   {
      int menuOption;
      
      do
      {
         System.out.println("My Contacts Menu\n1. Add contact\n2. Remove contact\n3. Change Order\n4. Print\n0. Exit");
         menuOption = keyboard.nextInt();
         
         while(menuOption < 0 || menuOption > 4)
         {
            System.out.println(menuOption + " is not a valid option\nMy Contacts Menu\n1. Add contact\n2. Remove contact\n3. Change Order\n4. Print\n0. Exit");
            menuOption = keyboard.nextInt();
         }
            
         if(menuOption == 1)
            contacts = addContact(contacts);
         else
            if(menuOption == 2)
               contacts = removeContact(contacts);
            else
               if(menuOption == 3)
                  contacts = changeOrder(contacts);
               else
                  if(menuOption == 4)
                     printContacts(contacts);
         
         
      
      }while(menuOption != 0);//exits if exit is equal to 0
   }
   
   public static Contact[] addContact(Contact[] c)
   {
      String name;
      String number;
      String address;
      //creates new array adding 1 more element than original array size
      System.out.println("old list length" + c.length);
      Contact[] newList = new Contact[c.length + 1];
      System.out.println("old list length" + c.length);
      System.out.println("new list length " + newList.length);
      
      System.out.print("Enter the contact's name: ");
      keyboard.nextLine();
      name= keyboard.nextLine();
      System.out.print("Enter the contact's phone number: ");
      number = keyboard.nextLine();
      System.out.print("Enter the contact's address: ");
      address = keyboard.nextLine();
      
      /*copies "copy" of contacts array to new newList array*/
      for(int x = 0; x < c.length; ++x)
         newList[x] = c[x];
      
      /*adds new contact to end of newList of array*/
      newList[c.length] = new Contact(name, number, address);
      
      return newList;//returns newList array
   }
   
   public static Contact[] removeContact(Contact[] c)
   {
      int input;
      System.out.println("old list length" + c.length);
      Contact[] newList = new Contact[c.length - 1];
      System.out.println("new list length " + newList.length);
      
      System.out.println("Which contact would you like to remove?");
      for(int x = 0; x < c.length; ++x)
         System.out.println(x + ". Name: " + c[x].getName());
      
      input = keyboard.nextInt();
      
      /*copies elements before selected value*/
      for(int x = 0; x < input; ++x)
         newList[x] = c[x];
      
      /*copies "copy" of contacts array to new newList array starting at selected value
      the rest of the array is copied advanced by one place, the value chosen will not be copied*/
      for(int x = input; x < newList.length; ++x)
      {
         newList[x] = c[x + 1];
      }
      
      System.out.println("last element name " + newList[1].getName());
      
      return newList;//returns newList array
   }
   
   public static Contact[] changeOrder(Contact[] c)
   {
      int contactName;
      int moveTo;
      Contact name = new Contact();//placeholder for object element in array
      Contact position = new Contact();//placeholder for object element in array
      Contact[] newList = new Contact[c.length];
      newList = c;//copies original array data to new array
      
      for(int x = 0; x < c.length; ++x)
         System.out.println(x + ". Name: " + c[x].getName());
      /*asks user for input*/
      System.out.print("Choose a contact to move: ");
      contactName = keyboard.nextInt();
      System.out.print("Choose a position to move " + c[contactName].getName() + " to: ");
      moveTo = keyboard.nextInt();
      
      /*copies data from array at respective index chosen by user*/
      name = c[contactName];
      position = c[moveTo];
      
      /*changes new array data to reflect changed order*/
      newList[contactName] = position;
      newList[moveTo] = name;
      
      return newList;
   }
   
   public static void printContacts(Contact[] c)
   {
      /*foreach loop prints all elements in contacts array to console */
      for(Contact list : c)
         System.out.println("Name: " + list.getName() + "\nNumber: " + list.getNumber() + 
                                 "\nAddress: " + list.getAddress() + "\n");
      
   }
}