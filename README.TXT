# Word Frequency Tracker

## Description
This Java program is designed to track and display the most frequent words in a given text. The program consists of two main classes:

1. **`WordFrequencyTracker`**: This class is responsible for tracking the frequency of each word and determining the top N most frequent words.
2. **`MainD`**: The entry point of the program, where the input text is processed and the results are displayed.

### WordFrequencyTracker Class
- **Purpose**: Manages a map of words and their corresponding frequencies. It also allows users to retrieve the top N most frequent words.
- **Features**:
  - Tracks words in a case-insensitive manner (converts all words to lowercase).
  - Returns the top N most frequent words.
  - Updates the word count for each word encountered.

### Main Class
- **Purpose**: Serves as the entry point for the program where the input string is processed, and the `WordFrequencyTracker` class is used to count word frequencies.
- **How it works**:
  - It takes a predefined text, splits it into words, and passes each word to the `WordFrequencyTracker` to track the frequencies.
  - After processing the text, it outputs the top N most frequent words.

## Features
- **Word Frequency Count**: Tracks how many times each word appears in the text.
- **Top N Words**: Returns the top N most frequent words based on user-defined settings.
- **Case Insensitive**: Handles case insensitivity by converting all words to lowercase before processing.

## How to Compile and Run

### Prerequisites
- Ensure [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) is installed.
- Verify that `javac` and `java` commands are available in your PATH.
