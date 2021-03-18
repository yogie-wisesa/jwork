
/**
 * Write a description of class JWork here.
 *
 * @author (Yogie Wisesa)
 * @version (a version number or a date)
 */
public class JWork
{
    public void main(String[] args){
            Location kotaBogor = new Location("Jawa Barat", "Kota Bogor", "Jalan Raya Pajajaran");
            Recruiter bankA = new Recruiter(1, "Bank A", "hrd@banka.com", "025123456", kotaBogor);
            Job teller = new Job(6, "Teller", bankA, 3000, "Customer Service");
            Jobseeker johnS = new Jobseeker(1, "John Smith", "john.smith@gmail.com", "123", "1 September 2020");
            Invoice pertama = new Invoice (1, 1, "2 September 2020", 12000, johnS);
            kotaBogor.printData();
            bankA.printData();
            johnS.printData();
    }
    
}
