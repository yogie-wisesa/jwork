import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class EwalletPayment extends Invoice {
    
    private static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;
    private Bonus bonus;

    public EwalletPayment(int id, Job job, Jobseeker jobseeker, InvoiceStatus invoiceStatus){
        super(id, job, jobseeker, invoiceStatus);
        this.bonus = null;
    }

    public EwalletPayment(int id, Job job, Jobseeker jobseeker, Bonus bonus, InvoiceStatus invoiceStatus){

        super(id, job, jobseeker, invoiceStatus);
        this.bonus = bonus;

    }
    
    public PaymentType getPaymentType(){
        return PAYMENT_TYPE;
    }

    public Bonus getBonus(){
        return bonus;
    }

    public void setBonus(Bonus bonus){
        this.bonus = bonus;

    }

    public void setTotalFee(){
        if (bonus != null && bonus.getActive() == true && getJob().getFee() > bonus.getMinTotalFee()){
            super.totalFee = getJob().getFee() + bonus.getExtraFee();
        } 
        else 
        {
            super.totalFee = getJob().getFee();
        }
    }


    
    public String toString()
    {
        Calendar cal = new GregorianCalendar();
        Date date = cal.getTime();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
            String strDate = dateFormat.format(date);
        if (bonus != null && bonus.getActive() && super.totalFee > bonus.getMinTotalFee() && bonus.getReferralCode() != null) {
            return "==========Invoice==========\n" +
        "ID               = " + super.getId()+
        "\nID Job           = "+ super.getJob().getName()+
        "\nDate             = "+ strDate+
        "\nSeeker           = "+ super.getJobseeker().getName()+
        "\nFee              = "+ super.totalFee+
        "\nReferral Code    = "+ bonus.getReferralCode()+
        "\nStatus           = "+ super.getInvoiceStatus().toString()+
        "\nPayment Type     = "+ PAYMENT_TYPE.toString();
        }
        else{
            return "==========Invoice==========\n" +
            "ID                 = " + super.getId()+
            "\nID Job           = "+ super.getJob().getName()+
            "\nDate             = "+ strDate+
            "\nSeeker           = "+ super.getJobseeker().getName()+
            "\nFee              = "+ super.totalFee+
            "\nStatus           = "+ super.getInvoiceStatus().toString()+
            "\nPayment Type     = "+ PAYMENT_TYPE.toString();
        }

        
    }

}
