
public class Jobseeker {
    public int id;
    public String name, email, password, joinDate;

    public void Jobseeker(int id, String name, String email, String password, String joinDate){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = joinDate;
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
    
    public String getPassword (){
        return password;
    }
    
    public String getJoinDate (){
        return joinDate;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setEmail(String email){
        this.email = email;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setJoinDate(String joinDate){
        this.joinDate = joinDate;
    }

    public void printData(){
        System.out.println("Jobseeker name: " + name);
    }
}
