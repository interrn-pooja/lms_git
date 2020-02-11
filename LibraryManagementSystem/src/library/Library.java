package library;

/**
 * In this program store a library details like-
 * issue book in library
 * add book in library
 * return book 
 * print book
 * 
 */
import java.util.ArrayList;
import java.util.List;

public class Library {
	public Library() {
		blist = new ArrayList<Book>();
	}

	private List<Book> blist;

	public void issueBook(String bname) {
		// loop one by one in list
		// book Object get name
		// check name match bname
		// equal hua to, Book getQuantity
		// quantity ko 1 se kam karna
		// new quantity ko setQuantity

		boolean bookexist = false;
		for (int s = 0; s < blist.size(); s++) {
			Book b = blist.get(s);

			if (bname.equalsIgnoreCase(b.getname())) {
				System.out.println(s);
				int a = b.getquantity();
				if (a > 0) {
					b.setQuantity(a - 1);
					bookexist = true;
				} else {
					System.out.println(" book of  " + bname + "  in the library is not available");
				}
				break;
			}

		}
		if (!bookexist) {
			System.out.println("book not found");
		}

	}

	public void printBook() {
		System.out.println(blist);

	}

	public void addBook(Book b1) {
		blist.add(b1);

	}

	public void addBook(String name, String authorname, double price, int quantity) {

		if (name.length() > 50) {
			System.out.println("book name must be store 50 character");
		} else if (authorname.length() > 50) {
			System.out.println("authorname must be store 50 character");
		} else if (name != null && name.isEmpty()) {
			System.out.println("book name doestnot store null value and blank data");
		} else if (authorname != null && authorname.isEmpty()) {
			System.out.println("author name doestnot store null value and blank data");
		} else {

			Book b = new Book(name.trim(), authorname.trim(), price, quantity);
			blist.add(b);

		}

	}

	public void returnBook(String bname) {
		for (int s = 0; s < blist.size(); s++) {
			Book b = blist.get(s);
			if (bname.equalsIgnoreCase(b.getname())) {
				System.out.println(s);
				int a = b.getquantity();
				if (a > 0) {
					b.setQuantity(a + 1);
				}

				break;
			}

		}

	}
}
