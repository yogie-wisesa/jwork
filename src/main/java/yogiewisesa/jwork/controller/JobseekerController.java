package yogiewisesa.jwork.controller;

import yogiewisesa.jwork.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/jobseeker")
@RestController
public class JobseekerController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Jobseeker> getDatabaseCustomer(){
        return DatabaseJobseekerPostgre.getDatabaseJobseeker();
    }

    @RequestMapping("/{id}")
    public Jobseeker getJobseekerById(@PathVariable int id) {
        Jobseeker jobseeker = null;
//        try {
            jobseeker = DatabaseJobseekerPostgre.getJobseeker(id);
//        } catch (JobSeekerNotFoundException e) {
//            e.getMessage();
//            return null;
//        }
        return jobseeker;
    }
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Jobseeker loginJobseeker(@RequestParam(value="email") String email,
                                    @RequestParam(value="password") String password){
        Jobseeker jobseeker = DatabaseJobseekerPostgre.getJobseeker(email, password);
        return jobseeker;
    }



    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Jobseeker registerJobseeker( @RequestParam(value="name") String name,
                                        @RequestParam(value="email") String email,
                                        @RequestParam(value="password") String password)
    {
//        Jobseeker jobseeker = new Jobseeker(name, email, password);
//        try {
//            DatabaseJobseekerPostgre.insertJobseeker(jobseeker);
//        } catch (EmailAlreadyExistException e) {
//            e.getMessage();
//            return null;
//        }
        return DatabaseJobseekerPostgre.insertJobseeker(name, email, password);
    }
}