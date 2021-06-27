package yogiewisesa.jwork;
import java.util.ArrayList;

/**
 * 
 *
 * @author (Yogie Wisesa)
 * @version (27.03.2021)
 * 
 * class database recruiter
 * untuk menyimpan data recruiter ke arraylist
 */
public class DatabaseRecruiter {
    /**
     * 
     */
    private static ArrayList<Recruiter> RECRUITER_DATABASE = new ArrayList<Recruiter>();
    private static int lastId = 0;
    
    /**
     * method untuk menambah recruiter baru
     * @param recruiter
     * @return true jika berhasil ditambah
     */
    public static boolean addRecruiter(Recruiter recruiter){
        RECRUITER_DATABASE.add(recruiter);
        lastId = recruiter.getId();

        return true;
    }

    /**
     * method untuk menghapus recruiter
     * @param id untuk mencari recruiter yang ingin dihapus
     * @return true jika berhasil terhapus
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
     * method getter database recruiter
     * @return seluruh database recruiter
     */
    public static ArrayList<Recruiter> getRecruiterDatabase(){
        return RECRUITER_DATABASE;
    }

    /**
     * method getter id recruiter terakhir
     * @return id recruiter terakhir
     */
    public static int getLastId() {
        return lastId;
    }

    /**
     * method getter recruiter menggunakan id
     * @param id recruiter yang ingin dicari
     * @return recruiter dengan id tersebut
     */
    public static Recruiter getRecruiterById(int id) throws RecruiterNotFoundException{
        Recruiter dummy = null;
        for (Recruiter recruiter : RECRUITER_DATABASE) {
            if (recruiter.getId() == id) {
                dummy = recruiter;
                return dummy;
            }
        }
        throw new RecruiterNotFoundException(id);
    }
}
