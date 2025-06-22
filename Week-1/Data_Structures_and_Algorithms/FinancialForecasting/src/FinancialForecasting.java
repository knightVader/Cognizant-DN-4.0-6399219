/**
 * FinancialForecasting.java
 * Demonstrates recursive financial forecasting based on past growth rates.
 */
public class FinancialForecasting {
    /**
     * Recursively calculates the future value based on initial value, growth rate, and periods.
     * @param initialValue The starting value (e.g., current revenue).
     * @param growthRate The growth rate per period (e.g., 0.05 for 5%).
     * @param periods The number of periods to forecast.
     * @return The forecasted value after the given periods.
     */
    public static double forecastRecursive(double initialValue, double growthRate, int periods) {
        if (periods == 0) {
            return initialValue;
        }
        return forecastRecursive(initialValue * (1 + growthRate), growthRate, periods - 1);
    }

    /**
     * Optimized version using iteration to avoid stack overflow for large periods.
     */
    public static double forecastIterative(double initialValue, double growthRate, int periods) {
        double result = initialValue;
        for (int i = 0; i < periods; i++) {
            result *= (1 + growthRate);
        }
        return result;
    }

    public static void main(String[] args) {
        double initialValue = 10000; // Example: $10,000
        double growthRate = 0.07;    // Example: 7% annual growth
        int periods = 5;             // Forecast for 5 years

        double recursiveResult = forecastRecursive(initialValue, growthRate, periods);
        double iterativeResult = forecastIterative(initialValue, growthRate, periods);

        System.out.printf("Recursive Forecast after %d periods: %.2f\n", periods, recursiveResult);
        System.out.printf("Iterative Forecast after %d periods: %.2f\n", periods, iterativeResult);
    }
}
