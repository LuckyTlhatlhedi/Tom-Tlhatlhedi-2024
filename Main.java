import java.util.*;

public class Main {

    public static void main(String[] args) {
        String text = "Kagiso Naledi Kagiso Thato Naledi Kagiso Keabetswe Thato Naledi Kagiso Thato Thato Kagiso";

        WordFrequencyTracker tracker = new WordFrequencyTracker();

        
        for (String word : text.split(" ")) {
            tracker.processWord(word);
        }

        
        System.out.println("Top words:");
        for (Map.Entry<String, Integer> entry : tracker.getTopWordsWithFrequencies()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}



