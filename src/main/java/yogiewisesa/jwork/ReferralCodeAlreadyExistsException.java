package yogiewisesa.jwork;
public class ReferralCodeAlreadyExistsException extends Exception{
    private String bonus_error;

    public ReferralCodeAlreadyExistsException(Bonus bonus_input){
        super("Referral Code: ");
        bonus_error = bonus_input.getReferralCode();
    }

    public String getMessage(){
        return super.getMessage() + bonus_error + " already exists.";
    }
}
