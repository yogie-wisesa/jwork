/**
 * @author Yogie Wisesa
 * @version 26/6/21
 * 
 * class exception referral code already exists
 * untuk menghandle jika sudah ada referral code yang sama
 */
package yogiewisesa.jwork;
public class ReferralCodeAlreadyExistsException extends Exception{
    private String bonus_error;

    /**
     * constructor exception
     * @param bonus_input
     */
    public ReferralCodeAlreadyExistsException(Bonus bonus_input){
        super("Referral Code: ");
        bonus_error = bonus_input.getReferralCode();
    }

    /**
     * method untuk mencetak pesan error
     */
    public String getMessage(){
        return super.getMessage() + bonus_error + " already exists.";
    }
}
