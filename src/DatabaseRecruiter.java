import java.util.ArrayList;

/**
 * 
 *
 * @author (Yogie Wisesa)
 * @version (27.03.2021)
 */
public class DatabaseRecruiter {
    /**
     * 
     */
    private static ArrayList<Recruiter> RECRUITER_DATABASE = new ArrayList<Recruiter>();
    private static int lastId = 0;
    
    /**
     * 
     * @param recruiter
     * @return
     */
    public static boolean addRecruiter(Recruiter recruiter){
        RECRUITER_DATABASE.add(recruiter);
        lastId = recruiter.getId();

        return true;
    }

    /**
     * 
     * @param
     * @return
     */
    public static boolean removeRecruiter(int id){
        for (int i = 0; i < RECRUITER_DATABASE.size(); i++) {
            if (RECRUITER_DATABASE.get(i).getId() == id) {
                RECRUITER_DATABASE.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * 
     * @return
     */
    public static ArrayList<Recruiter> getRecruiterDatabase(){
        return RECRUITER_DATABASE;
    }

    public int getLastId() {
        return lastId;
    }

    /**
     *
     * @return
     */
    public static Recruiter getRecruiterById(int id){
        for (int i = 0; i < RECRUITER_DATABASE.size(); i++) {
            if (RECRUITER_DATABASE.get(i).getId() == id) {
                return RECRUITER_DATABASE.get(i);
            }
        }
        return null;
    }


}
