
public class Invoice {
    public int id, idJob, totalFee;
    public String date;
    public Jobseeker jobseeker;

    public void Invoice(int id, int idJob, String date, int totalFee, Jobseeker jobseeker){
        this.id = id;
        this.date = date;
        this.totalFee = totalFee;
        this.jobseeker = jobseeker;
    }

    public int getId (){
        return id;
    }
    
    public int getIdJob (){
        return idJob;
    }
    
    public String getDate (){
        return date;
    }
    
    public int getTotalFee (){
        return totalFee;
    }
    
    public Jobseeker getJobseeker(){
        return jobseeker;
    }

    public void setId(int id){
        this.id = id;
    }
    
    public void setIdJobs(int idJob){
        this.idJob = idJob;
    }
  
    public void setDate(String date){
        this.date = date;
    }

    public void setTotalFee(int totalFee){
        this.totalFee = totalFee;
    }

    public void setJobseeker(Jobseeker jobseeker){
        this.jobseeker = jobseeker;
    }

    public void printData(){

    }
}

