
public class Main {

    public static void main(String[] args) {
        int number = 12391; // Example input number

        // Reversing the number using NumberMachine class
        int reversed = Number.reverseNumber(number);
        System.out.println("Reversed number: " + reversed);

        // Calculating the sum of digits using NumberMachine class
        int sum = Number.sumDigits(number);
        System.out.println("Sum of digits: " + sum);

        // Generating a new number by adding one to each digit using NumberMachine class
        int incremented = Number.incrementDigits(number);
        System.out.println("New number (after adding one to each digit): " + incremented);
    }
}

