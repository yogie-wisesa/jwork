/**
 * 
 *
 * @author (Yogie Wisesa)
 * @version (Modul2-18.03.2021)
 */
public class Job {
    /*
    inisiasi
    variabel
    */
    private int id, fee; //inisiasi variabel integer
    private String name; //inisiasi variabel string
    private Recruiter recruiter; //inisiasi variabel dari class recruiter
    private JobCategory category;

    /**
     * constructor job
     * @param id integer id dari pekerjaan
     * @param name nama pekerjaan
     * @param recruiter perekrut pekerjaan
     * @param fee integer gaji
     * @param category kategori pekerjaan
     */
    public Job(int id, String name, Recruiter recruiter, int fee, JobCategory category){
        this.id = id;
        this.name = name;
        this.recruiter = recruiter;
        this.fee = fee;
        this.category = category;
    }

    /**
     * getter id pekerjaan
     * @return id pekerjaan
     */
    public int getId (){
        return id;
    }
    
    /**
     * getter nama pekerjaan
     * @return nama pekerjaan 
     */
    public String getName (){
        return name;
    }
    
    /**
     * getter gaji pekerjaan
     * @return fee gaji pekerjaan
     */
    public int getFee (){
        return fee;
    }
     /**
      * getter kategori pekerjaan
      * @return category kategori pekerjaan
      */
    public JobCategory getCategory (){
        return category;
    }
    
    /**
     * getter identitas perekrut
     * @return recruiter identitas perekrut
     */
    public Recruiter getRecruiter(){
        return recruiter;
    }

    /**
     * setter id pekerjaan
     * @param id integer id dari pekerjaan 
     */
    public void setId(int id){
        this.id = id;
    }
    
    /**
     * setter nama pekerjaan
     * @param name dari pekerjaan
     */
    public void setName(String name){
        this.name = name;
    }
  
    /**
     * setter identitas perekrut
     * @param recruiter identitas perekrut dari class recruiter
     */
    public void setRecruiter(Recruiter recruiter){
        this.recruiter = recruiter;
    }

    /**
     * setter gaji pekerjaan
     * @param fee integer gaji
     */
    public void setFee(int fee){
        this.fee = fee;
    }

    /**
     * setter kategori pekerjaan
     * @param category string 
     */
    public void setCategory(JobCategory category){
        this.category = category;
    }
    
    /**
     * method printData
     */
    public String toString(){
        return "========== JOB ==========\n" +
                            "ID: " + id +
                            "\nName: " + name +
                            //"\nRecruiter: " + getRecruiter().getName() +
                            "\nCity: " + getRecruiter().getLocation().getCity() +
                            "\nFee: " + fee + 
                            "\nCategory: " + getCategory().toString();
    }
}
