/**
 * 
 * class jobseeker
 * @author (Yogie Wisesa)
 * @version (Modul2-18.03.2021)
 */


public class Jobseeker {
    /*
    insisasi 
    variabel 
    */
    private int id; //inisiasi variabel integer
    private String name, email, password, joinDate; //inisiasi vairabel string
    
    /**
     * constructor dari class jobseeker
     * @param id dari pencari kerja
     * @param name nama pencari kerja
     * @param email pencari kerja
     * @param password akun pencari kerja
     * @param joinDate tanggal bergabung ke platform
     */
    public Jobseeker(int id, String name, String email, String password, String joinDate){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = joinDate;
    }
    
    /**
    * getter id jobseeker
    * @return id integer pencari kerja
    * 
    */
    public int getId (){
        
        return id;
    }
    
    /**
    * getter nama jobseeker
    * @return name dari jobseeker
    * 
    */
    public String getName (){
       
        return name;
    }
    
    /**
    * getter email 
    * @return email jobseeker
    * 
    */
    public String getEmail (){
        
        return email;
    }
    
    /**
     * getter password akun pencair kerja
     * @return password akun
     */
    public String getPassword (){
        return password;
    }
    
    /**
     * getter tanggal bergabung ke platform
     * @return joinDate tanggal bergabung
     */
    public String getJoinDate (){
        return joinDate;
    }
    
    /**
     * setter id pencari kerja
     * @param id integer id
     */
    public void setId(int id){
        this.id = id;
    }
    
    /**
     * setter nama pencari kerja
     * @param name string nama
     */
    public void setName(String name){
        this.name = name;
    }
    
    /**
     * setter email pencari kerja
     * @param email string email
     */
    public void setEmail(String email){
        this.email = email;
    }

    /**
     * setter password akun
     * @param password string password dari akun
     */
    public void setPassword(String password){
        this.password = password;
    }

    /**
     * setter tanggal bergabung akun
     * @param joinDate string tanggal bergabung akun
     */
    public void setJoinDate(String joinDate){
        this.joinDate = joinDate;
    }

    /**
     * method untuk mencetak nama pencari kerja
     * output berupa nama pencari kerja
     */
    public void printData(){
        System.out.println("Jobseeker name: " + name);
    }
}
