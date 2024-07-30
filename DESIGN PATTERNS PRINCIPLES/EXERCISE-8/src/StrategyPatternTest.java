public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Using Credit Card Payment
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456", "John Doe");
        context.setPaymentStrategy(creditCardPayment);
        context.executePayment(250.00);

        // Using PayPal Payment
        PaymentStrategy payPalPayment = new PayPalPayment("john.doe@example.com");
        context.setPaymentStrategy(payPalPayment);
        context.executePayment(150.00);
    }
}
