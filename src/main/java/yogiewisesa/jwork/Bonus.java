/**
 * @author Yogie Wisesa
 * @version 24/6/21
 * 
 * class Bonus
 */
package yogiewisesa.jwork;
public class Bonus {
    
    private int id, extraFee, minTotalFee;
    private String referralCode;
    private boolean active;

    /**
     * constructor object bonus
     * @param id
     * @param referralCode
     * @param extraFee
     * @param minTotalfee
     * @param active
     */
    public Bonus (int id, String referralCode, int extraFee, int minTotalfee, boolean active){
        this.id = id;
        this.referralCode = referralCode;
        this.extraFee = extraFee;
        this.minTotalFee = minTotalfee;
        this.active = active;
    }

    /**
     * method getter id bonus
     * @return id bonus
     */
    public int getId(){
        return id;

    }

    /**
     * method getter referral code
     * @return referral code
     */
    public String getReferralCode(){

        return referralCode;
    }

    /**
     * method getter extra fee
     * @return extra fee
     */
    public int getExtraFee(){

        return extraFee;
    }

    /**
     * method getter minimum total fee
     * @return minimum total fee
     */
    public int getMinTotalFee(){

        return minTotalFee;
    }

    /**
     * method getter status keaktifan bonus
     * @return true atau false
     */
    public boolean getActive(){

        return active;
    }

    /**
     * method setter id bonus
     * @param id 
     */
    public void setId(int id){
        this.id = id;

    }

    /**
     * method setter referral code 
     * @param referralCode
     */
    public void setReferralCode(String referralCode){
        this.referralCode = referralCode;
    }

    /**
     * method setter extra fee
     * @param extraFee
     */
    public void setExtraFee(int extraFee){
        this.extraFee = extraFee;
    }

    /**
     * method setter minimum total fee
     * @param minTotalFee
     */
    public void setMinTotalFee(int minTotalFee){
        this.minTotalFee = minTotalFee;

    }

    /**
     * method setter status bonus
     * @param active
     */
    public void setActive(boolean active){
        this.active = active;
    }

    /**
     * method toString untuk print bonus
     * @return data bonus
     */
    public String toString(){
        return              "ID = " + id + 
                            "\nReferral Code = " + referralCode + 
                            "\nExtra Fee = " + extraFee + 
                            "\nMin Total Fee = " + minTotalFee +
                            "\nActive = " + active;  
    }
}
