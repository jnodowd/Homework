import java.util.Scanner;

public class TestLease {

	public static void main(String[] args) {
		
		Lease a = new Lease();
		Lease myLease;
		myLease = getLeaseData();
		
		Lease b = new Lease();
		Lease myLeaseb;
		myLeaseb = getLeaseData();
		
		Lease c = new Lease();
		Lease myLeasec;
		myLeasec = getLeaseData();
		
		Lease d = new Lease();
		
		displayLease(myLease);
		displayLease(myLeaseb);
		displayLease(myLeasec);
		displayLease(d);
	}
	
	public static Lease getLeaseData() {
		Lease tempLease = new Lease();
		String name;
		int aptNum;
		int rent;
		int term;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What name will be on this lease?>>");
		name = keyboard.nextLine();
		tempLease.setName(name);
		System.out.println("What is apartment number for this lease?>>");
		aptNum = keyboard.nextInt();
		tempLease.setAptNum(aptNum);
		System.out.println("What is the rent amount?>>");
		rent = keyboard.nextInt();
		tempLease.setRent(rent);
		System.out.println("What is the lease term in months?>>");
		term = keyboard.nextInt();
		tempLease.setTerm(term);
		return tempLease;
	}

	public static void displayLease(Lease aLease) {
		System.out.println("\nLease Details for tenant " + aLease.getName());
		System.out.println("Renting apartment #" + aLease.getAptNum());
		System.out.println("Monthly Rental Amount: $" + aLease.getRent());
		System.out.println("Term of the lease in months: " + aLease.getTerm());
		System.out.println();
	}
}