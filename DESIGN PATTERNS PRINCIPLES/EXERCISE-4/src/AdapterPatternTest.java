public class AdapterPatternTest {
    public static void main(String[] args) {
        PaymentProcessor payPalProcessor = new PayPalAdapter();
        PaymentProcessor stripeProcessor = new StripeAdapter();

        // Process payments using different gateways
        payPalProcessor.processPayment(150.00);
        stripeProcessor.processPayment(250.00);
    }
}
