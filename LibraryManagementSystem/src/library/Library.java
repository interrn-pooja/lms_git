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
		/**
		 * declare a array list
		 */
		blist = new ArrayList<Book>();
	}

	private List<Book> blist;

	/**
	 * create a method issue book. issue book is used to perform a such operation
	 * like- we can issue a book on library so the quantity of book will be
	 * decreases
	 * 
	 * @param bname
	 *            this is a variable to store book name
	 * 
	 */
	public void issueBook(String bname) {

		boolean bookexist = false;
		for (int s = 0; s < blist.size(); s++) {
			Book b = blist.get(s);
			/**
			 * equalsIgnorecase is used to compare two string and ignore the cases
			 */
			if (bname.equalsIgnoreCase(b.getname())) {
				System.out.println(s);
				int a = b.getquantity();
				if (a > 0) {
					/**
					 * line no 45 represent that the quantity of book will be decrease
					 */
					b.setQuantity(a - 1);
					bookexist = true;
				} else {
					System.out.println(" book of  " + bname + "  in the library is not available");
				}
				break;
			}

		}
		/**
		 * book is not available in list of library then displayed a message book not
		 * found
		 */
		if (!bookexist) {
			System.out.println("book not found");
		}

	}

	public void printBook() {

		boolean ans = blist.isEmpty();
		if (ans == true) {
			System.out.println("the list is empty please add the book");
		} else {
			System.out.println(blist);
		}
	}

	public void addBook(Book b1) {
		blist.add(b1);

	}

	public void addBook(String name, String authorname, double price, int quantity) {
		/**
		 * line no 84 represent that the length of book name should have only 50
		 * character
		 */
		if (name.length() > 50) {
			System.out.println("book name must be store 50 character");
		}
		/**
		 * line no 91 represent that the length of author name should have only 50
		 * character
		 */
		else if (authorname.length() > 50) {
			System.out.println("authorname must be store 50 character");
			/**
			 * line no 96 represent that book name cannot accept null and blank
			 */
		} else if (name != null && name.isEmpty()) {
			System.out.println("book name doestnot store null value and blank data");

			/**
			 * line no 102 represent that author name cannot accept null and blank
			 */
		} else if (authorname != null && authorname.isEmpty()) {
			System.out.println("author name doestnot store null value and blank data");
		} else if (quantity <= 0) {
			System.out.println(name + " book quantity should have greater than zero");

		} else if (price <= 0.0) {
			System.out.println(name + " book price should have greater than zero");
		}

		else {
			/**
			 * blist.add(b) is used to add a books on a list trim() is used to a leading and
			 * trailing a string
			 * 
			 */
			Book b = new Book(name.trim(), authorname.trim(), price, quantity);
			blist.add(b);

		}

	}

	/**
	 * 
	 * @param bname
	 *            this is a variable to store book name
	 * 
	 *            return book is used to perform a such operation like- we can
	 *            return a book on library so the quantity of book will be increase
	 */
	public void returnBook(String bname) {
		for (int s = 0; s < blist.size(); s++) {
			Book b = blist.get(s);
			if (bname.equalsIgnoreCase(b.getname())) {
				System.out.println(s);
				int a = b.getquantity();
				if (a > 0) {
					/**
					 * line no 135 represent that the quantity of book is increases
					 */
					b.setQuantity(a + 1);
				}

				break;
			}

		}

	}
}
