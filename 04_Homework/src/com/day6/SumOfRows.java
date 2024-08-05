package com.day6;
import java.util.Scanner;
public class SumOfRows {
	

	  

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

	        System.out.println("Sum of each row in the matrix:");
	        sumOfRows(matrix);

	        scanner.close();
	    }
	    
	    
	    public static void sumOfRows(int[][] matrix) {
	        int m = matrix.length;
	        int n = matrix[0].length;

	        for (int i = 0; i < m; i++) {
	            int rowSum = 0;
	            for (int j = 0; j < n; j++) {
	                rowSum += matrix[i][j];
	            }
	            System.out.println("Sum of elements in row " + i + ": " + rowSum);
	        }
	    }
	}



