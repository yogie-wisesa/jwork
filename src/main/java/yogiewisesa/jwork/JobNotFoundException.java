/**
 * @author Yogie Wisesa
 * @version 26/6/21
 * 
 * class exception job not found
 * untuk menghandle error ketika job tidak ditemukan
 */
package yogiewisesa.jwork;
public class JobNotFoundException extends Exception{
    private int job_error;

    /**
     * constructor exception job not found
     * @param error
     */
    public JobNotFoundException(int job_input){
        super("Job ID: ");
        job_error = job_input;
    }

    /**
     * method getmessage untuk mencetak pesan error
     */
    public String getMessage(){
        return super.getMessage() + job_error + " not found";
    }
}
