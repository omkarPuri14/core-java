package progam.varibles;

public class Library {

	static String library_name = "progaramin";
	static int bookID = 435;
	static String title = "java";
	static String author = "james goslin";
	static String genre;
	static double price = 445.76;
	static int yearPublished;
	static double rating;

	public static void main(String[] args) {
		System.out.println("--- Library Book Details ---");
		System.out.println("Book ID: " + bookID);
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Genre: " + genre);
		System.out.println("Price: $" + price);
		System.out.println("year published :- " + yearPublished);
		System.out.println("library name:- " + library_name);
		System.out.println("rating of linrary:- "+rating+" star");

	}

}
