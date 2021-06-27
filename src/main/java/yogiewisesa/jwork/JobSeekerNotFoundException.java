/**
 * @author Yogie Wisesa
 * @version 26/6/21
 * 
 * class exception jobseeker not found
 * untuk menghandle ketika jobseeker tidak ditemukan
 */
package yogiewisesa.jwork;
public class JobSeekerNotFoundException extends Exception{
    private int jobseeker_error;

    /**
     * constructor exception jobseeker not found
     * @param jobseeker_input
     */
    public JobSeekerNotFoundException(int jobseeker_input){
        jobseeker_error = jobseeker_input;
    }

    /**
     * method untuk mencetak pesan error
     */
    public String getMessage(){
        return super.getMessage()+ jobseeker_error + " not found";
    }
}
