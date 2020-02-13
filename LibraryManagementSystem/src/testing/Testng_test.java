package testing;

import org.testng.annotations.Test;

import library.Library;

public class Testng_test {
 
	@Test
	private void test1() {
		Library lib = new Library();
		lib.addBook("test1", "auth1", 10, 1);
		lib.printBook();
	}
	@Test
	private void test2() {
		Library lib = new Library();
		lib.addBook("test2", "auth1", 10, 1);
		lib.printBook();
	}
	@Test
	private void test3() {
		
		Library lib = new Library();
		lib.addBook("test3", "auth1", 10, 1);
		lib.printBook();
	}
}
