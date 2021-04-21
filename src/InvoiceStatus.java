public enum InvoiceStatus {
    Ongoing("On Going"),
    Finished("Finished"),
    Cancelled("Cancelled");

    public String invoiceStatus;

    InvoiceStatus(String invoiceStatus)
    {
        this.invoiceStatus = invoiceStatus;
    }

    /**
     * 
     */
    public String toString()
    {
        return invoiceStatus;
    }
}
