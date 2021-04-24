import javax.xml.crypto.Data;
import java.lang.reflect.Array;
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

            {
                    DatabaseBonus.addBonus(new Bonus(1, "diskon", 100, 10000, false));
                    DatabaseBonus.addBonus(new Bonus(2, "diskon", 100, 10000, true));

                    ArrayList<Bonus> list = DatabaseBonus.getBonusDatabase();
                    for(Bonus b:list){
                            System.out.println(b.toString());
                    }

            }

            ArrayList<Job> listJob1 = new ArrayList<Job>();
            ArrayList<Job> listJob2 = new ArrayList<Job>();
            listJob1.add(new Job(1, "Developer", DatabaseRecruiter.getRecruiterById(1), 30000, JobCategory.UI));
            listJob1.add(new Job(2, "Devops", DatabaseRecruiter.getRecruiterById(1), 9000, JobCategory.UI));

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


            DatabaseInvoice.addInvoice(new EwalletPayment(0, listJob1, DatabaseJobseeker.getJobseekerById(1), DatabaseBonus.getBonusById(1)));
            DatabaseInvoice.addInvoice(new EwalletPayment(1, listJob2, DatabaseJobseeker.getJobseekerById(3), DatabaseBonus.getBonusById(1)));
            ArrayList<Invoice> list = DatabaseInvoice.getInvoiceDatabase();
            for (Invoice i:list){
                    System.out.println(i.toString());
            }

            /*Job job1 = new Job(1, "Developer", DatabaseRecruiter.getRecruiterById(1), 30000, JobCategory.UI);
            Job job2 = new Job(2, "Database", DatabaseRecruiter.getRecruiterById(1), 30000, JobCategory.BackEnd);
            Job job3 = new Job(3, "Tester", DatabaseRecruiter.getRecruiterById(1), 30000, JobCategory.UI);
            DatabaseJob.addJob(job1);
            DatabaseJob.addJob(job2);
            DatabaseJob.addJob(job3);*/

           /* {
                    ArrayList<Job> jobtest = DatabaseJob.getJobByCategory(JobCategory.UI);
                    for (Job j: jobtest)
                            System.out.println(j.toString());
            }*/




            //System.out.println(ewalletpay);
            //System.out.println(bankPay);
            
    }
    
}
