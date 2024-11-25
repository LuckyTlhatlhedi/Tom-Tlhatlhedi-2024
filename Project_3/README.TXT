# Pangram Checker

## Description
This Java program checks if a given string is a **pangram**. A pangram is a sentence that contains every letter of the English alphabet at least once. For example, "The quick brown fox jumps over the lazy dog" is a pangram.

The program uses a `HashSet` to track unique letters in the input string, ensuring efficient and accurate validation.

The program consists of two main classes:
- **`Pangram`**: Contains the method `isPangram()` that checks if a given string is a pangram.
- **`Main`**: The class with the `main()` method where the program starts and demonstrates how to use the `Pangram` class.

## Features
- Handles **case insensitivity** by converting the input string to lowercase.
- **Ignores spaces and non-alphabetic characters** in the input.
- Efficiently checks for **all 26 letters** of the English alphabet.

## How to Compile and Run

### Prerequisites
- Ensure [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) is installed.
- Verify `javac` and `java` commands are available in your PATH.

