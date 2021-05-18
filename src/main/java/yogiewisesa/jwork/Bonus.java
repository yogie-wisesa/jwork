package yogiewisesa.jwork;
public class Bonus {
    
    private int id, extraFee, minTotalFee;
    private String referralCode;
    private boolean active;

    public Bonus (int id, String referralCode, int extraFee, int minTotalfee, boolean active){
        this.id = id;
        this.referralCode = referralCode;
        this.extraFee = extraFee;
        this.minTotalFee = minTotalfee;
        this.active = active;
    }

    public int getId(){
        return id;

    }

    public String getReferralCode(){

        return referralCode;
    }

    public int getExtraFee(){

        return extraFee;
    }


    public int getMinTotalFee(){

        return minTotalFee;
    }

    public boolean getActive(){

        return active;
    }

    public void setId(int id){
        this.id = id;

    }


    public void setReferralCode(String referralCode){
        this.referralCode = referralCode;
    }

    public void setExtraFee(int extraFee){
        this.extraFee = extraFee;
    }

    public void setMinTotalFee(int minTotalFee){
        this.minTotalFee = minTotalFee;

    }

    public void setActive(boolean active){
        this.active = active;
    }

    public String toString(){
        return              "ID = " + id + 
                            "\nReferral Code = " + referralCode + 
                            "\nExtra Fee = " + extraFee + 
                            "\nMin Total Fee = " + minTotalFee +
                            "\nActive = " + active;  
    }
}
