/**
 * @author Yogie Wisesa
 * @version 24/6/21
 * 
 * class bank payment
 */
package yogiewisesa.jwork;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class BankPayment extends Invoice {
    
    private static final PaymentType PAYMENT_TYPE = PaymentType.BankPayment;
    private int adminFee;

    /**
     * constructor bank payment tanpa admin fee
     * @param id
     * @param jobs
     * @param jobseeker
     */
    public BankPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker){
        super(id, jobs, jobseeker);
        this.adminFee = 0;
    }

    /**
     * constructor bank payment dengan admin fee
     * @param id
     * @param jobs
     * @param jobseeker
     * @param adminFee
     */
    public BankPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker, int adminFee){

        super(id, jobs, jobseeker);
        this.adminFee = adminFee;

    }
    
    /**
     * method getter payment type
     * @return PAYMENT_TYPE  
     */
    public PaymentType getPaymentType(){
        return PAYMENT_TYPE;

    }

    /**
     * method getter admin fee
     * @return admin fee
     */
    public int getAdminFee(){
        return adminFee;
    }

    /**
     * method setter admin fee
     * @param adminFee
     */
    public void setAdminFee(int adminFee){
        this.adminFee = adminFee;

    }

    /**
     * method setter totalfee untuk menghitung total gaji
     */
    public void setTotalFee(){
        this.totalFee = 0;
        for (Job j : getJobs())
            if (j != null) {
                this.totalFee += j.getFee();
            }
        if (getAdminFee() != 0)
            this.totalFee += getAdminFee();
    }


    /**
     * method toString untuk print hasil
     */
    public String toString()
    {
        Calendar cal = new GregorianCalendar();
        Date date = cal.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
        String strDate = dateFormat.format(date);
        return "==========Invoice==========\n"+
        "ID                 = "+ super.getId()+
        "\nID Job           = "+ super.getJobs()+
        "\nDate             = "+ strDate+
        "\nSeeker           = "+ super.getJobseeker().getName()+
        "\nFee              = "+ super.totalFee+
        "\nAdmin Fee        = "+ getAdminFee()+
        "\nStatus           = "+ super.getInvoiceStatus().toString()+
        "\nPayment Type     = "+ PAYMENT_TYPE.toString();
    }

}
