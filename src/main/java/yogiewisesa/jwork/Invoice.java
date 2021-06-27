package yogiewisesa.jwork;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 
 *
 * @author (Yogie Wisesa)
 * @version (Modul2-18.03.2021)
 * 
 * parent class invoice
 * untuk menhandle pembuatan objek invoice
 */

public abstract class Invoice {
    /*
    inisiasi 
    variable
    */
    private int id; //inisiasi variable integer
    private Calendar date; //inisiasi variable string 
    private Jobseeker jobseeker; //inisasi variable dari class jobseeker
    private InvoiceStatus invoiceStatus;
    private ArrayList<Job> jobs = new ArrayList<Job>();
    protected int totalFee;

    /**
     * constructor invoice
     * @param id dari pencari kerja
     * @param jobs dari pekerjaan
     * @param jobseeker identitas dari class jobseeker
     */
    public Invoice(int id, ArrayList<Job> jobs, Jobseeker jobseeker){
        this.id = id;
        this.jobs = jobs;
        this.jobseeker = jobseeker;
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
    public ArrayList<Job> getJobs (){
        return jobs;
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

    /**
     * method getter payment type dari invoice
     * mengambil method getter dari subclass
     */
    public abstract PaymentType getPaymentType();
    
    /**
     * method getter status invoice
     * @return status invoice
     */
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
     * @param
     */
    public void setJobs(ArrayList<Job> jobs){
        this.jobs = jobs;
    }
  
    /**
     * setter tanggal
     * @param date
     */
    public void setDate(Calendar date){
        this.date = date;
    }

    /**
     * method setter tanggal invoice
     * @param year
     * @param month
     * @param dayOfMonth
     * @param Calendar
     */
    public void setDate(int year, int month, int dayOfMonth, int Calendar){
        this.date = new GregorianCalendar(year, month-1, dayOfMonth);
    }

    /**
     * setter gaji total dari subclass
     */
    public abstract void setTotalFee();

    /**
     * setter identitas jobseeker
     * @param jobseeker identitas dari class jobseeker
     */
    public void setJobseeker(Jobseeker jobseeker){
        this.jobseeker = jobseeker;
    }

    /**
     * method setter status invoice
     * @param invoiceStatus
     */
    public void setInvoiceStatus(InvoiceStatus invoiceStatus){
        this.invoiceStatus = invoiceStatus;
    }

    /**
     * method toString untuk mencetak data invoice
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

