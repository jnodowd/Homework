package chapter_8;
//Filename: Contact.java
//Written by: Jon O'Dowd
//Written on: 08/10/2018

//========================================================================================================================

//Write a program that creates a contact list using an array. 
//The program should contain two classes, a Contact.java class which has the following fields, name, number, and address.

//The second class, MyContacts.java should present the user with the following options: Add, Remove, Change Order, Print, and Exit. 
//The Add option should allow the user to enter in a new contact (name, number, and address) to the end of the list. 

public class Contact 
{
	//Object variables...
	String name;
	String address;
	String number;
	
   
   public Contact()//default constructor
   {
      name = "unknown";
      number = "unknown";
      address = "unknown";
   }
   
	public Contact(String n, String v, String a) //constructor with 3 parameters
   {
      name = n;
      number = v;
      address = a;
   }
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
}

