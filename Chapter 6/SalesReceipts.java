//Filename: SalesReceipts.java
//Written by; Jon O'Dowd
//Written on: 07/28/2018
import java.util.Scanner;
public class SalesReceipts {

	public static void main(String[] args) {
				
		int response = 0;
	
		
		do
		{
		
		Scanner input = new Scanner(System.in);
		
		Sale a = new Sale();
		System.out.println("Please enter the invoice number");
		a.setReceiptNum(input.nextInt());
		System.out.println("Please enter the item price");
		a.setRetailPrice(input.nextDouble());
		System.out.println("Please enter the sale discount rate as a whole number, ten percent would be 10");
		a.setDiscRate(input.nextDouble());
		
		System.out.println("Invoice #" + a.getReceiptNum() + " Price of item: $" + a.getRetailPrice());
		a.computeSaleAmt();
		
		System.out.println("Do you want to input another item?  1=Yes or 0=No");
		response = input.nextInt();
		

		
		} while(response ==1);
		
		Sale a = new Sale();
		System.out.println("Total is: " + a.getTotal());
	
	}

}
