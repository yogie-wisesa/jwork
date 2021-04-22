import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class EwalletPayment extends Invoice {
    
    private static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;
    private Bonus bonus;

    public EwalletPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker){
        super(id, jobs, jobseeker);
        this.bonus = null;
    }

    public EwalletPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker, Bonus bonus){

        super(id, jobs, jobseeker);

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
        /*if (bonus != null && bonus.getActive() == true && getJobs().getFee() > bonus.getMinTotalFee()){
            super.totalFee = getJobs().getFee() + bonus.getExtraFee();
        } 
        else 
        {
            super.totalFee = getJobs().getFee();
        }*/
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
        "\nID Job           = "+ super.getJobs()+
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
            "\nID Job           = "+ super.getJobs()+
            "\nDate             = "+ strDate+
            "\nSeeker           = "+ super.getJobseeker().getName()+
            "\nFee              = "+ super.totalFee+
            "\nStatus           = "+ super.getInvoiceStatus().toString()+
            "\nPayment Type     = "+ PAYMENT_TYPE.toString();
        }

        
    }

}
