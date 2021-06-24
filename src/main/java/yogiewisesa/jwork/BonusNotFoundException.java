/**
 * @author Yogie Wisesa
 * @version 24/6/21
 * 
 * class bonus not found exception
 * untuk menghandle jika bonus tidak ditemukan
 */
package yogiewisesa.jwork;
public class BonusNotFoundException extends Exception{
    private Bonus bonus_error;

    /**
     * constructor 
     * @param bonus_input passing error
     */
    public BonusNotFoundException(Bonus bonus_input){
        super("Bonus ID: ");
        bonus_error = bonus_input;
    }

    /**
     * method getter pesan error
     * @return pesan error
     */
    public String getMessage(){
        return super.getMessage() + bonus_error + " not found";

    }
}
