/**
 * 
 *
 * @author (Yogie Wisesa)
 * @version (Modul2-18.03.2021)
 */

public class Invoice {
    /*
    inisiasi 
    variable
    */
    private int id, idJob, totalFee; //inisiasi variable integer
    private String date; //inisiasi variable string 
    private Jobseeker jobseeker; //inisasi variable dari class jobseeker
    private PaymentType paymentType;
    private InvoiceStatus status;

    /**
     * constructor invoice
     * @param id dari pencari kerja
     * @param idJob dari pekerjaan
     * @param date tanggal 
     * @param totalFee gaji total
     * @param jobseeker identitas dari class jobseeker
     */
    public Invoice(int id, int idJob, String date, int totalFee, Jobseeker jobseeker, PaymentType paymentType, InvoiceStatus status){
        this.id = id;
        this.idJob = idJob;
        this.date = date;
        this.totalFee = totalFee;
        this.jobseeker = jobseeker;
        this.paymentType = paymentType;
        this.status = status;
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
     * @return idJob dari job
     */
    public int getIdJob (){
        return idJob;
    }
    
    /**
     * getter tanggal 
     * @return date tanggal 
     */
    public String getDate (){
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

    
    public PaymentType getPaymentType(){
        return paymentType;
    }


    public InvoiceStatus getInvoiceStatus(){
        return status;
    }
    /**
     * setter id jobseeker
     * @param id
     */
    public void setId(int id){
        this.id = id;
    }
    
    /**
     * setter idJob pekerjaan
     * @param idJob
     */
    public void setIdJob(int idJob){
        this.idJob = idJob;
    }
  
    /**
     * setter tanggal
     * @param date
     */
    public void setDate(String date){
        this.date = date;
    }

    /**
     * setter gaji total
     * @param totalFee
     */
    public void setTotalFee(int totalFee){
        this.totalFee = totalFee;
    }

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
        this.status = status;
    }
    /**
     * method printData
     */
    public void printData(){
        System.out.println("============ Invoice ============\n" +
                            "ID: " + getId() +
                            "\nID Job: " + getIdJob() + 
                            "\nDate: " + getDate() +
                            "\nSeeker: " + jobseeker.getName() +
                            "\nFee: " + getTotalFee() +
                            "\nStatus: " + getInvoiceStatus() );
    }
}

