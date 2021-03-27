/**
 * 
 *
 * @author (Yogie Wisesa)
 * @version (27.03.2021)
 */
public enum PaymentType {
    BankPayment("Bank Payment"),
    EWalletPayment("E-Wallet Payment");

    private String paymentType;

    /**
     * 
     * @param paymentType
     */
    PaymentType(String paymentType)
    {
        this.paymentType = paymentType;
    }

    /**
     * 
     */
    public String toString()
    {
        return paymentType;
    }
}
