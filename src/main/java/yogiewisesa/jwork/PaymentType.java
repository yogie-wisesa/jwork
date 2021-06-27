package yogiewisesa.jwork;
/**
 * 
 *
 * @author (Yogie Wisesa)
 * @version (27.03.2021)
 * 
 * enum payment type dari invoice
 */
public enum PaymentType {

    // inisiasi enum
    BankPayment("Bank Payment"),
    EwalletPayment("E-Wallet Payment");

    private String paymentType;

    /**
     * constructor enum
     * @param paymentType
     */
    PaymentType(String paymentType)
    {
        this.paymentType = paymentType;
    }

    /**
     * method untuk mencetak payment type
     */
    public String toString()
    {
        return paymentType;
    }
}
