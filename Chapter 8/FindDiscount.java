package chapter_8;
//Filename: FindDiscount.java
//Written by: Jon O'Dowd
//Written on: 08/07/2018
import javax.swing.*;
public class FindDiscount 
{

	public static void main(String[] args) 
	{
		final int NUM_RANGES = 5;
		
		int[] discountRangeLimits = {1, 13, 50, 100, 200};
		double[] discountRates = {0.00, 0.10, 0.14, 0.18, 0.20};
		double customerDiscount;
		String strNumOrdered;
		int numOrdered;
		
		//Starting out with sub 4 (5-1=4)
		int sub = NUM_RANGES - 1;
		
		strNumOrdered = JOptionPane.showInputDialog(null, "How many items are ordered?"); 
		numOrdered = Integer.parseInt(strNumOrdered);
		
		//Then, starting at the last discountRangeLimits array element, for any numOfItems greater than or equal to discountRangeLimits[4], 
		//the appropriate discount is discounts[4].
		//for any numOrdered less than discountRangeLimits[4], you should decrement the subscript and look in a lower range.
		while(sub >= 0 && numOrdered < discountRangeLimits[sub]) --sub;
		customerDiscount = discountRates[sub]; 
		JOptionPane.showMessageDialog(null, "Discount rate for " + numOrdered + " items is " + customerDiscount);

		

		
		

	}

}
