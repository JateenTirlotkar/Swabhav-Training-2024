package com.day6;

import java.util.Scanner;

public class Search {
    public static void searchElement(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean found = false;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("Element " + target + " found at position: (" + i + ", " + j + ")");
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        
        if (!found) {
            System.out.println("Element " + target + " not found in the matrix.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows (m) in the matrix: ");
        int m = scanner.nextInt();
        System.out.print("Enter number of columns (n) in the matrix: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[m][n];

        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        searchElement(matrix, target);

        scanner.close();
    }
}

