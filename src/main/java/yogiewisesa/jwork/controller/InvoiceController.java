/**
 * @author Yogie Wisesa
 * @version 24/6/21
 * 
 * class Invoice controller
 */
package yogiewisesa.jwork.controller;

import org.springframework.web.bind.annotation.*;
import yogiewisesa.jwork.*;

import java.util.ArrayList;

@RequestMapping("/invoice")
@RestController
public class InvoiceController {

    /**
     * method getter semua invoice yang ada
     * @return invoice yang ada
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Invoice> getAllInvoice(){
        ArrayList<Invoice> invoice = null;
        invoice = DatabaseInvoice.getInvoiceDatabase();
        return invoice;
    }

    /**
     * method getter invoice menggunakan id
     * @param id
     * @return invoice dengan id terkait
     */
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

    /**
     * method getter invoice menggunakan jobseekerId
     * @param jobseekerId
     * @return invoice dengan jobseeker id terkait
     */
    @RequestMapping(value = "/jobseeker/{jobseekerId}", method = RequestMethod.GET)
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

    /**
     * method pengganti status invoice
     * @param id id dari invoice
     * @param status status invoice selanjutnya antara finsihed atau cancelled
     * @return invoice yang baru diganti
     */
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

    /**
     * method menghapus invoice dengan id
     * @param id
     * @return true jika berhasil dihapus
     */
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

    /**
     * method membuat invoice baru dengan metode pembayaran bank
     * @param jobIdList job yang diapply
     * @param jobseekerId yang melamar
     * @param adminFee biaya admin
     * @return invoice yang baru dibuat
     */
    @RequestMapping(value = "/createBankPayment", method = RequestMethod.POST)
    public Invoice addBankPayment(@RequestParam(value = "jobIdList") ArrayList<Integer> jobIdList,
                                  @RequestParam(value = "jobseekerId") int jobseekerId,
                                  @RequestParam(value = "adminFee") int adminFee)
    {
        try{
            ArrayList<Job> jobs = new ArrayList<Job>();
            int jobId = jobIdList.get(0);
            Job job = DatabaseJob.getJobById(jobId);
            jobs.add(job);
//            for (int id : jobIdList){
//                Job job = DatabaseJob.getJobById(id);
//                jobs.add(job);
//            }
//            Jobseeker jobseeker = DatabaseJobseeker.getJobseekerById(jobseekerId);
            BankPayment bp = new BankPayment(DatabaseInvoice.getLastId()+1, jobs,
                    DatabaseJobseekerPostgre.getJobseeker(jobseekerId), adminFee);
            DatabaseInvoice.addInvoice(bp);
            return bp;
//        } catch (JobSeekerNotFoundException e){
//            System.out.println(e.getMessage());
        } catch (JobNotFoundException e){
            System.out.println(e.getMessage());
        } catch (OngoingInvoiceAlreadyExistsException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    /**
     * method membuat invoice baru menggunakan ewallet
     * @param jobIdList pekerjaan yang di apply
     * @param jobseekerId pelamar
     * @param referralCode kode bonus yang digunakan
     * @return invoice yang baru dibuat
     */
    @RequestMapping(value = "/createEWalletPayment", method = RequestMethod.POST)
    public Invoice addEwalletPayment(@RequestParam(value = "jobIdList") ArrayList<Integer> jobIdList,
                                  @RequestParam(value = "jobseekerId") int jobseekerId,
                                  @RequestParam(value = "referralCode") String referralCode)
    {
        try{
            ArrayList<Job> jobs = new ArrayList<Job>();
            int jobId = jobIdList.get(0);
            Job job = DatabaseJob.getJobById(jobId);
            jobs.add(job);
//            for (Integer id : jobIdList){
//                Job job = DatabaseJob.getJobById(id);
//                jobs.add(job);
//            }
//            Jobseeker jobseeker = DatabaseJobseeker.getJobseekerById(jobseekerId);
            EwalletPayment ep = new EwalletPayment(DatabaseInvoice.getLastId()+1, jobs,
                    DatabaseJobseekerPostgre.getJobseeker(jobseekerId), DatabaseBonus.getBonusByReferralCode(referralCode));
            DatabaseInvoice.addInvoice(ep);
            return ep;
//        } catch (JobSeekerNotFoundException e){
//            System.out.println(e.getMessage());
        } catch (JobNotFoundException e){
            System.out.println(e.getMessage());
        } catch (OngoingInvoiceAlreadyExistsException e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
