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

            Calendar cal = new GregorianCalendar();
            Location location = new Location("DKI Jakarta", "Jakarta Utara", "Sunter");
            Recruiter recruiter = new Recruiter(1, "Yogie Wisesa", "yogie.wisesa@ui.ac.id", "025123456", location);
            Job job = new Job(6, "Developer", recruiter, 3000, JobCategory.UI);
            
            Jobseeker jobseeker1 = new Jobseeker(1, "John Smith", "john..smith@gmail.com", "Test", cal);
            //Jobseeker jobseeker2 = new Jobseeker(2, "Dean Smith", "dean.smith@gmail.com", "Tesasdfast123", 2020, 11, 2);
            //Jobseeker jobseeker3 = new Jobseeker(3, "Alan Smith", "alan.smith@gmail.com", "Teasdfasdfst123");
            
            EwalletPayment ewalletpay = new EwalletPayment(4, job, jobseeker1, InvoiceStatus.Finished);
            BankPayment bankPay = new BankPayment(5, job, jobseeker1, InvoiceStatus.Finished);

            System.out.println(ewalletpay);
            System.out.println(bankPay);
            
    }
    
}
