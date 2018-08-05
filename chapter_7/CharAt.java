package chapter_7;

public class CharAt {

	public static void main(String[] args) {
	
		int countOfSpaces=0;
		String str="count number of   words and spaces";
		String myName = "Stacy";
		
		for(int x = 0; x < str.length(); ++x) 
			if(str.charAt(x) == ' ')
				++countOfSpaces;
		System.out.println(countOfSpaces);
		
		}
		
	}

	
	




