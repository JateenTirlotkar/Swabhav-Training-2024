package com.day6;

import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows in the 2D array: ");
        int m = scanner.nextInt();
        System.out.print("Enter the number of columns in the 2D array: ");
        int n = scanner.nextInt();

        int matrix [][] = new int[m][n];

        System.out.println("Enter the elements of the " + m + " x " + n + " 2D array:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum = sum + matrix[i][j];
            }
        }

        System.out.println("Sum of all elements in the 2D array: " + sum);
    }
}
