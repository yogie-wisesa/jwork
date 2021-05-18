package yogiewisesa.jwork;
public class JobSeekerNotFoundException extends Exception{
    private int jobseeker_error;

    public JobSeekerNotFoundException(int jobseeker_input){
        jobseeker_error = jobseeker_input;
    }

    public String getMessage(){
        return super.getMessage()+ jobseeker_error + " not found";
    }
}
