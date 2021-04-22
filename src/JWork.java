import java.util.ArrayList;
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

            Calendar cal = new GregorianCalendar(2021, 4, 20);
            Location location = new Location("DKI Jakarta", "Jakarta Utara", "Sunter");
            {
                    Recruiter recruiter = new Recruiter(1, "Yogie Wisesa", "yogie.wisesa@ui.ac.id", "025123456", location);
                    DatabaseRecruiter.addRecruiter(recruiter);
            }

            
            Jobseeker jobseeker1 = new Jobseeker(1, "John Smith", "john.smith@gmail.com", "Test1231321321", cal);
            Jobseeker jobseeker2 = new Jobseeker(2, "john Smith", "john.smith@gmail.com", "Tesasdfast123", 2020, 11, 2);
            Jobseeker jobseeker3 = new Jobseeker(3, "Geraldy Christanto", "geraldy.christanto@gmail.com", "Teasdfasdfst123", 2020, 4, 20);
            DatabaseJobseeker.addJobseeker(jobseeker1);
            DatabaseJobseeker.addJobseeker(jobseeker2);
            DatabaseJobseeker.addJobseeker(jobseeker3);

            {
                    ArrayList<Jobseeker> jstest = DatabaseJobseeker.getDatabaseJobseeker();
                    for (Jobseeker js : jstest)
                            System.out.println(js.toString());
            }

            Job job1 = new Job(1, "Developer", DatabaseRecruiter.getRecruiterById(1), 30000, JobCategory.UI);
            Job job2 = new Job(2, "Database", DatabaseRecruiter.getRecruiterById(1), 30000, JobCategory.BackEnd);
            Job job3 = new Job(3, "Tester", DatabaseRecruiter.getRecruiterById(1), 30000, JobCategory.UI);
            DatabaseJob.addJob(job1);
            DatabaseJob.addJob(job2);
            DatabaseJob.addJob(job3);

            {
                    ArrayList<Job> jobtest = DatabaseJob.getJobByCategory(JobCategory.UI);
                    for (Job j: jobtest)
                            System.out.println(j.toString());
            }
            //EwalletPayment ewalletpay = new EwalletPayment(4, job, jobseeker1, InvoiceStatus.Finished);
            // BankPayment bankPay = new BankPayment(5, job, jobseeker1, InvoiceStatus.Finished);

            //System.out.println(ewalletpay);
            //System.out.println(bankPay);
            
    }
    
}
