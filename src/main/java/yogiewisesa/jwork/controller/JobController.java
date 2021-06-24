/**
 * @author Yogie Wisesa
 * @version 24/6/21
 * 
 * class Job controller
 */
package yogiewisesa.jwork.controller;

import org.springframework.web.bind.annotation.*;
import yogiewisesa.jwork.*;

import java.util.ArrayList;

@RequestMapping("/job")
@RestController
public class JobController {

    /**
     * method getter semua job
     * @return seluruh job yang ada
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Job> getAllJob(){
        ArrayList<Job> job = null;
        job = DatabaseJob.getJobDatabase();
        return job;
    }

    /**
     * method getter job menggunakan id
     * @param id
     * @return job ber id tersebut
     */
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

    /**
     * getter job berdasarkan id recruiter
     * @param recruiterId
     * @return job dengan id recruiter tersebut
     */
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

    /**
     * getter job berdasarkan kategori
     * @param category
     * @return job dengan kategori tersebut
     */
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

    /**
     * method menambahkan job baru
     * @param name nama pekerjaan
     * @param recruiterId
     * @param fee gaji
     * @param category kategori pekerjaan
     * @return job yang baru dibuat
     * @throws RecruiterNotFoundException
     */
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
