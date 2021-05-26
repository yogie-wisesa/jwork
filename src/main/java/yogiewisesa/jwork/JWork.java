package yogiewisesa.jwork;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

/**
 * Write a description of class JWork here.
 *
 * @author (Yogie Wisesa)
 * @version (a version number or a date)
 */

@SpringBootApplication
public class JWork
{
    public static void main(String[] args){

//            Location l1 = new Location("DKI Jakarta", "Jakarta Utara", "Sunter");
//            Location l2 = new Location("Jawa Barat", "Bogor", "Utara");
//            Location l3 = new Location("Jawa Barat", "Depok", "Kukusan");
//
//            Recruiter r1 = new Recruiter(1, "yogie wisesa", "yogie.wisesa@ui.ac.id", "01234567889", l1);
//            Recruiter r2 = new Recruiter(2, "charles leclerc", "charles.leclerc@ui.ac.id", "01234567889", l2);
//            Recruiter r3 = new Recruiter(3, "sergio perez", "sergio.perez@ui.ac.id", "01234567889", l3);
//
//            DatabaseRecruiter.addRecruiter(r1);
//            DatabaseRecruiter.addRecruiter(r2);
//            DatabaseRecruiter.addRecruiter(r3);
//
//            Job job1 = new Job(1, "Developer", r1, 30000, JobCategory.UI);
//            Job job2 = new Job(2, "Database", r1, 30000, JobCategory.BackEnd);
//            Job job3 = new Job(3, "Tester", r2, 30000, JobCategory.UI);
//            Job job4 = new Job(3, "Tester", r3, 30000, JobCategory.FrondEnd);
//
//            DatabaseJob.addJob(job1);
//            DatabaseJob.addJob(job2);
//            DatabaseJob.addJob(job3);
//            DatabaseJob.addJob(job4);

//            DatabaseInvoice.addInvoice(new BankPayment(1, DatabaseJob.getJobDatabase(), js1));
//            DatabaseInvoice.addInvoice(new BankPayment(1, DatabaseJob.getJobDatabase(), js2));

            SpringApplication.run(JWork.class, args);

//            {
//                    ArrayList<Jobseeker> list = new ArrayList<Jobseeker>();
//                    list.add(new Jobseeker(1, "John", "john@ui.ac.id", "Test12345"));
//                    list.add(new Jobseeker(2, "Geraldy", "geraldy@ui.ac.id", "Test12345"));
//                    list.add(new Jobseeker(3, "Alan", "alan@ui.ac.id", "Test12345"));
//                    list.add(new Jobseeker(4, "John", "john@ui.ac.id", "Test12345"));
//
//                    for (Jobseeker j : list)
//                    {
//                            try {
//                                    DatabaseJobseeker.addJobseeker(j);
//                            } catch (EmailAlreadyExistException e) {
//                                    System.out.println(e.getMessage());
//                            }
//                    }
//            }
//
//            {
//                    ArrayList<Bonus> list = new ArrayList<Bonus>();
//                    list.add(new Bonus(1, "diskon", 10000, 30000, true));
//                    list.add(new Bonus(2, "diskon", 60000, 90000, true));
//                    list.add(new Bonus(2, "diskonAsik", 10000, 30000, true));
//                    list.add(new Bonus(2, "diskon50", 60000, 90000, true));
//                    for (Bonus b : list)
//                    {
//                            try {
//                                    DatabaseBonus.addBonus(b);
//                            } catch (ReferralCodeAlreadyExistsException e) {
//                                    System.out.println(e.getMessage());
//                            }
//                    }
//            }
//
//            {
//                    try {
//                            Jobseeker js = DatabaseJobseeker.getJobseekerById(88);
//                    } catch (JobSeekerNotFoundException e) {
//                            System.out.println(e.getMessage());
//                    }
//
//                    try {
//                            Recruiter js = DatabaseRecruiter.getRecruiterById(88);
//                    } catch (RecruiterNotFoundException e) {
//                            System.out.println(e.getMessage());
//                    }
//
//                    try {
//                            Job js = DatabaseJob.getJobById(88);
//                    } catch (JobNotFoundException e) {
//                            System.out.println(e.getMessage());
//                    }
//
//                    try {
//                            Bonus js = DatabaseBonus.getBonusById(88);
//                    } catch (BonusNotFoundException e) {
//                            System.out.println(e.getMessage());
//                    }
//                    try {
//                            Invoice in = DatabaseInvoice.getInvoicebyId(88);
//                    } catch (InvoiceNotFoundException e) {
//                            System.out.println(e.getMessage());
//                    }
//            }
//
//            {
//                    ArrayList<Bonus> listBonus = DatabaseBonus.getBonusDatabase();
//                    ArrayList<Jobseeker> listJS = DatabaseJobseeker.getDatabaseJobseeker();
//
//                    for (Bonus b : listBonus)
//                            System.out.println(b);
//
//                    for (Jobseeker js : listJS)
//                            System.out.println(js);
//            }
//
//            {
//                    try {
//
//                            Jobseeker js1 = DatabaseJobseeker.getJobseekerById(1);
//                            Jobseeker js2 = DatabaseJobseeker.getJobseekerById(2);
//                            Jobseeker js3 = DatabaseJobseeker.getJobseekerById(3);
//


//                            DatabaseJob.addJob(new Job(1, "UI/UX", r, 690000, JobCategory.UI));
//
//
//                            DatabaseInvoice.addInvoice(new BankPayment(1, DatabaseJob.getJobDatabase(), js1));
//                            DatabaseInvoice.addInvoice(new BankPayment(1, DatabaseJob.getJobDatabase(), js2));
//                            DatabaseInvoice.addInvoice(new BankPayment(3, DatabaseJob.getJobDatabase(), js3));
//                            Invoice.setInvoiceStatus(InvoiceStatus.Finished);
//                    } catch (JobSeekerNotFoundException e){
//                            System.out.print(e.getMessage());
//                            return;
//                    }
//
//
//
//
//
//                    Thread myThread = new Thread(new FeeCalculator());
//                    myThread.start();
//            }
/*

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
