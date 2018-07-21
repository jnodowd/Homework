import javax.swing.JOptionPane;
import java.time.*;

public class TimedResponse2
{
   public static void main(String[] args)
   {
      LocalTime time1, time2;
      int seconds1, seconds2, difference;
      
      time1 = LocalTime.now();

     
      
      JOptionPane.showConfirmDialog(null, "Is stealing ever justified? ");
      
      time2 = LocalTime.now();
//      seconds2 = time2.getMinute();
     

      
      difference = Duration.between(time2, time1).getNano();

            
//         JOptionPane.showMessageDialog(null, "End seconds: " + time2 + "\nStart seconds: " + time1 + "\nIt took " + difference + " seconds for you to answer");
         JOptionPane.showMessageDialog(null, "End seconds: " + difference);
   }
}