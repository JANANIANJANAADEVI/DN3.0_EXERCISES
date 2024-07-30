public class PayPalAdapter implements PaymentProcessor {
    private PayPalPaymentGateway payPalGateway;

    public PayPalAdapter() {
        this.payPalGateway = new PayPalPaymentGateway();
    }

    @Override
    public void processPayment(double amount) {
        payPalGateway.makePayment(amount);
    }
}
