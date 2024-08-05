package com.test;

import java.util.Scanner;
import com.model.Book;

public class BookTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many books you want: ");
        int input = sc.nextInt();

        Book[] books = new Book[input];

        for (int i = 0; i < books.length; i++) {
            System.out.println("Enter Book Id ");
            int bookId = sc.nextInt();
            System.out.println("Enter Book Name ");
            String name = sc.next();
            System.out.println("Enter Book Author Name ");
            String author = sc.next();
            System.out.println("Enter Book Price ");
            double price = sc.nextDouble();
            System.out.println("Enter Book Publication ");
            String publication = sc.next();

            books[i] = new Book(bookId, name, author, price, publication);
        }

        // Sorting books in descending order of price
        for (int i = 0; i < books.length - 1; i++) {
            for (int j = 0; j < books.length - i - 1; j++) {
                if (books[j].getPrice() < books[j + 1].getPrice()) {
                    // Swap books[j] and books[j + 1]
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }

        System.out.println("\nBooks in descending order of price:");
        for (Book book : books) {
            System.out.println("Book ID: " + book.getBookId());
            System.out.println("Book Name: " + book.getName());
            System.out.println("Book Author Name: " + book.getAuthor());
            System.out.println("Book Price: " + book.getPrice());
            System.out.println("Book Publication: " + book.getPublication());
            System.out.println();
        }

        sc.close();
    }
}
