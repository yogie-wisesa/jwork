package yogiewisesa.jwork;
public class EmailAlreadyExistException extends Exception{
    private Jobseeker jobseeker_error;

    public EmailAlreadyExistException(Jobseeker jobseeker_input){
        super("Jobseeker Email: ");
        jobseeker_error = jobseeker_input;
    }

    public String getMessage(){
        return super.getMessage() + jobseeker_error.getEmail() + " already exists.";

    }

}
