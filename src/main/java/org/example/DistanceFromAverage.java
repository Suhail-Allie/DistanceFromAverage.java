package org.example;
import java.util.Scanner;

    public class DistanceFromAverage {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            double[] numbers = new double[15];
            int count = 0;
            double sum = 0;
            double average;
            final double QUIT = 99999;

            // Allow the user to enter up to 15 double values
            System.out.println("Enter up to 15 double values (enter 99999 to quit):");

            // Loop to get input from the user
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Enter a number: ");
                double num = input.nextDouble();

                if (num == QUIT) {
                    break; // User wants to quit
                }

                numbers[count] = num; // Store the number in the array
                sum += num; // Add to the sum
                count++; // Increase count of numbers entered
            }

            // Check if any numbers were entered
            if (count == 0) {
                System.out.println("Error: No numbers entered.");
            } else {
                // Calculate the average
                average = sum / count;

                // Display the results
                System.out.println("\nTotal numbers entered: " + count);
                System.out.println("Average: " + average);
                System.out.println("\nNumber | Distance from Average");

                // Loop to display each number and its distance from the average
                for (int i = 0; i < count; i++) {
                    double distance = Math.abs(numbers[i] - average);
                    System.out.println(numbers[i] + " | " + distance);
                }
            }
            input.close();
        }
    }


