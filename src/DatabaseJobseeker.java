import java.util.ArrayList;

/**
 * 
 *
 * @author (Yogie Wisesa)
 * @version (27.03.2021)
 */
public class DatabaseJobseeker {

    private static ArrayList<Jobseeker> JOBSEEKER_DATABASE = new ArrayList<Jobseeker>();
    private static int lastId;

    /**
     * @param jobseeker
     * @return
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
     * @param
     * @return
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
     * @return
     */
    public static ArrayList<Jobseeker> getDatabaseJobseeker() {
        return JOBSEEKER_DATABASE;

    }

    public static int getLastId() {
        return lastId;
    }

    public static Jobseeker getJobseekerById(int id) throws JobSeekerNotFoundException {
        Jobseeker dummy = null;
        for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
            if (jobseeker.getId() == id) {
                dummy = jobseeker;
            } else {
                return dummy;
            }
        }
        throw new JobSeekerNotFoundException(id);
    }
}
