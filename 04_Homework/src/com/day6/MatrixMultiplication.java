package com.day6;

import java.util.Scanner;

public class MatrixMultiplication {
    public static int[][] multiplyMatrices(int[][] mat1, int[][] mat2) {
        int m1 = mat1.length;
        int n1 = mat1[0].length;
        int n2 = mat2[0].length;

        int[][] result = new int[m1][n2];

        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                for (int k = 0; k < n1; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows for matrix 1: ");
        int m1 = scanner.nextInt();
        System.out.print("Enter number of columns for matrix 1: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter number of columns for matrix 2: ");
        int n2 = scanner.nextInt();

        int[][] mat1 = new int[m1][n1];
        System.out.println("Enter elements for matrix 1:");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                mat1[i][j] = scanner.nextInt();
            }
        }

        int[][] mat2 = new int[n1][n2];
        System.out.println("Enter elements for matrix 2:");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                mat2[i][j] = scanner.nextInt();
            }
        }

        int[][] result = multiplyMatrices(mat1, mat2);

        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

