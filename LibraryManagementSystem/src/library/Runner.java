package library;

public class Runner {
	public static void main(String[] args) {
		/**
		 * declare a library class object
		 */
		Library lib1 = new Library();

		/**
		 * add book on library class object lib
		 */


		lib1.addBook("java", "pooja", 50.00, 4);
		lib1.addBook("java", "pooja", 50.00, 4);

		lib1.printBook();

		Library lib2 = new Library();

		lib2.addBook("c++", "darshita", 50.00, 4);

		lib2.printBook();
		lib1.printBook();
		
		
		System.out.println("*******************");
		
		lib1.returnBook("ds");
		lib2.printBook();

	}
}
