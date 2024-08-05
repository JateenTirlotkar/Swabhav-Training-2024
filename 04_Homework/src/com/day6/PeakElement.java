package com.day6;

import java.util.Scanner;

public class PeakElement {
    public static int findPeakElement(int[] nums) {
        int n = nums.length;

        if (n == 0) return Integer.MIN_VALUE; 

        for (int i = 0; i < n; i++) {
            if ((i == 0 || nums[i] >= nums[i - 1]) && (i == n - 1 || nums[i] >= nums[i + 1])) {
                return nums[i];
            }
        }

        return Integer.MIN_VALUE; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int peak = findPeakElement(nums);
        if (peak != Integer.MIN_VALUE) {
            System.out.println("The peak element in the array is: " + peak);
        } else {
            System.out.println("No peak element found in the array.");
        }
    }
}

