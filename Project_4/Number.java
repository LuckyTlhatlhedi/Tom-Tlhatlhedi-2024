public class Number {

    // Method to reverse the digits of the number
    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num > 0) {
            int digit = num % 10; // Extract the last digit
            reversed = reversed * 10 + digit; // Append digit to reversed number
            num = num / 10; // Remove the last digit
        }
        return reversed;
    }

    // Method to calculate the sum of the digits of the number
    public static int sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10; // Add the last digit to the sum
            num = num / 10; // Remove the last digit
        }
        return sum;
    }

    // Method to generate a new number by adding one to each digit
    public static int incrementDigits(int num) {
        int newNumber = 0;
        int place = 1; // To keep track of the place (ones, tens, etc.)
        while (num > 0) {
            int digit = num % 10; // Extract the last digit
            digit = (digit + 1) % 10; // Add one to the digit (and wrap around if it exceeds 9)
            newNumber = digit * place + newNumber; // Add the incremented digit to the new number
            num = num / 10; // Remove the last digit
            place *= 10; // Move to the next place value
        }
        return newNumber;
    }
}

    
