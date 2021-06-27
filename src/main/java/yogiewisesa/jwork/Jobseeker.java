package yogiewisesa.jwork;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * class jobseeker
 * @author (Yogie Wisesa)
 * @version (Modul2-18.03.2021)
 * 
 * untuk menghandle pembuatan objek jobseeker
 */


public class Jobseeker {
    /*
    insisasi 
    variabel 
    */
    private int id; //inisiasi variabel integer
    private String name, email, password; //inisiasi vairabel string
    public Calendar joinDate;
    
    /**
     * constructor dari class jobseeker
     * @param id dari pencari kerja
     * @param name nama pencari kerja
     * @param email pencari kerja
     * @param password akun pencari kerja
     * @param joinDate tanggal bergabung ke platform
     */
    public Jobseeker(int id, String name, String email, String password, Calendar joinDate){
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
        this.joinDate = joinDate;
    }

    public Jobseeker(int id, String name, String email, String password, int year, int month, int dayOfMonth){
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
        this.joinDate = new GregorianCalendar(year, month, dayOfMonth);
    }
    
    public Jobseeker(int id, String name, String email, String password){
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
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
    public Calendar getJoinDate (){
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
        String regex = "^(?!.*([.])\1)[^-.@][a-zA-Z0-9.&*_~]+(?!.*([@.])\1)[^-.][a-zA-Z0-9-.&*_~]+(?:\\.[a-zA-Z0-9-]+)*$";
        Pattern pt = Pattern.compile(regex);
        Matcher mt = pt.matcher(email);
        if (mt.matches()){
            this.email = email;
        }
        else{
            this.email = "";
        }
        
    }

    /**
     * setter password akun
     * @param password string password dari akun
     */
    public void setPassword(String password){
        String regexP = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z[0-9]]{6,}$";
        Pattern pt = Pattern.compile(regexP);
        Matcher mt = pt.matcher(password);
        if (mt.matches()){
            this.password = password;
        }
        else{
            this.password = "";
        }
    }

    /**
     * setter tanggal bergabung akun
     * @param joinDate string tanggal bergabung akun
     */
    public void setJoinDate(Calendar joinDate){
        this.joinDate = joinDate;
    }

    public void setJoinDate(int year, int month, int dayOfMonth)
    {
        this.joinDate = new GregorianCalendar(year, month-1, dayOfMonth);
    }

    /**
     * method untuk mencetak nama pencari kerja
     * output berupa nama pencari kerja
     */
    public void printData(){
        System.out.println("Jobseeker name: " + name);
    }

    /**
     * method untuk mencetak data jobseeker
     */
    public String toString(){
        String strDate = "";
        if (joinDate != null){
            Date date = joinDate.getTime();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
            strDate = dateFormat.format(date);
        }
        else{
            strDate = "";
        }
        return  "ID = " + id + 
                "\nNama = " + name + 
                "\nEmail = " + email +
                "\nPassword = " + password +
                "\nJoin Date = " + strDate;
    }
}
