public class ShowStudent2 {

	public static void main(String[] args) {

		Student a = new Student();
		Student b = new Student();
		a.setIdNumber(2345);
		a.setCredHrs(9);
		a.setPoints(24);
		
		double gpa = a.computeGpa(a.getPoints(), a.getCredHrs());
		double gpab = b.computeGpa(b.getPoints(), b.getCredHrs());
		
		System.out.println("Student A's Id is: " + a.getIdNumber());
		System.out.println("Credit Hours Earned: " + a.getCredHrs());
		System.out.println("Points Earned: " + a.getPoints());
		System.out.println("GPA is: " + gpa);
		System.out.println();		
		System.out.println("Student A's Id is: " + b.getIdNumber());
		System.out.println("Credit Hours Earned: " + b.getCredHrs());
		System.out.println("Points Earned: " + b.getPoints());
		System.out.println("GPA is: " + gpab);	
	}
}