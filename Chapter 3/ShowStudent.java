public class ShowStudent
{
   public static void main(String[] args)
   {
      Student someStudent = new Student();
      int idNumber = 4567;
      int credHrs = 6;
      int points = 20;
      double gpa = someStudent.computeGpa(points, credHrs);

      System.out.println("This student's ID Number is: " + idNumber);
      System.out.println("Credit Hours Earned: " + credHrs);
      System.out.println("Points earned: " + points);
      System.out.println("This student's GPA is: " + gpa);
      
   }
}