
/**
 * Write a description of class JWork here.
 *
 * @author (Yogie Wisesa)
 * @version (a version number or a date)
 */
public class JWork
{
    public static void main(String[] args){
            Location tempatLahir = new Location("DKI Jakarta", "Jakarta Utara", "Sunter");
            Recruiter praktikan = new Recruiter(1, "Yogie Wisesa", "yogie.wisesa@ui.ac.id", "025123456", tempatLahir);
            Job teller = new Job(6, "Teller", praktikan, 3000, "Customer Service");
            Jobseeker johnS = new Jobseeker(1, "John Smith", "john.smith@gmail.com", "123", "1 September 2020");
            Invoice pertama = new Invoice (1, 1, "2 September 2020", 12000, johnS);
            
            System.out.println(praktikan.getName());;
            praktikan.setName("Geraldy");
            teller.printData();
    }
    
}
