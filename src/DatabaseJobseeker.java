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
    public static boolean addJobseeker(Jobseeker jobseeker) {
        for (Jobseeker js : JOBSEEKER_DATABASE)
        {
            if (js.getId() == jobseeker.getId()) return false;
            if (js.getEmail() == jobseeker.getEmail()) return false;
        }
        JOBSEEKER_DATABASE.add(jobseeker);
        lastId = jobseeker.getId();
        return true;
    }

    /**
     * @param
     * @return
     */
    public static boolean removeJobseeker(int id) {
        for (int i = 0; i < JOBSEEKER_DATABASE.size(); i++) {
            if (JOBSEEKER_DATABASE.get(i).getId() == id) {
                JOBSEEKER_DATABASE.remove(i);
                return true;
            }
        }
        return false;
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

    public static Jobseeker getJobseekerById(int id) {
        for (int i = 0; i < JOBSEEKER_DATABASE.size(); i++) {
            if (JOBSEEKER_DATABASE.get(i).getId() == id) {
                return JOBSEEKER_DATABASE.get(i);
            }
        }
        return null;
    }
}
