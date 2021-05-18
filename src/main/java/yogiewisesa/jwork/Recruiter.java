package yogiewisesa.jwork;
/**
 * 
 *
 * @author (Yogie Wisesa)
 * @version (Modul2-18.03.2021)
 */
public class Recruiter {
    /* 
    inisiasi 
    variabel
    */
    private int id; //inisiasi variabel integer
    private String name, email, phoneNumber; //inisiasi variabel string
    private Location location;// inisiasi variabel dari class lokasi

    /**
     * constructor recruiter
     * @param id integer id dari perekrut
     * @param name nama perekrut
     * @param email perekrut
     * @param phoneNumber nomor telepon perekrut
     * @param location lokasi perekrut dari class location
     */
    public Recruiter(int id, String name, String email, String phoneNumber, Location location){
        this.id = id;
        this.email = email;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }

    /**
     * getter id perekrut
     * @return id perekrut
     */
    public int getId (){
        return id;
    }
    

    /**
     * getter nama perekrut
     * @return name nama dari perekrut
     */
    public String getName (){
        return name;
    }
    
    /**
     * getter email perekrut
     * @return email dari perekrut
     */
    public String getEmail (){
        return email;
    }
    
    /**
     * getter nomor telepon perekrut
     * @return phoneNumber dari perekrut
     */
    public String getPhoneNumber (){
        return phoneNumber;
    }

    /**
     * getter lokasi dari perekrut melalui class location
     * @return location dari perekrut
     */
    public Location getLocation(){
        return location;
    }

    /**
     * setter id perekrut
     * @param id integer id dari perekrut
     */
    public void setId(int id){
        this.id = id;
    }
    
    /**
     * setter email perekrut
     * @param email dari perekrut
     */
    public void setEmail(String email){
        this.email = email;
    } 

    /**
     * setter nama perekrut
     * @param name dari perekrut
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * setter nomor telepon perekrut
     * @param phoneNumber string nomor telepon dari perekrut
     */
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    /**
     * setter lokasi perekrut
     * @param location perekrut dari class location (provinsi, kota, deskripsi)
     */
    public void setLocation(Location location){
        this.location = location;
    }

    /**
     * method untuk mencetak nama rekruter
     * outputnya string nama dari rekruter
     */
    public String toString(){
        return  "ID = " + id +
                "\nRecruiter name =  "+ name + 
                "\nPhone Number = " + phoneNumber + 
                "\nLocation = " + location;
    }
}
