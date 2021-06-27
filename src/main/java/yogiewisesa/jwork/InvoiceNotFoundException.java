/**
 * @author Yogie Wisesa
 * @version 24/6/21
 * 
 * class exception invoice not found
 * untuk menghandle error ketika invoice tidak ditemukan
 */
package yogiewisesa.jwork;
public class InvoiceNotFoundException extends Exception{
    private int invoice_error;

    /**
     * constructor exception invoice not found
     * @param invoice_input error
     */
    public InvoiceNotFoundException(int invoice_input){
        super("Invoice ID: ");
        invoice_error = invoice_input;
    }

    /**
     * method getMessage untuk mencetak pesan error
     */
    public String getMessage(){
        return super.getMessage() + invoice_error + " not found.";
    }
}
