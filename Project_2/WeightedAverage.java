import java.util.*;

public class WeightedAverage {
    
    private double[] weights;  // Stores the weights
    private Queue<Double> signalQueue;  // To store the signal values
    private int n;  // Number of signal entries to process

    // Constructor to initialize the weights and signal queue
    public WeightedAverage(double[] weights) {
        this.weights = weights;
        this.n = weights.length;  // Number of weights
        this.signalQueue = new LinkedList<>();  // Queue to store the latest signal values
    }

    // Method to process the new signal and calculate the weighted average
    public double process(double x) {
        // Add the new signal value to the queue
        if (signalQueue.size() == n) {
            signalQueue.poll();  // Remove the oldest signal if queue is full
        }
        signalQueue.offer(x);  // Add the current signal

        // Calculate the weighted sum using the current signal values and the weights
        double weightedSum = 0;
        int index = 0;
        for (double value : signalQueue) {
            weightedSum += value * weights[index++];
        }

        // Return the weighted average
        return weightedSum / n;
    }
}
