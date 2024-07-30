public class StripeAdapter implements PaymentProcessor {
    private StripePaymentGateway stripeGateway;

    public StripeAdapter() {
        this.stripeGateway = new StripePaymentGateway();
    }

    @Override
    public void processPayment(double amount) {
        stripeGateway.charge(amount);
    }
}

