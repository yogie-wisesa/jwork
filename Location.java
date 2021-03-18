/**
 * 
 *
 * @author (Yogie Wisesa)
 * @version (Modul2-18.03.2021)
 */
public class Location {
    /*
    inisiasi
    variabel 
    */
    public String province, city, description; //inisiasi variabel string
   
    /**
     * constructor dari location
     * @param province provinsi dari alamat
     * @param city kota dari alamat
     * @param description deskripsi seperti alamat detail
     */
    public Location(String province, String city, String description){
        this.city = city;
        this.province = province;
        this.description = description;
    }

    /**
     * getter provinsi dari lokasi
     * @return province dari lokasi
     */
    public String getProvince(){
        return province;
    }

    /**
     * getter kota dari lokasi
     * @return city dari lokasi
     */
    public String getCity(){
       return city;
    } 

    /**
     * getter dari deskripsi lokasi
     * @return description dari lokasi
     */
    public String getDescription(){
        return description;
    }
    
    /**
     * setter city dari lokasi
     * @param city dari lokasi 
     */
    public void setCity(String city){
        this.city = city;
    }

    /**
     * setter provinsi dari lokasi
     * @param province dari lokasi
     */
    public void setProvince(String province){
        this.province = province;
    } 

    /**
     * setter deskripsi dari lokasi
     * @param description dari lokasi
     */
    public void setDescription(String description){
        this.description = description;
    }
    
    /**
     * method untuk mencetak nama provinsi dari lokasi
     * output berupa nama provinsi
     */
    public void printData(){
        System.out.println("Province: " + province);
    }

}
