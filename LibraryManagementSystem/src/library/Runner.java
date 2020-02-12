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

		lib.addBook("  c++ ", "  pooja   ",8.50, 3);
		
		lib.printBook();
		
		
		
		lib.issueBook("c++");
		lib.printBook();
		

		lib.issueBook("c++");
		lib.printBook();

		lib.issueBook("c++");
		lib.printBook();

		lib.issueBook("c++");
		lib.printBook();
		 
		
		lib.returnBook("c++");
		lib.printBook();
	}
	}
	
	

