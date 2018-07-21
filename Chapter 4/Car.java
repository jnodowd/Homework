//Filename: Car.java
//Written by: Jon O'Dowd
//Written on: 07/13/2018

public class Car {
	
	//object variables
	private String make;
	private int speed;
	private static int defaultSpeed = 50;
	
	//constructor method 
	public Car(String carMake, int speed1)
	{
		this.make = carMake;
		System.out.print("The " + make);
		speed = speed1;
	}

	//This method returns the default speed
	public static int speed()
	{
		return defaultSpeed;
	}
	
	//accessor method
	public int getSpeed()
	{
		return speed;
	}
	
	//overloaded method
	public void speed(int currentSpeed, int incSpeed)
	{
		System.out.println(" increased speed from " + currentSpeed + " to " + incSpeed);
		System.out.println("The default speed is: " + defaultSpeed);
	}
	




	
	
	
	
	//Displays the car's info
//	public void display()
//	{
//		System.out.println("The " + make + " has a current speed of " + speed + "but the default speed is "+ defaultSpeed);
//		
//	}

}
	

