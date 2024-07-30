public class Forecasting {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double initialAmount, double growthRate, int years) {
        // Base case: if no years left, return the initial amount
        if (years <= 0) {
            return initialAmount;
        }
        // Recursive case: calculate future value for one year less
        double futureValue = calculateFutureValue(initialAmount, growthRate, years - 1);
        // Apply growth rate
        return futureValue * (1 + growthRate);
    }

    public static void main(String[] args) {
        double initialAmount = 1000.0; // Initial investment
        double growthRate = 0.05; // 5% annual growth rate
        int years = 10; // Number of years to forecast

        double futureValue = calculateFutureValue(initialAmount, growthRate, years);
        System.out.printf("Future value after %d years: $%.2f%n", years, futureValue);
    }
}
