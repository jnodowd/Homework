package chapter_7;

import javax.swing.*; 
public class BusinessLetter 
{ 
	public static void main(String[] args) 
	{ 
		String name = ""; 
		String firstName = "";
		String middleName = "";
		String lastName = "";
		String age;

		int x; 
		char c; 
		name = JOptionPane.showInputDialog(null, "Please enter customer's first and last name"); 
	    int startSpace = name.indexOf(" ");
	    int space2 = name.indexOf(" ", startSpace+1);
	    int space3 = name.indexOf(" ", space2+1);
	    int endSpace = name.lastIndexOf(" ");
	    
	    //       firstName|startSpace|George|space2|ODowd|space3|43.
	    
	    if (startSpace >= 0)
	    {
	       firstName = name.substring(0, startSpace);
	       System.out.println("First Name: " + firstName);
	       middleName = name.substring((startSpace + 1), space2);
	       System.out.println("Middle Name: " + middleName);
	       lastName = name.substring((space2 + 1), space3);
	       System.out.println("Last Name: " + lastName);
	       age = name.substring(endSpace, name.length());
	       System.out.println("Age: " + age);
	    }
		System.out.println(startSpace);
		System.out.println(space2);
		System.out.println(space3);
		System.out.println(endSpace);
	    
	    
	    		
		
		
		
		
		
									//		x = 0; 
									//		while(x < name.length()) 
									//		{ 
									//			if(name.charAt(x) == ' ') 
									//			{ 
									//				firstName = name.substring(0, x);
									////				midName = name.sub
									//				familyName = name.substring(x + 1, name.length()); 
									//				x = name.length();
									//			}
									//			++x;
									//		}
									//		JOptionPane.showMessageDialog(null, familyName);
	}
}

