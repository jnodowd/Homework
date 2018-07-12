public class Student{

		int idNumber = 9999;
		int credHrs = 3;
		int points = 12;


	public int getIdNumber() {
			return idNumber;
		}

		public void setIdNumber(int idNumber) {
			this.idNumber = idNumber;
		}

		public int getCredHrs() {
			return credHrs;
		}

		public void setCredHrs(int credHrs) {
			this.credHrs = credHrs;
		}

		public int getPoints() {
			return points;
		}

		public void setPoints(int points) {
			this.points = points;
		}

	public static void main(String[] args) {
	      int idNumber = 1234;
	      int credHrs = 6;
	      int points = 20;
	      double gpa = computeGpa(points,credHrs);

	      System.out.println("Student Id Number: " + idNumber);
	      System.out.println("Credit Hours Earned: " + credHrs);
	      System.out.println("Points Earned: " + points);
	      System.out.println("Student GPA: " + gpa); 
	}

	public static double computeGpa(int points, int credHrs) {
		
		double gpa = points/credHrs;

		return gpa;
	}
}