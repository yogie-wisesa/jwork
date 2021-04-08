import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Write a description of class JWork here.
 *
 * @author (Yogie Wisesa)
 * @version (a version number or a date)
 */
public class JWork
{
    public static void main(String[] args){

            Calendar cal = new GregorianCalendar(2020, 11, 20);
            //Location location = new Location("DKI Jakarta", "Jakarta Utara", "Sunter");
            //Recruiter recruiter = new Recruiter(1, "Yogie Wisesa", "yogie.wisesa@ui.ac.id", "025123456", location);
            //Job job = new Job(6, "Developer", recruiter, 3000, JobCategory.UI);
            
            Jobseeker jobseeker1 = new Jobseeker(1, "John Smith", "john..smith@gmail.com", "Test", cal);
            Jobseeker jobseeker2 = new Jobseeker(2, "Dean Smith", "dean.smith@gmail.com", "Tesasdfast123", 2020, 11, 2);
            Jobseeker jobseeker3 = new Jobseeker(3, "Alan Smith", "alan.smith@gmail.com", "Teasdfasdfst123");
            
            System.out.println(jobseeker1.toString());
            System.out.println(jobseeker2.toString());
            System.out.println(jobseeker3.toString());

            jobseeker1.setEmail("john.smith@gmail.com");
            jobseeker1.setPassword("Test12asdfasdf3");
            
            System.out.println(jobseeker1.toString());
            
    }
    
}
