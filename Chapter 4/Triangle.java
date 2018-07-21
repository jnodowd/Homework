//Filename: Triangle.java
//Written by: Jon O'Dowd
//Written on: 07/14/2018

public class Triangle {
	
	double a;
	double b;
	double c;
	
	//constructor method
	public Triangle(int sideA, int sideB)
	{
		a = sideA;
		b = sideB;
	}
	
	public void computeC()
	{
		c = Math.pow(a, 2) + Math.pow(b, 2);
		System.out.println("C^2 is: " + c);
		c = Math.sqrt(c);
		System.out.println("The value of c (it's square root) is: " + c );
	}

}
