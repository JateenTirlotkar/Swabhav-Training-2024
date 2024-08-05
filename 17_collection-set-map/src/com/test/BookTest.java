package com.test;
import java.util.*;

import com.model.Book;
import com.model.BookComparator;
import com.model.BookComparator.BookAuthorComparator;
import com.model.BookComparator.BookTitleComparator;
import com.model.BookComparator.BookPriceComparator;

public class BookTest {
	public static void main(String[] args) {
		List<Book> book = new ArrayList<>();
		book.add(new Book("RotWHeel","Jonny",200,2001));
		book.add(new Book("GreatWall","Sansa",100,2008));
		book.add(new Book("Games","Jonny",400,2009));
		book.add(new Book("Iron","Jonny",200,2000));
		book.add(new Book("Bliss","Sansa",900,2007));
		book.add(new Book("Rainbow","Snow",500,2006));
		
		System.out.println("Before Sorting");
//		System.out.println(book);
		book.forEach(System.out::println);
		System.out.println("");
		
		Comparator<Book> comparator = Comparator.comparing(Book::getAuthor).
				thenComparing(Book::getTitle).thenComparing(Book::getPrice);
	
		Collections.sort(book,comparator);
		
		System.out.println("After Sorting:");

//		System.out.println(book);
		book.forEach(System.out::println);
	
	}
	
	

}
