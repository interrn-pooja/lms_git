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
		lib1.printBook();
		
		System.out.println("*******************");
		lib1.addBook("java", "darshita", 80.00, 2);
		lib1.printBook();
		
         lib1.returnBook("c++");
         lib1.printBook();
	}
}
