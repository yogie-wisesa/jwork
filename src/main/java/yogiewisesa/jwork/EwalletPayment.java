/**
 * @author Yogie Wisesa
 * @version 24/6/21
 * 
 * subclass ewallet payment
 * untuk menghandle pembuatan objek invoice metode ewallet
 */
package yogiewisesa.jwork;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class EwalletPayment extends Invoice {
    
    private static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;
    private Bonus bonus;

    /**
     * constructor object ewallet tanpa bonus
     * @param id
     * @param jobs
     * @param jobseeker
     */
    public EwalletPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker){
        super(id, jobs, jobseeker);
        this.bonus = null;
    }

    /**
     * constructor object ewallet dengan bonus
     * @param id
     * @param jobs
     * @param jobseeker
     * @param bonus
     */
    public EwalletPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker, Bonus bonus){

        super(id, jobs, jobseeker);

    }

    /**
     * method getter payment type 
     * @return payment type
     */
    public PaymentType getPaymentType(){
        return PAYMENT_TYPE;
    }

    /**
     * method getter bonus
     * @return bonus
     */
    public Bonus getBonus(){
        return bonus;
    }

    /**
     * method setter bonus 
     * @param bonus
     */
    public void setBonus(Bonus bonus){
        this.bonus = bonus;

    }

    /**
     * method setter total fee untuk menghitung gaji dengan bonus atau tidak
     */
    public void setTotalFee(){
        super.totalFee = 0;
        for(Job j : getJobs())
            super.totalFee += j.getFee();
        if (bonus != null && bonus.getActive() &&
                getTotalFee() > bonus.getMinTotalFee()) {
            super.totalFee += bonus.getExtraFee();
        }
    }


    /**
     * method toString untuk mencetak data invoice ewallet
     */
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
            "\nStatus           = "+ super.getInvoiceStatus().toString();
            //"\nPayment Type     = "+ PAYMENT_TYPE.toString();
        }

        
    }

}
