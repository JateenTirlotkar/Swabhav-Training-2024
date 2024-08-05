package com.day6;

import java.util.Scanner;

public class CharacterShift {
    public static String shiftString(String str, int n) {
        int len = str.length();
        if (len == 0 || n == 0) {
            return str;
        }

        // Normalize n to be within the range of string length
        n = n % len;

        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < len; i++) {
            int newIndex = (i + n) % len;
            if (newIndex < 0) {
                newIndex += len;
            }
            sb.append(chars[newIndex]);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = scanner.nextLine();

        System.out.print("Enter the shift (n): ");
        int n = scanner.nextInt();

        String shiftedString = shiftString(str, n);
        System.out.println("Shifted string: " + shiftedString);
    }
}

