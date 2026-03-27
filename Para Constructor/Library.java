package com.construcror;

public class Library {
	 String library_name;
	 int bookID;
	 String title;
	 String author;
	 double price;
	 int yearPublished;
	 
	 public Library( String library_name,int bookID,String title,String author,double price,int yearPublished) {
		 
		 this.library_name=library_name;
		 this.bookID=bookID;
		 this.title=title;
		 this.author=author;
		 this.price=price;
		 this.yearPublished=yearPublished;
		 
		 
	 }
	 public void display() {
		 System.out.println("--- Library Book Details ---");
			System.out.println("library name:- " + library_name);
			System.out.println("Book ID: " + bookID);
			System.out.println("Title: " + title);
			System.out.println("Author: " + author);
		    System.out.println("Price: $" + price);
			System.out.println("year published :- " + yearPublished);
	 }

}
