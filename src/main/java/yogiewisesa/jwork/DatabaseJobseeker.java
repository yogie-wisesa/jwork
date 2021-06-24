package yogiewisesa.jwork;
import java.util.ArrayList;

/**
 * 
 *
 * @author (Yogie Wisesa)
 * @version (27.03.2021)
 * 
 * class database jobseeker
 * untuk menyimpan jobseeker pada arraylist
 * sudah digantikan menggunakan class DatabaseJobseekerPostgre
 */
public class DatabaseJobseeker {

    private static ArrayList<Jobseeker> JOBSEEKER_DATABASE = new ArrayList<Jobseeker>();
    private static int lastId;

    /**
     * method untuk menambah jobseeker baru
     * @param jobseeker
     * @return true jika berhasil ditambah
     */
    public static boolean addJobseeker(Jobseeker jobseeker) throws EmailAlreadyExistException{
        for (Jobseeker orang : JOBSEEKER_DATABASE) {
            if (jobseeker.getEmail() == orang.getEmail()) {
                throw new EmailAlreadyExistException(jobseeker);
            }
        }
        JOBSEEKER_DATABASE.add(jobseeker);
        lastId = jobseeker.getId();
        return true;
    }

    /**
     * method untuk menghapus jobseeker
     * @param id untuk mencari
     * @return true jika berhasil dihapus
     */
    public static boolean removeJobseeker(int id) throws JobSeekerNotFoundException {
        for (Jobseeker jobseeker : JOBSEEKER_DATABASE)
        {
            if (jobseeker.getId() == id)
            {
                JOBSEEKER_DATABASE.remove(jobseeker);
                return true;
            }
        }
        throw new JobSeekerNotFoundException(id);
    }

    /**
     * method getter database jobseeker
     * @return seluruh database jobseeker
     */
    public static ArrayList<Jobseeker> getDatabaseJobseeker() {
        return JOBSEEKER_DATABASE;

    }

    /**
     * method getter id jobseeker terakhir
     * @return id jobseeker terakhir
     */
    public static int getLastId() {
        return lastId;
    }

    /**
     * method getter jobseeker menggunakanid
     * @param id
     * @return jobseeker yang dicari
     * @throws JobSeekerNotFoundException
     */
    public static Jobseeker getJobseekerById(int id) throws JobSeekerNotFoundException {
        Jobseeker dummy = null;
        for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
            if (jobseeker.getId() == id) {
                dummy = jobseeker;
                return dummy;
            }
        }
        throw new JobSeekerNotFoundException(id);
    }

    /**
     * method untuk login jobseeker
     * @param email
     * @param password
     * @return jobseeker yang baru login
     */
    public static Jobseeker jobseekerLogin(String email, String password){
        Jobseeker dummy = null;
        for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
            if (jobseeker.getEmail().equals(email) && jobseeker.getPassword().equals(password)) {
                dummy = jobseeker;
            }
        }
        return dummy;
    }
}
