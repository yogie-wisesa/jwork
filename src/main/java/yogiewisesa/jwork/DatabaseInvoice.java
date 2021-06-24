package yogiewisesa.jwork;
import java.util.ArrayList;

public class DatabaseInvoice {

    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static ArrayList<Invoice> invByJobseeker = new ArrayList<Invoice>();
    private static int lastId = 0;

    public static ArrayList<Invoice> getInvoiceDatabase(){
        return INVOICE_DATABASE;
    }

    public static int getLastId() {
        return lastId;
    }

    public static Invoice getInvoicebyId(int id) throws InvoiceNotFoundException{
        Invoice dummy = null;
        for (Invoice invoice : INVOICE_DATABASE) {
            if (invoice.getId() == id) {
                dummy = invoice;
                return dummy;
            }
        }
        throw new InvoiceNotFoundException(id);
    }

    public static ArrayList<Invoice> getInvoicebyJobseeker(int id){
        for (int i = 0; i < INVOICE_DATABASE.size(); i++) {
            if (INVOICE_DATABASE.get(i).getJobseeker().getId() == id) {
                invByJobseeker.add(INVOICE_DATABASE.get(i));
            }
        }
        return invByJobseeker;
    }

    public static boolean addInvoice(Invoice invoice) throws OngoingInvoiceAlreadyExistsException{

        for (Invoice i : INVOICE_DATABASE)

            if (i.getId() == invoice.getId()) {
                throw new OngoingInvoiceAlreadyExistsException(invoice);
            }
        invoice.setInvoiceStatus(InvoiceStatus.Ongoing);
        invoice.setTotalFee();
        INVOICE_DATABASE.add(invoice);
        lastId = invoice.getId();
        return true;
    }

    public static boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus){
        for (Invoice inv : INVOICE_DATABASE) {
            if(inv.getId() == id && inv.getInvoiceStatus().equals(InvoiceStatus.Ongoing)) {
                inv.setInvoiceStatus(invoiceStatus);
                return true;
            }
        }
        return false;
    }

    public static boolean removeInvoice(int id) throws InvoiceNotFoundException{
        for (Invoice invoice : INVOICE_DATABASE)
        {
            if (invoice.getId() == id)
            {
                INVOICE_DATABASE.remove(invoice);
                return true;
            }
        }
        throw new InvoiceNotFoundException(id);
    }
}
