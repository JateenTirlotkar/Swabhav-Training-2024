package com.day6;
import java.util.Scanner;

public class EvenNumberCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        
        int array[] = new int[n];

        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

       
        int evenCount = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            }
        }

        
        System.out.println("The number of even numbers in the array is: " + evenCount);
    }
}
