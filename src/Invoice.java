import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 
 *
 * @author (Yogie Wisesa)
 * @version (Modul2-18.03.2021)
 */

public abstract class Invoice {
    /*
    inisiasi 
    variable
    */
    private int id; //inisiasi variable integer
    private Calendar date; //inisiasi variable string 
    private Jobseeker jobseeker; //inisasi variable dari class jobseeker
    private PaymentType paymentType;
    private InvoiceStatus invoiceStatus;
    private Job job;
    protected int totalFee;

    /**
     * constructor invoice
     * @param id dari pencari kerja
     * @param job dari pekerjaan
     * @param date tanggal 
     * @param totalFee gaji total
     * @param jobseeker identitas dari class jobseeker
     */
    public Invoice(int id, Job job, Jobseeker jobseeker, InvoiceStatus invoiceStatus){
        this.id = id;
        this.job = job;
        //this.date = date;
        this.totalFee = totalFee;
        this.jobseeker = jobseeker;
        this.paymentType = paymentType;
        this.invoiceStatus = invoiceStatus;
    }

    /**
     * getter id jobseeker
     * @return id dari jobseeker
     */
    public int getId (){
        return id;
    }
    
    /**
     * getter id job
     * @return job dari job
     */
    public Job getJob (){
        return job;
    }
    
    /**
     * getter tanggal 
     * @return date tanggal 
     */
    public Calendar getDate (){
        return date;
    }
    
    /**
     * getter gaji total
     * @return totalFee gaji total 
     */
    public int getTotalFee (){
        return totalFee;
    }
    
    /**
     * getter identitas jobseeker
     * @return jobseeker identitas jobseeker
     */
    public Jobseeker getJobseeker(){
        return jobseeker;
    }

    
    public abstract PaymentType getPaymentType();
    


    public InvoiceStatus getInvoiceStatus(){
        return invoiceStatus;
    }
    /**
     * setter id jobseeker
     * @param id
     */
    public void setId(int id){
        this.id = id;
    }
    
    /**
     * setter job pekerjaan
     * @param job
     */
    public void setJob(Job job){
        this.job = job;
    }
  
    /**
     * setter tanggal
     * @param date
     */
    public void setDate(Calendar date){
        this.date = date;
    }

    public void setDate(int year, int month, int dayOfMonth, int Calendar){
        this.date = new GregorianCalendar(year, month-1, dayOfMonth);
    }

    /**
     * setter gaji total
     * @param totalFee
     */
    public abstract void setTotalFee();

    /**
     * setter identitas jobseeker
     * @param jobseeker identitas dari class jobseeker
     */
    public void setJobseeker(Jobseeker jobseeker){
        this.jobseeker = jobseeker;
    }


    public void setPaymentType(PaymentType paymentType){
        this.paymentType = paymentType;
    }


    public void setInvoiceStatus(InvoiceStatus status){
        this.invoiceStatus = invoiceStatus;
    }
    /**
     * method printData
     */
    public abstract String toString(); /*{
        return "============ Invoice ============\n" +
                            "ID: " + getId() +
                            "\nID Job: " + getJob() + 
                            "\nDate: " + getDate() +
                            "\nSeeker: " + jobseeker.getName() +
                            "\nFee: " + getTotalFee() +
                            "\nStatus: " + getInvoiceStatus();
    }*/
}

