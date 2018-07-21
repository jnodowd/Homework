//Filename: TestCustomer.java
//Written by: Jon O'Dowd
//Written on: 07/14/2018

public class TestCustomer 
{

	public static void main(String[] args) 
	{
		Customer c1 = new Customer("Bill", "Hill");
		
		System.out.println(c1.getWholeName());
		c1.pay();
	}
}
