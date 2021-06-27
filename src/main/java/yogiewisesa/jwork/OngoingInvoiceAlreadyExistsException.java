/**
 * @author Yogie Wisesa
 * @version 26/6/21
 * 
 * class exception invoice already exists
 * untuk menghandle error ketika invoice sudah ada yang berstatus ongoing
 */
package yogiewisesa.jwork;
public class OngoingInvoiceAlreadyExistsException extends Exception{
    private Invoice invoice_error;

    /**
     * constructor exception
     * @param invoice_input
     */
    public OngoingInvoiceAlreadyExistsException(Invoice invoice_input){
        super("Ongoing Invoice: ");
        invoice_error = invoice_input;
    }

    /**
     * method untuk mencetak pesan error
     */
    public String getMessage(){
        return super.getMessage() + invoice_error.getId() + " already exists.";

    }
}
