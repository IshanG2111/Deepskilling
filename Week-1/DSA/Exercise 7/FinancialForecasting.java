import java.util.Arrays;

public class FinancialForecasting {

    public static double forecastRecursive(double currentValue, double[] growthRates, int yearIndex) {
        if (yearIndex == growthRates.length) {
            return currentValue;
        }
        double nextValue = currentValue * (1 + growthRates[yearIndex]);
        return forecastRecursive(nextValue, growthRates, yearIndex + 1);
    }

    public static double forecastRecursiveMemoized(double initialValue, double[] growthRates, int years, double[] memo) {
        if (years == 0) {
            return initialValue;
        }
        if (memo[years] != -1) {
            return memo[years];
        }

        double previous = forecastRecursiveMemoized(initialValue, growthRates, years - 1, memo);
        memo[years] = previous * (1 + growthRates[years - 1]);
        return memo[years];
    }

    public static void main(String[] args) {
        double initialValue = 10000;
        double[] growthRates = {0.10, 0.08, 0.12, 0.07, 0.09};

        double forecast = forecastRecursive(initialValue, growthRates, 0);
        System.out.println("Recursive forecast value: " + forecast);

        double[] memo = new double[growthRates.length + 1];
        Arrays.fill(memo, -1);
        double optimizedForecast = forecastRecursiveMemoized(initialValue, growthRates, growthRates.length, memo);
        System.out.println("Optimized (memoized) forecast value: " + optimizedForecast);

        System.out.println("\nRecursion concept:");
        System.out.println("A function calls itself with a smaller subproblem until reaching a base case.");

        System.out.println("\nTime complexity:");
        System.out.println("Recursive approach here: O(n), where n is number of years/growth rates.");
        System.out.println("Memoized approach: O(n) for one full forecast, useful to avoid recomputation across repeated subproblems.");
    }
}
