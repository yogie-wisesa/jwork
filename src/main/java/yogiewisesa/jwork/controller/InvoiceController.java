package yogiewisesa.jwork.controller;

import org.springframework.web.bind.annotation.*;
import yogiewisesa.jwork.*;

import java.util.ArrayList;

@RequestMapping("/invoice")
@RestController
public class InvoiceController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Invoice> getAllInvoice(){
        ArrayList<Invoice> invoice = null;
        invoice = DatabaseInvoice.getInvoiceDatabase();
        return invoice;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Invoice getInvoiceById(@PathVariable int id){
        Invoice invoice = null;
        try {
            invoice = DatabaseInvoice.getInvoicebyId(id);
        } catch (InvoiceNotFoundException e) {
            e.getMessage();
            return null;
        }
        return invoice;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ArrayList<Invoice> getInvoiceByJobseekerId(@PathVariable int jobseekerId){
        ArrayList<Invoice> invoice = null;
//        try {
            invoice = DatabaseInvoice.getInvoicebyJobseeker(jobseekerId);
//        } catch (InvoiceNotFoundException e) {
//            e.getMessage();
//            return null;
//        }
        return invoice;
    }

    @RequestMapping(value = "/invoiceStatus/{id}", method = RequestMethod.PUT)
    public Invoice changeInvoiceStatus(@RequestParam(value="id") int id,
                                       @RequestParam(value="invoiceStatus") InvoiceStatus status){
        DatabaseInvoice.changeInvoiceStatus(id, status);
        try {
            Invoice invoice = DatabaseInvoice.getInvoicebyId(id);
            return invoice;
        } catch (InvoiceNotFoundException e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Boolean removeInvoice(@RequestParam(value = "id") int id){
        try{
            DatabaseInvoice.removeInvoice(id);
        } catch (InvoiceNotFoundException e){
            e.getMessage();
            return false;
        }
        return true;
    }

    @RequestMapping(value = "/createBankPayment", method = RequestMethod.POST)
    public Invoice addBankPayment(@RequestParam(value = "jobIdList") ArrayList<Integer> jobIdList,
                                  @RequestParam(value = "jobseekerId") int jobseekerId,
                                  @RequestParam(value = "adminFee") int adminFee)
    {
        try{
            ArrayList<Job> jobs = new ArrayList<Job>();
            for (Integer id : jobIdList){
                Job job = DatabaseJob.getJobById(id);
                jobs.add(job);
            }
            Jobseeker jobseeker = DatabaseJobseeker.getJobseekerById(jobseekerId);
            BankPayment bp = new BankPayment(DatabaseInvoice.getLastId() + 1, jobs, jobseeker, adminFee);
            DatabaseInvoice.addInvoice(bp);
            return bp;
        } catch (JobSeekerNotFoundException e){
            System.out.println(e.getMessage());
        } catch (JobNotFoundException e){
            System.out.println(e.getMessage());
        } catch (OngoingInvoiceAlreadyExistsException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @RequestMapping(value = "/createEWalletPayment", method = RequestMethod.POST)
    public Invoice addBankPayment(@RequestParam(value = "jobIdList") ArrayList<Integer> jobIdList,
                                  @RequestParam(value = "jobseekerId") int jobseekerId,
                                  @RequestParam(value = "referralCode") Bonus referralCode)
    {
        try{
            ArrayList<Job> jobs = new ArrayList<Job>();
            for (Integer id : jobIdList){
                Job job = DatabaseJob.getJobById(id);
                jobs.add(job);
            }
            Jobseeker jobseeker = DatabaseJobseeker.getJobseekerById(jobseekerId);
            EwalletPayment ep = new EwalletPayment(DatabaseInvoice.getLastId() + 1, jobs, jobseeker, referralCode);
            DatabaseInvoice.addInvoice(ep);
            return ep;
        } catch (JobSeekerNotFoundException e){
            System.out.println(e.getMessage());
        } catch (JobNotFoundException e){
            System.out.println(e.getMessage());
        } catch (OngoingInvoiceAlreadyExistsException e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
