public class Location {
    public String province, city, description;
   
    public Location(String province, String city, String description){
        this.city = city;
        this.province = province;
        this.description = description;
    }

    public String getProvince(){
        return province;
    }

    public String getCity(){
       return city;
    } 

    public String getDescription(){
        return description;
    }
    
    public void setCity(String city){
        this.city = city;
    }

    public void setProvince(String province){
        this.province = province;
    } 

    public void setDescription(String description){
        this.description = description;
    }
    
    public void printData(){

    }

}
