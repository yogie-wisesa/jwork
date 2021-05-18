package yogiewisesa.jwork;
public class BonusNotFoundException extends Exception{
    private Bonus bonus_error;

    public BonusNotFoundException(Bonus bonus_input){
        super("Bonus ID: ");
        bonus_error = bonus_input;
    }

    public String getMessage(){
        return super.getMessage() + bonus_error + " not found";

    }
}
