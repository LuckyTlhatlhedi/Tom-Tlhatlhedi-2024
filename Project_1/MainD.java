
public class MainD {

    public static void main(String[] args) {
        // Example weights
        double[] weights = {5, 4, 3, 2, 1};
        
        // Create the WeightedAverage object
        WeightedAverage wa = new WeightedAverage(weights);

        
        double[] signal = {1, 2, 3, 4, 5};

        // Process each signal value and compute the weighted average
        for (double s : signal) {
            double result = wa.process(s);
            System.out.println("Processed signal: " + s + ", Weighted Average: " + result);
        }
    }
}
