package library;

public class Runner {
	public static void main(String[] args) {
		Library lib = new Library();
		
		
		
		lib.addBook("java", "pooja", 20.50, 3);
		lib.addBook("c++", "darshita", 25.50, 5);
		lib.addBook("dotnet", "subhana", 30.00, 5);
		Book b = new Book("python", "rajat", 50.00, 7);
		lib.addBook(b);
 
		lib.printBook();
		System.out.println("");

		lib.issueBook("java");
		lib.issueBook("ds");
		
		
		System.out.println("");
		lib.printBook();
		
		System.out.println("");
		lib.returnBook("java");
		lib.returnBook("java");
		
		lib.printBook();
		

	}
}
