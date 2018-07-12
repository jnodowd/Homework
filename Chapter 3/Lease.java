public class Lease {
	
		String name = "XXX";
		int aptNum = 0;
		int rent = 1000;
		int term = 12;
		

	public String getName() {
			return name;
	}

	public void setName(String name) {
			this.name = name;
	}

	public int getAptNum() {
			return aptNum;
	}

	public void setAptNum(int aptNum) {
			this.aptNum = aptNum;
	}

	public double getRent() {
			return rent;
	}

	public void setRent(int rent) {
			this.rent = rent;
	}

	public int getTerm() {
			return term;
	}

	public void setTerm(int term) {
			this.term = term;
	}
		
	public double addPetFee() {
			
		double totalRent = rent + 10;
		return totalRent;
	}
		
	public static void explainPetFee() {
			
		System.out.println("Explanation of Pet Fee");
	}
}
