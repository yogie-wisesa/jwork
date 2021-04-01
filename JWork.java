

/**
 * Write a description of class JWork here.
 *
 * @author (Yogie Wisesa)
 * @version (a version number or a date)
 */
public class JWork
{
    public static void main(String[] args){
            Location location = new Location("DKI Jakarta", "Jakarta Utara", "Sunter");
            Recruiter recruiter = new Recruiter(1, "Yogie Wisesa", "yogie.wisesa@ui.ac.id", "025123456", location);
            Job job = new Job(6, "Developer", recruiter, 3000, JobCategory.UI);
            Jobseeker jobseeker = new Jobseeker(1, "John Smith", "john.smith@gmail.com", "123", "1 September 2020");
            //Invoice invoice = new Invoice (1, job.getId(), "2 September 2020", job.getFee(), jobseeker, PaymentType.BankPayment, InvoiceStatus.Finished);
            Bonus bonus1 = new Bonus(2, null, 10, 10, true);
            Bonus bonus2 = new Bonus(2, "diskongila", 20, 2000000, true);
            Bonus bonus3 = new Bonus(2, "diskongilaa", 20, 20, true);
            EwalletPayment ewalletpayment1 = new EwalletPayment(55, job, "2 September 2020", jobseeker, bonus1, InvoiceStatus.Finished);
            EwalletPayment ewalletpayment2 = new EwalletPayment(66, job, "2 September 2020", jobseeker, bonus2, InvoiceStatus.Finished);
            EwalletPayment ewalletpayment3 = new EwalletPayment(77, job, "2 September 2020", jobseeker, bonus3, InvoiceStatus.Finished);

            ewalletpayment1.setTotalFee();
            ewalletpayment2.setTotalFee();
            ewalletpayment3.setTotalFee();
            
            
            //DatabaseRecruiter.addRecruiter(recruiter);
            //DatabaseJob.addJob(job);
            ewalletpayment1.printData();
            ewalletpayment2.printData();
            ewalletpayment3.printData();

            
    }
    
}
