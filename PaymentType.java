public enum PaymentType {
    BankPayment("Bank Payment"),
    EWalletPayment("E-Wallet Payment");

    private String paymentType;

    PaymentType(String paymentType)
    {
        this.paymentType = paymentType;
    }

    public String toString()
    {
        return paymentType;
    }
}
