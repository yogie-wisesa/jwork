/**
 * @author Yogie Wisesa
 * @version 24/6/21
 * 
 * class jobseeker controller
 */
package yogiewisesa.jwork.controller;

import yogiewisesa.jwork.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/jobseeker")
@RestController
public class JobseekerController {

    /**
     * method getter seluruh jobseeker
     * @return seluruh database jobseeker
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Jobseeker> getDatabaseJobseeker(){
        return DatabaseJobseekerPostgre.getDatabaseJobseeker();
    }

    /**
     * method getter jobseeker menggunakan id
     * @param id
     * @return jobseeker dengan id tersebut
     */
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

    /**
     * method untuk login akun jobseeker
     * @param email 
     * @param password
     * @return jobseeker yang baru login
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Jobseeker loginJobseeker(@RequestParam(value="email") String email,
                                    @RequestParam(value="password") String password){
        Jobseeker jobseeker = DatabaseJobseekerPostgre.getJobseeker(email, password);
        return jobseeker;
    }


    /**
     * method untuk registrasi jobseeker baru
     * @param name
     * @param email
     * @param password
     * @return jobseeker yang baru registrasi
     */
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