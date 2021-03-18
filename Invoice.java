/**
 * 
 *
 * @author (Yogie Wisesa)
 * @version (Modul2-18.03.2021)
 */

public class Invoice {
    /*
    inisiasi 
    variable
    */
    public int id, idJob, totalFee; //inisiasi variable integer
    public String date; //inisiasi variable string 
    public Jobseeker jobseeker; //inisasi variable dari class jobseeker

    /**
     * constructor invoice
     * @param id dari pencari kerja
     * @param idJob dari pekerjaan
     * @param date tanggal 
     * @param totalFee gaji total
     * @param jobseeker identitas dari class jobseeker
     */
    public void Invoice(int id, int idJob, String date, int totalFee, Jobseeker jobseeker){
        this.id = id;
        this.date = date;
        this.totalFee = totalFee;
        this.jobseeker = jobseeker;
    }

    /**
     * getter id jobseeker
     * @return id dari jobseeker
     */
    public int getId (){
        return id;
    }
    
    /**
     * getter id job
     * @return idJob dari job
     */
    public int getIdJob (){
        return idJob;
    }
    
    /**
     * getter tanggal 
     * @return date tanggal 
     */
    public String getDate (){
        return date;
    }
    
    /**
     * getter gaji total
     * @return totalFee gaji total 
     */
    public int getTotalFee (){
        return totalFee;
    }
    
    /**
     * getter identitas jobseeker
     * @return jobseeker identitas jobseeker
     */
    public Jobseeker getJobseeker(){
        return jobseeker;
    }

    /**
     * setter id jobseeker
     * @param id
     */
    public void setId(int id){
        this.id = id;
    }
    
    /**
     * setter idJob pekerjaan
     * @param idJob
     */
    public void setIdJob(int idJob){
        this.idJob = idJob;
    }
  
    /**
     * setter tanggal
     * @param date
     */
    public void setDate(String date){
        this.date = date;
    }

    /**
     * setter gaji total
     * @param totalFee
     */
    public void setTotalFee(int totalFee){
        this.totalFee = totalFee;
    }

    /**
     * setter identitas jobseeker
     * @param jobseeker identitas dari class jobseeker
     */
    public void setJobseeker(Jobseeker jobseeker){
        this.jobseeker = jobseeker;
    }

    /**
     * method printData
     */
    public void printData(){

    }
}

