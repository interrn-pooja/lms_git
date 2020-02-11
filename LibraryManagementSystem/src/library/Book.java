package library;

public class Book {
	private String name;
	private String authorname;
	private double price;
	private int quantity;

	public Book(String name, String authorname, double price, int quantity) {
		this.name = name;
		this.authorname = authorname;
		this.price = price;
		this.quantity = quantity;
	}

	public String getname() {
		return name;
	}

	public String getauthorname() {
		return authorname;
	}

	public double getprice() {
		return price;
	}

	public int getquantity() {
		return quantity;
	}

	public String toString() {
		return (name + "  " + authorname + "  " + price + "  " + quantity);

	}

	public void setQuantity(int num) {
		quantity = num;
	}

}
