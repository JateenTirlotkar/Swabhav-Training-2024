package com.daythree;

import java.util.Scanner;

public class Ridebill_calculator {
    public static void main(String[] args) {
        System.out.println("What is your height ");
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int age = 0;
        String photo = null;
        int total_bill = 0;

        if (height > 120) {
            System.out.println("You can ride");
            System.out.println("What is your age ");
            age = sc.nextInt();
            System.out.println("Do you want photos: ");
            photo = sc.next();

            if (photo.equals("no")) {
                if (age < 12) {
                    System.out.println("Total bill: $5");
                } else if (age >= 12 && age < 19) {
                    System.out.println("Total bill: $7");
                } else if (age >= 19 && age < 45) {
                    System.out.println("Total bill: $12");
                } else if (age >= 45 && age < 56) {
                    System.out.println("Total bill: $0");
                }
            } else if (photo.equals("yes")) {
                if (age >= 12 && age < 19) {
                    System.out.println("Total bill: $11");
                } else if (age >= 19 && age < 45) {
                    System.out.println("Total bill: $15");
                } else if (age >= 45 && age < 56) {
                    System.out.println("Total bill: $3");
                }
                System.out.println("Photos cost added");
            } else {
                System.out.println("Invalid input for photo preference");
            }

        } else {
            System.out.println("Can't ride");
        }

        sc.close();
    }
}
