public class Recruiter {
    public int id;
    public String name, email, phoneNumber;
    public Location location;

    public void Recruiter(int id, String name, String email, String phoneNumber, Location location){
        this.id = id;
        this.email = email;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }

    public int getId (){
        return id;
    }
    
    public String getName (){
        return name;
    }
    
    public String getEmail (){
        return email;
    }
    
    public String getPhoneNumber (){
        return phoneNumber;
    }

    public Location getLocation(){
        return location;
    }

    public void setId(int id){
        this.id = id;
    }
      
    public void setEmail(String email){
        this.email = email;
    } 

    public void setName(String name){
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setLocation(){
        this.location = location;
    }

    public void printData(){
        System.out.println("Recruiter name: "+ name);
    }
}
