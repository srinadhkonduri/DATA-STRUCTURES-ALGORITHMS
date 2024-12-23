package com.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MergeIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input the intervals
        System.out.print("Enter the number of intervals: ");
        int n = sc.nextInt();

        int[][] intervals = new int[n][2];
        System.out.println("Enter the intervals (start and end):");
        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt(); // Start time
            intervals[i][1] = sc.nextInt(); // End time
        }

        // Step 2: Merge the intervals
        int[][] mergedIntervals = merge(intervals);

        // Step 3: Print the result
        System.out.println("Merged Intervals:");
        for (int[] interval : mergedIntervals) {
            System.out.println(Arrays.toString(interval));
        }
    }

    /**
     * Merges overlapping intervals.
     *
     * @param intervals The array of intervals
     * @return A new array of merged intervals
     */
    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals; // No merging needed for 0 or 1 interval
        }

        // Step 1: Sort the intervals by their start times
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Step 2: Use a list to store the merged intervals
        List<int[]> merged = new ArrayList<>();

        // Step 3: Initialize the first interval
        int[] currentInterval = intervals[0];
        merged.add(currentInterval);

        // Step 4: Iterate through the intervals and merge
        for (int[] interval : intervals) {
            int currentStart = currentInterval[0];
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            if (currentEnd >= nextStart) {
                // Overlapping intervals: merge them by updating the end time
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                // No overlap: add the new interval to the list
                currentInterval = interval;
                merged.add(currentInterval);
            }
        }

        // Step 5: Convert the list back to an array
        return merged.toArray(new int[merged.size()][]);
    }
}

