package library;

public class Runner {
	public static void main(String[] args) {
		/**
		 * declare a library class object
		 */
		Library lib = new Library();
		
		/**
		 * add book on library class object lib
		 */

		lib.addBook("  c++ ", "  pooja   ", 0, 5);
		
		/**
		 * call a method print book with the help of library class object this method is
		 * used to print book
		 */
		lib.printBook();
		/**
		 * issue book method is used to issue a book on a library
		 */
		//lib.issueBook("java");
		//lib.printBook();
		
		//lib.returnBook("java");
		//lib.printBook();
	}
}
