/**
 * @author Yogie Wisesa
 * @version 24/6/21
 * 
 * class exception email already exist
 * untuk menghandle error jika ada email yang sama ingin didaftarkan 
 */

package yogiewisesa.jwork;
public class EmailAlreadyExistException extends Exception{
    private Jobseeker jobseeker_error;

    /**
     * constructor exception
     * @param jobseeker_input error
     */
    public EmailAlreadyExistException(Jobseeker jobseeker_input){
        super("Jobseeker Email: ");
        jobseeker_error = jobseeker_input;
    }

    /**
     * method getMessage untuk mencetak pesan error
     * @return error message
     */
    public String getMessage(){
        return super.getMessage() + jobseeker_error.getEmail() + " already exists.";

    }

}
