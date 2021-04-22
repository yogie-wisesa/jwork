import java.util.ArrayList;

/**
 * 
 *
 * @author (Yogie Wisesa)
 * @version (Modul2-18.03.2021)
 */


public class DatabaseJob {
    /*
    inisiasi 
    variabel
    */
    private static ArrayList<Job> JOB_DATABASE = new ArrayList<Job>(), jobsByRecruiter = new ArrayList<Job>(), jobsByCategory = new ArrayList<Job>();
    private static int lastId;

    /**
     * method untuk menambahkan lowongan baru
     *
     * @param job detail pekerjaan
     * @return boolean
     */
    public static boolean addJob(Job job) {
        JOB_DATABASE.add(job);
        lastId = job.getId();
        return true;
    }

    /**
     * method untuk menghapus lowongan
     *
     * @param
     * @return boolean
     */
    public static boolean removeJob(int id) {
        for (int i = 0; i < JOB_DATABASE.size(); i++) {
            if (JOB_DATABASE.get(i).getId() == id) {
                JOB_DATABASE.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * getter detail pekerjaan
     *
     * @return null
     */
    public static ArrayList<Job> getJobDatabase() {
        return JOB_DATABASE;

    }

    public int getLastId() {
        return lastId;
    }

    public static Job getJobById(int id) {
        for (int i = 0; i < JOB_DATABASE.size(); i++) {
            if (JOB_DATABASE.get(i).getId() == id) {
                return JOB_DATABASE.get(i);
            }
        }
        return null;
    }

    public static ArrayList<Job> getJobByRecruiter(int recruiterId) {

        for (int i = 0; i < JOB_DATABASE.size(); i++) {
            if (JOB_DATABASE.get(i).getRecruiter().getId() == recruiterId) {
                jobsByRecruiter.add(JOB_DATABASE.get(i));
                return jobsByRecruiter;
            }
        }
        return null;
    }

    public static ArrayList<Job> getJobByCategory(JobCategory category) {
        for (int i = 0; i < JOB_DATABASE.size(); i++) {
            if (JOB_DATABASE.get(i).getCategory() == category) {
                jobsByCategory.add(JOB_DATABASE.get(i));
                return jobsByCategory;
            }
        }
        return null;
    }

}