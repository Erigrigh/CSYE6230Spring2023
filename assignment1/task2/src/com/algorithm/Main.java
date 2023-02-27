package com.algorithm;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Create an array of 1000 integers
        int[] arr = new int[1000];
        Random rand = new Random();

        // Fill the array with random integers between 1 and 100
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100) + 1;
        }

        // Multiply each value in the array with a random value between 0.1 and 0.9
        double[] arrMultiplied = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrMultiplied[i] = arr[i] * (rand.nextDouble() * 0.8 + 0.1);
        }

        // Calculate the sum of the array in parallel
        long startTime = System.currentTimeMillis();
        double sumParallel = calculateSumParallel(arrMultiplied);
        long endTime = System.currentTimeMillis();

        System.out.println("Parallel sum: " + sumParallel);
        System.out.println("Time taken (parallel): " + (endTime - startTime) + " ms");

        // Calculate the sum of the array in serial
        startTime = System.currentTimeMillis();
        double sumSerial = calculateSumSerial(arrMultiplied);
        endTime = System.currentTimeMillis();

        System.out.println("Serial sum: " + sumSerial);
        System.out.println("Time taken (serial): " + (endTime - startTime) + " ms");
    }

    public static double calculateSumParallel(double[] arr) {
        return java.util.Arrays.stream(arr).parallel().sum();
    }

    public static double calculateSumSerial(double[] arr) {
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
