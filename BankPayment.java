public class BankPayment extends Invoice {
    
    private static final PaymentType PAYMENT_TYPE = PaymentType.BankPayment;
    private int adminFee;

    public BankPayment(int id, Job job, String date, Jobseeker jobseeker, InvoiceStatus invoiceStatus){
        super(id, job, date, jobseeker, invoiceStatus);
        this.adminFee = 0;
    }

    public BankPayment(int id, Job job, String date, Jobseeker jobseeker, int adminFee, InvoiceStatus invoiceStatus){

        super(id, job, date, jobseeker, invoiceStatus);
        this.adminFee = adminFee;

    }
    
    public PaymentType getPaymentType(){
        return PAYMENT_TYPE;

    }

    public int getAdminFee(){
        return adminFee;
    }

    public void setBonus(Bonus bonus){
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


    
    public void printData()
    {
        System.out.println("\n==========Invoice==========\n");
        System.out.println("ID                 = "+ super.getId());
        System.out.println("\nID Job           = "+ super.getJob().getName());
        System.out.println("\nDate             = "+ super.getDate());
        System.out.println("\nSeeker           = "+ super.getJobseeker().getName());
        System.out.println("\nFee              = "+ super.totalFee);
        
        System.out.println("\nAdmin Fee        = "+ getAdminFee());
        
        
        System.out.println("\nStatus           = "+ super.getInvoiceStatus().toString());
        System.out.println("\nPayment Type     = "+ PAYMENT_TYPE.toString());
    }

}
