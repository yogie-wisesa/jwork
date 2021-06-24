/**
 * @author Yogie Wisesa
 * @version 24/6/21
 * 
 * class database invoice
 * untuk menyimpan seluruh invoice pada arraylist
 */
package yogiewisesa.jwork;
import java.util.ArrayList;

public class DatabaseInvoice {

    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static ArrayList<Invoice> invByJobseeker = new ArrayList<Invoice>();
    private static int lastId = 0;

    /**
     * method getter invoice database
     * @return seluruh database invoice
     */
    public static ArrayList<Invoice> getInvoiceDatabase(){
        return INVOICE_DATABASE;
    }

    /**
     * method getter id invoice terakhir
     * @return id invoice terakhir
     */
    public static int getLastId() {
        return lastId;
    }

    /**
     * method getter invoice menggunakan id
     * @param id
     * @return invoice dengan id tersebut
     * @throws InvoiceNotFoundException jika tidak ditemukan
     */
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

    /**
     * method getter invoice menggunakan jobseeker
     * @param id 
     * @return invoice dengan jobseeker tersebut
     */
    public static ArrayList<Invoice> getInvoicebyJobseeker(int id){
        for (int i = 0; i < INVOICE_DATABASE.size(); i++) {
            if (INVOICE_DATABASE.get(i).getJobseeker().getId() == id) {
                invByJobseeker.add(INVOICE_DATABASE.get(i));
            }
        }
        return invByJobseeker;
    }

    /**
     * method untuk menambahkan invoice baru
     * @param invoice
     * @return true jika berhasil ditambah
     * @throws OngoingInvoiceAlreadyExistsException jika sudah ada invoice yang berstatus ongoing
     */
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

    /**
     * method untuk mengganti status invoice
     * @param id
     * @param invoiceStatus status antara finsihed atau cancelled
     * @return true jika berhasil diganti
     */
    public static boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus){
        for (Invoice inv : INVOICE_DATABASE) {
            if(inv.getId() == id && inv.getInvoiceStatus().equals(InvoiceStatus.Ongoing)) {
                inv.setInvoiceStatus(invoiceStatus);
                return true;
            }
        }
        return false;
    }

    /**
     * method untuk menghapus invoice
     * @param id untuk mencari invoice
     * @return true jika berhasil dihapus
     * @throws InvoiceNotFoundException jika invoice tidak ditemukan
     */
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
