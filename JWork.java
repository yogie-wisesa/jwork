
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
            Invoice invoice = new Invoice (1, job.getId(), "2 September 2020", job.getFee(), jobseeker, PaymentType.BankPayment, InvoiceStatus.Finished);
            
            //DatabaseRecruiter.addRecruiter(recruiter);
            //DatabaseJob.addJob(job);
            invoice.printData();

            
    }
    
}
