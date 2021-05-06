import java.util.ArrayList;

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
                    ArrayList<Jobseeker> list = new ArrayList<Jobseeker>();
                    list.add(new Jobseeker(1, "John", "john@ui.ac.id", "Test12345"));
                    list.add(new Jobseeker(2, "Geraldy", "geraldy@ui.ac.id", "Test12345"));
                    list.add(new Jobseeker(3, "Alan", "alan@ui.ac.id", "Test12345"));
                    list.add(new Jobseeker(4, "John", "john@ui.ac.id", "Test12345"));

                    for (Jobseeker j : list)
                    {
                            try {
                                    DatabaseJobseeker.addJobseeker(j);
                            } catch (EmailAlreadyExistException e) {
                                    System.out.println(e.getMessage());
                            }
                    }
            }

            {
                    ArrayList<Bonus> list = new ArrayList<Bonus>();
                    list.add(new Bonus(1, "diskon", 10000, 30000, true));
                    list.add(new Bonus(2, "diskon", 60000, 90000, true));
                    for (Bonus b : list)
                    {
                            try {
                                    DatabaseBonus.addBonus(b);
                            } catch (ReferralCodeAlreadyExistsException e) {
                                    System.out.println(e.getMessage());
                            }
                    }
            }

            {
                    try {
                            Jobseeker js = DatabaseJobseeker.getJobseekerById(9);
                    } catch (JobSeekerNotFoundException e) {
                            System.out.println(e.getMessage());
                    }

                    try {
                            Recruiter js = DatabaseRecruiter.getRecruiterById(9);
                    } catch (RecruiterNotFoundException e) {
                            System.out.println(e.getMessage());
                    }

                    try {
                            Job js = DatabaseJob.getJobById(9);
                    } catch (JobNotFoundException e) {
                            System.out.println(e.getMessage());
                    }

                    try {
                            Bonus js = DatabaseBonus.getBonusById(9);
                    } catch (BonusNotFoundException e) {
                            System.out.println(e.getMessage());
                    }
            }

            {
                    ArrayList<Bonus> listBonus = DatabaseBonus.getBonusDatabase();
                    ArrayList<Jobseeker> listJS = DatabaseJobseeker.getDatabaseJobseeker();

                    for (Bonus b : listBonus)
                            System.out.println(b);

                    for (Jobseeker js : listJS)
                            System.out.println(js);
            }

            {
                    try {

                            Jobseeker js1 = DatabaseJobseeker.getJobseekerById(1);
                            Jobseeker js2 = DatabaseJobseeker.getJobseekerById(2);
                            Jobseeker js3 = DatabaseJobseeker.getJobseekerById(3);

                            Location l = new Location("DKI Jakarta", "Jakarta Utara", "Headquarter");
                            Recruiter r = new Recruiter(1, "yogie wisesa", "yogie.wisesa@ui.ac.id", "01234567889", l);
                            DatabaseJob.addJob(new Job(1, "Facebook UI Designer", r, 120000, JobCategory.UI));

                            DatabaseInvoice.addInvoice(new BankPayment(1, DatabaseJob.getJobDatabase(), js1));
                            DatabaseInvoice.addInvoice(new BankPayment(2, DatabaseJob.getJobDatabase(), js2));
                            DatabaseInvoice.addInvoice(new BankPayment(3, DatabaseJob.getJobDatabase(), js3));

                    } catch (JobSeekerNotFoundException e) {
                            System.out.print(e.getMessage());
                            return;
                    }

                    Thread myThread = new Thread(new FeeCalculator());
                    myThread.start();
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
