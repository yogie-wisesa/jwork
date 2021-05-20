package yogiewisesa.jwork.controller;

import org.springframework.web.bind.annotation.*;
import yogiewisesa.jwork.*;

import java.util.ArrayList;

@RequestMapping("/job")
@RestController
public class JobController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Job> getAllJob(){
        ArrayList<Job> job = null;
        job = DatabaseJob.getJobDatabase();
        return job;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Job getJobById(@PathVariable int id){
        Job job = null;
        try {
            job = DatabaseJob.getJobById(id);
        } catch (JobNotFoundException e) {
            e.getMessage();
            return null;
        }
        return job;
    }

    @RequestMapping(value = "/{recruiterId}", method = RequestMethod.GET)
    public ArrayList<Job> getJobByRecruiter(@PathVariable int recruiterId){
        ArrayList<Job> job = null;
//        try {
            job = DatabaseJob.getJobByRecruiter(recruiterId);
//        } catch (JobNotFoundException e) {
//            e.getMessage();
//            return null;
//        }
        return job;
    }

    @RequestMapping(value = "/category/{category}", method = RequestMethod.GET)
    public ArrayList<Job> getJobByCategory(@PathVariable JobCategory category){
        ArrayList<Job> job = null;
//        try {
        job = DatabaseJob.getJobByCategory(category);
//        } catch (JobNotFoundException e) {
//            e.getMessage();
//            return null;
//        }
        return job;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Job addJob(@RequestParam(value = "name") String name,
                      @RequestParam(value = "recruiterId") int recruiterId,
                      @RequestParam(value = "fee") int fee,
                      @RequestParam(value = "category") JobCategory category)
            throws RecruiterNotFoundException
    {
        Recruiter recruiter = null;
        try {
            recruiter = DatabaseRecruiter.getRecruiterById(recruiterId);
        } catch (RecruiterNotFoundException e)
        {
            throw e;
        }
        Job job = new Job(DatabaseJob.getLastId()+1, name, recruiter, fee, category);
        boolean success = DatabaseJob.addJob(job);

        if (success)
        {
            return job;
        } else
        {
            return null;
        }
    }
}
