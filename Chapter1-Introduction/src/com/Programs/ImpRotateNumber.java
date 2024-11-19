package com.Programs;

import java.util.Scanner;

public class ImpRotateNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number and the number of rotations
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the number of rotations: ");
        int rotations = scanner.nextInt();

        // Convert the number to a string to manipulate digits
        String numberStr = Integer.toString(number);
        int length = numberStr.length();

        // Ensure rotations are within bounds
        rotations = rotations % length;

        // Rotate the number
        String rotatedPart = numberStr.substring(length - rotations); // Digits to move to the front
        String remainingPart = numberStr.substring(0, length - rotations); // Remaining digits
        String rotatedNumberStr = rotatedPart + remainingPart;

        // Convert back to integer
        int rotatedNumber = Integer.parseInt(rotatedNumberStr);

        // Display the result
        System.out.println("Rotated number: " + rotatedNumber);

        scanner.close();
    }
}
