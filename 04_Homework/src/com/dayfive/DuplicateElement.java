package com.dayfive;
import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        
        int[] array = new int[n];

        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        
        Arrays.sort(array);

        
        int duplicateCount = 0;
        for (int i = 1; i < n; i++) {
            if (array[i] == array[i - 1]) {
                duplicateCount++;
                // Skip over all duplicates of the current element
                while (i < n && array[i] == array[i - 1]) {
                    i++;
                }
            }
        }

        
        System.out.println("The number of duplicate elements in the array is: " + duplicateCount);
    }
}
