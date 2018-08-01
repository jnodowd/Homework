//Filename: Sale.java
//Written by: Jon O'Dowd
//Written on: 07/28/2018

public class Sale {
	
	int receiptNum;
	double retailPrice;
	double discRate;
	final double TAX_RATE = .08;
	double total = 0;
	
	
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public int getReceiptNum() {
		return receiptNum;
	}
	public void setReceiptNum(int receiptNum) {
		this.receiptNum = receiptNum;
	}
	public double getRetailPrice() {
		return retailPrice;
	}
	public void setRetailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}
	public double getDiscRate() {
		return discRate;
	}
	public void setDiscRate(double discRate) {
		this.discRate = discRate;
	}
	
	public void computeSaleAmt()
	{
		double discAmt = (retailPrice * (discRate/100));
		double discountedAmt = ((retailPrice) - (retailPrice * (discRate/100)));
		double taxAmt = (TAX_RATE * ((retailPrice) - (retailPrice * (discRate/100))));
		double saleAmt = (taxAmt + discountedAmt);
		System.out.println("Discount subtracted: $" + (retailPrice * (discRate/100)) + " Tax Rate: " + TAX_RATE + " Tax: $" + taxAmt);
		System.out.println("Discounted Price including Tax: $" + saleAmt);
		total += saleAmt;
		System.out.println("Total is " + total);

	}

}
