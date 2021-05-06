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
    public static boolean removeRecruiter(int id) throws RecruiterNotFoundException{
        for (Recruiter recruiter : RECRUITER_DATABASE)
        {
            if (recruiter.getId() == id)
            {
                RECRUITER_DATABASE.remove(recruiter);
                return true;
            }
        }
        throw new RecruiterNotFoundException(id);
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
    public static Recruiter getRecruiterById(int id) throws RecruiterNotFoundException{
        Recruiter dummy = null;
        for (Recruiter recruiter : RECRUITER_DATABASE) {
            if (recruiter.getId() == id) {
                dummy = recruiter;
            } else {
                return dummy;
            }
        }
        throw new RecruiterNotFoundException(id);
    }


}
