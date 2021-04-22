import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class BankPayment extends Invoice {
    
    private static final PaymentType PAYMENT_TYPE = PaymentType.BankPayment;
    private int adminFee;

    public BankPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker, InvoiceStatus invoiceStatus){
        super(id, jobs, jobseeker);
        this.adminFee = 0;
    }

    public BankPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker, int adminFee){

        super(id, jobs, jobseeker);
        this.adminFee = adminFee;

    }
    
    public PaymentType getPaymentType(){
        return PAYMENT_TYPE;

    }

    public int getAdminFee(){
        return adminFee;
    }

    public void setAdminFee(int adminFee){
        this.adminFee = adminFee;

    }

    public void setTotalFee(){
       /* if (adminFee != 0){
            super.totalFee = super.getJobs().get() - adminFee;
        } 
        else 
        {
            super.totalFee = super.getJobs().getFee();
        }*/
    }


    
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
