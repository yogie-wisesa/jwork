package yogiewisesa.jwork;
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
        int totalJobFee =0;
        for(int i=0;i<getJobs().size();i++){
            totalJobFee = totalJobFee + getJobs().get(i).getFee() ;
        }

        if( bonus != null){
            if (bonus.getActive() == true && totalJobFee > bonus.getMinTotalFee()){
                super.totalFee = (totalJobFee + bonus.getExtraFee() );
            }
            else{
                super.totalFee = totalJobFee;
            }
        }
        else{
            super.totalFee = totalJobFee;
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