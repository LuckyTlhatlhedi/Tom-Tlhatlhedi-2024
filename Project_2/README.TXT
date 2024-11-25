# Weighted Average Signal Processor

## Description
This Java program calculates a **weighted average** for a sequence of signal values. The weights and the number of signals to process are configurable, making it ideal for applications requiring a smoothed or weighted representation of data streams.

The program consists of two classes:
- **`WeightedAverage`**: This class handles the logic of managing the signal queue and computing the weighted average in real time.
- **`Main`**: The entry point of the program, where the signal values are processed, and the weighted average is calculated and displayed.

## Features
- **Custom Weights**: Accepts a user-defined array of weights to customize the averaging process.
- **Signal Queue**: Maintains a rolling queue of the most recent signal values for calculation.
- **Real-Time Processing**: Processes new signal values dynamically and updates the weighted average.

## How to Compile and Run

### Prerequisites
- Ensure [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) is installed.
- Verify `javac` and `java` commands are available in your PATH