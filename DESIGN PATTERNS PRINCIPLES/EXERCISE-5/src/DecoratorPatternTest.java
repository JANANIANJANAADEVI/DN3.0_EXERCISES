public class DecoratorPatternTest {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();

        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        // Send a message using multiple decorators
        slackNotifier.send("Hello, world!");
    }
}
