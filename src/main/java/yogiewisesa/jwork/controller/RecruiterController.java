package yogiewisesa.jwork.controller;

import org.springframework.web.bind.annotation.*;
import yogiewisesa.jwork.*;

import java.util.ArrayList;

@RequestMapping("/recruiter")
@RestController
public class RecruiterController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Recruiter> getAllRecruiter(){
        ArrayList<Recruiter> recruiter = null;
        recruiter = DatabaseRecruiter.getRecruiterDatabase();
        return recruiter;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Recruiter getRecruiterById(@PathVariable int id) throws RecruiterNotFoundException{
        Recruiter recruiter = null;
        try {
            recruiter = DatabaseRecruiter.getRecruiterById(id);
        }catch (RecruiterNotFoundException e){
            throw e;
        }
        return recruiter;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Recruiter addRecruiter(@RequestParam(value ="name") String name,
                                  @RequestParam(value ="email") String email,
                                  @RequestParam(value ="phoneNumber") String phoneNumber,
                                  @RequestParam(value ="province") String province,
                                  @RequestParam(value ="city") String city,
                                  @RequestParam(value ="description") String description){
        Location location = new Location(province, city, description);
        Recruiter recruiter = new Recruiter(DatabaseRecruiter.getLastId()+1, name, email, phoneNumber, location);

        if (DatabaseRecruiter.addRecruiter(recruiter)){
            return recruiter;
        }
        else{
            return null;
        }
    }
}
