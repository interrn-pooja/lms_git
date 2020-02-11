package library;

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
		Book b = new Book(name, authorname, price, quantity);
		blist.add(b);
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
