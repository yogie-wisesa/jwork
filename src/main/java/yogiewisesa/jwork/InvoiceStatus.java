/**
 * @author Yogie Wisesa
 * @version 24/6/21
 * 
 * enum invoice status 
 */
package yogiewisesa.jwork;
public enum InvoiceStatus {
    
    /**
     * inisiasi enum status invoice
     */
    Ongoing("On Going"),
    Finished("Finished"),
    Cancelled("Cancelled");

    public String invoiceStatus;

    /**
     * constructor enum
     * @param invoiceStatus
     */
    InvoiceStatus(String invoiceStatus)
    {
        this.invoiceStatus = invoiceStatus;
    }

    /**
     * method untuk mencetak status invoice
     */
    public String toString()
    {
        return invoiceStatus;
    }
}
