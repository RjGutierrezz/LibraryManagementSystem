// This is a project about object oriented programming for java.
// Project name: Library Management System

/* Prompts:
Define the Classes and Relationships:
	Book: Represents a book in the library.
	Member: Represents a library member.
	Library: Manages books and members.
	Librarian: Inherits from Member and has additional responsibilities.

Class Definitions:
	Book class with attributes like title, author, ISBN, and availability.
	Member class with attributes like name, memberId, and methods to borrow and return books.
	Library class with methods to add books, register members, and manage book lending.
	Librarian class inheriting from Member with additional methods to manage the library.

Implement the Classes:
	Write the Java code for each class.
	Implement methods for borrowing and returning books.
	Implement methods for adding books and registering members.

Create a Main Class:
	Create a Main class to interact with the library system.
	Add a menu-driven interface to perform operations like adding books, registering members, borrowing, and returning books.

Test the System:
	Write unit tests to ensure the functionality of each class and method.
	Test the system by running the Main class and performing various operations.
 */
import java.util.Scanner;

public class Main {

	// Main method
	public static void main(String[] args) {
		Book book = new Book("The Fourth Wing" , "Rebecca Yaros");
		Book book1 = new Book("The Iron Flame", "Rebecca Yaros");
		Book book2 = new Book("The Onyx Storm", "Rebecca Yaros");
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Library Management System");
			// System.out.println("1. Add a book");
			// System.out.println("2. Register Member");
			// System.out.println("3. Borrow a Book");
			// System.out.println("4. Return a Book");
			System.out.println("1. Show all available books");
			System.out.println("6. Exit");
			System.out.print("Choose from the option above: ");
			int choice = scanner.nextInt();
			scanner.nextLine();

		switch (choice) {
			// case 1: 
				// System.out.println("\nYou choice to add book! ");
				// System.out.println("Please enter the name of the book");
				// String title = scanner.nextLine();

				// System.out.println("Please enter the author's name");
				// String authorName = scanner.nextLine();

				// System.out.println("Please enter the ISBN of the book");
				// String isbn = scanner.nextLine();

			case 1: 
				System.out.println("\nThe current available books are: ");
				System.out.print(book.toString());
				System.out.print(book1.toString());
				System.out.print(book2.toString());
			case 6: 
				System.out.println("\nExiting... Hope to see you again soon!");
				scanner.close();
				return;
			}
		}
	}
}