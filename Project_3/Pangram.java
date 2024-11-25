
import java.util.HashSet;

public class Pangram{

    // Method to check if a string is a pangram
    public static boolean isPangram(String str) {
        // Convert string to lowercase to handle case insensitivity
        str = str.toLowerCase().replace(" ", "");
        
        // Create a set to store unique letters
        HashSet<Character> letters = new HashSet<>();

        // Loop through each character of the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            // Only add alphabetic characters to the set
            if (c >= 'a' && c <= 'z') {
                letters.add(c);
            }
        }

        // Check if the set contains all 26 letters
        return letters.size() == 26;
    }
}