package com.day6;

import java.util.Scanner;
import java.util.Arrays;

public class ProductOfArray {
    public static int[] productArray(int[] nums) {
        int n = nums.length;
        int[] prod = new int[n];

        // Compute the total product of all elements
        long totalProduct = 1;
        for (int num : nums) {
            totalProduct *= num;
        }

        // Compute the product array where each element is totalProduct divided by the current element
        for (int i = 0; i < n; i++) {
            prod[i] = (int) (totalProduct / nums[i]);
        }

        return prod;
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

        int[] productArray = productArray(nums);
        System.out.println("The product array is: " + Arrays.toString(productArray));
    }
}
