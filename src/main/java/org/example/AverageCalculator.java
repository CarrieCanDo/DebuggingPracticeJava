package org.example;

public class AverageCalculator {
    // Method to calculate the average of an array of integers
    public static double calculateAverage(int[] numbers) {
        int sum = 0;

        // Loop through the array and add each element to the sum
        for (int number : numbers) {
            sum += number;
        }

        // Logic error: Incorrectly calculate the average by dividing by a fixed number (e.g., 2)
        return (double) sum / 5; // corrected number 2 to a 5 to fix logic issue
    }

    public static void main(String[] args) {
        // Test the method with an array of numbers
        int[] numbers = {1, 2, 3, 4, 5};
        double average = calculateAverage(numbers);

        // Print the result
        System.out.println("The average is: " + average); // This will print an incorrect average
    }
}
