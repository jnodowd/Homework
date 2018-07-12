public class InchesToFeet 
{
	public static void main(String[] args) 
   {
		final int inchesPerFoot = 12;
		int inches = 26;
		int feet = inches / inchesPerFoot;
		int remInches = inches % inchesPerFoot;
		
		System.out.println(inches + "inches is " + feet + " feet and " + remInches + " inches.");
	}

}
