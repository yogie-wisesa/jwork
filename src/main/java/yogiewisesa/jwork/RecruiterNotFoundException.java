/**
 * @author Yogie Wisesa
 * @version 26/6/21
 * 
 * class exception recruiter not found
 */
package yogiewisesa.jwork;
public class RecruiterNotFoundException extends Exception{
    private int recruiter_error;

    /**
     * constructor exception
     * @param recruiter_input
     */
    public RecruiterNotFoundException(int recruiter_input){
        super("Recruiter ID: ");
        recruiter_error = recruiter_input;
    }

    /**
     * method untuk mencetak pesan error
     */
    public String getMessage(){
        return super.getMessage() + recruiter_error + " not found";

    }
}
