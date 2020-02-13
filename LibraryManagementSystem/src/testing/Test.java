package testing;

import library.Library;

public class Test {

	public static void main(String[] args) {
		Library lib = new Library();

		lib.addBook("java", "pooja", 20, 3);
		lib.printBook();

		lib.addBook("java", "darshita", 20, 3);
		lib.printBook();

	}
}
