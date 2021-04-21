import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class BankPayment extends Invoice {
    
    private static final PaymentType PAYMENT_TYPE = PaymentType.BankPayment;
    private int adminFee;

    public BankPayment(int id, Job job, Jobseeker jobseeker, InvoiceStatus invoiceStatus){
        super(id, job, jobseeker, invoiceStatus);
        this.adminFee = 0;
    }

    public BankPayment(int id, Job job, Jobseeker jobseeker, int adminFee, InvoiceStatus invoiceStatus){

        super(id, job, jobseeker, invoiceStatus);
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
        if (adminFee != 0){
            super.totalFee = super.getJob().getFee() - adminFee;
        } 
        else 
        {
            super.totalFee = super.getJob().getFee();
        }
    }


    
    public String toString()
    {
        Calendar cal = new GregorianCalendar();
        Date date = cal.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
        String strDate = dateFormat.format(date);
        return "==========Invoice==========\n"+
        "ID                 = "+ super.getId()+
        "\nID Job           = "+ super.getJob().getName()+
        "\nDate             = "+ strDate+
        "\nSeeker           = "+ super.getJobseeker().getName()+
        "\nFee              = "+ super.totalFee+
        "\nAdmin Fee        = "+ getAdminFee()+
        "\nStatus           = "+ super.getInvoiceStatus().toString()+
        "\nPayment Type     = "+ PAYMENT_TYPE.toString();
    }

}
