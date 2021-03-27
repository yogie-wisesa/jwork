public enum InvoiceStatus {
    Ongoing("On Going"),
    Finished("Finished"),
    Cancelled("Cancelled");

    public String status;

    InvoiceStatus(String status)
    {
        this.status = status;
    }

    /**
     * 
     */
    public String toString()
    {
        return status;
    }
}
