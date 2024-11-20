package com.Patterns;

public class StarPattern {
    public static void main(String[] args) {
        int rows = 7; // Total rows in the pattern
        int cols = 13; // Total columns in the pattern

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                // Print '*' for specific conditions based on row and column
                if ((i == 1 && (j == 1 || j == 5 || j == 9 || j == 13)) || // First row stars
                        (i == 2 && (j == 5 || j == 9)) ||                      // Second row stars
                        (i == 3 && (j == 7)) ||                                // Third row stars
                        (i == 4 && (j == 7)) ||                                // Fourth row stars
                        (i == 5 && (j >= 5 && j <= 9)) ||                      // Fifth row stars
                        (i == 6 && (j >= 3 && j <= 11)) ||                     // Sixth row stars
                        (i == 7)) {                                            // Seventh row stars
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print spaces
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

