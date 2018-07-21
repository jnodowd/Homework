//Filename: TestCar.java
//Written by: Jon O'Dowd
//Written on: 07/13/2018

public class TestCar {
	
	public static void main(String[] args) 
	{
		Car myCar = new Car("Chevy", 40);
		myCar.speed(60, 80);
		System.out.println("Original speed of the car was: " + myCar.getSpeed());
	}
}
