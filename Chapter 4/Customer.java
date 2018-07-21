//Filename: Customer.java
//Written by: Jon O'Dowd
//Written on: 07/14/2018

public class Customer {
	
	
	// object variables
	private String name;
	private String lastName;
	

	
	//constructor method
	public Customer(String name1, String name2)
	{
		name = name1;
		lastName = name2;
	}
	
	//accessor methods
	public String getName()
	{
		return name;
	}
	public String getLastName()
	{
		return lastName;
	}
	
	public String getWholeName()
	{
		return name + " " + lastName;
	}
	

	
	public void pay()
	{
		CreditCard a = new CreditCard();
		a.pay();
	}
	

	//Nested class "CreditCard"
	private class CreditCard
	{
	public void pay()
	{
		System.out.println("Paid");
	}
	}

}
