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

    public static Invoice getInvoicebyId(int id){
        for (int i = 0; i < INVOICE_DATABASE.size(); i++) {
            if (INVOICE_DATABASE.get(i).getId() == id) {
                return INVOICE_DATABASE.get(i);
            }
        }
        return null;
    }

    public static ArrayList<Invoice> getInvoicebyJobseeker(int id){
        for (int i = 0; i < INVOICE_DATABASE.size(); i++) {
            if (INVOICE_DATABASE.get(i).getJobseeker().getId() == id) {
                invByJobseeker.add(INVOICE_DATABASE.get(i));
            }
        }
        return invByJobseeker;
    }

    public static boolean addInvoice(Invoice invoice){

        for (Invoice inv : INVOICE_DATABASE) {
            if (invoice.getInvoiceStatus() == InvoiceStatus.Ongoing) {
                return false;
            }
        }

        INVOICE_DATABASE.add(invoice);
        lastId = invoice.getId();
        return true;
    }

    public static boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus){
        for (int i=0; i < INVOICE_DATABASE.size(); i++) {
            if(INVOICE_DATABASE.get(i).getId() == id && Invoice.getInvoiceStatus().equals(InvoiceStatus.Ongoing)) {
                Invoice.setInvoiceStatus(invoiceStatus);
                return true;
            }
        }
        return false;
    }

    public static boolean removeInvoice(int id){
        for (int i=0; i < INVOICE_DATABASE.size(); i++) {
            if(INVOICE_DATABASE.get(i).getId() == id) {
                INVOICE_DATABASE.remove(i);
                return true;
            }
        }
        return false;
    }
}
