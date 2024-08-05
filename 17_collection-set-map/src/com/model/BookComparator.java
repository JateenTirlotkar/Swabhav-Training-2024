package com.model;
import java.util.*;

public class BookComparator {
	public static class BookTitleComparator implements Comparator<Book>{

		@Override
		public int compare(Book book1, Book book2) {
			
			return book1.getTitle().compareTo(book2.getTitle());
		}
		
	}
	
	public  class BookAuthorComparator implements Comparator<Book>{

		@Override
		public int compare(Book book1, Book book2) {
			
			
			return book1.getAuthor().compareTo(book2.getAuthor());
		}
		
	}
	
	public static class BookPriceComparator implements Comparator<Book>{

		@Override
		public int compare(Book book1, Book book2) {
			
			return (int) (book1.getPrice()-book2.getPrice());
		}
		
	}
	
	public static class BookPublicationYearComparator implements Comparator<Book>{

		@Override
		public int compare(Book book1, Book book2) {
			
			return book1.getPublicationYear()-book2.getPublicationYear();
		}
		
	}

}
