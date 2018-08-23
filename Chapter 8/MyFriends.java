package chapter_8;

import java.util.*;
public class MyFriends {

	public static void main(String[] args) 
	{
		Friends[] contacts = new Friends[2];
		Scanner input = new Scanner(System.in);
		String name;
		
		for(int i = 0; i < contacts.length; ++i)
			System.out.println("Enter the data...");
			name = input.next();
		//	int i = 0;
			contacts[0] = new Friends();
			contacts[0].setName(name);
			
			
				
//				contacts[0] = new Friends("Mark", 480);
//				contacts[1] = new Friends("Steve", 602);
				
				
				
				//Prints the values in the array
				for (int x = 0; x < contacts.length; ++x)
					System.out.println(contacts[x].display());
				
						
				
		

	}

}
