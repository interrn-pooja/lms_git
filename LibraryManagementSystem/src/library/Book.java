package library;

/**
 * The Book program implements an application that store book in library
 * 
 * @author CSS
 * @version 1.0
 * @see Test.java create a Book name class.this class is only used to store
 *      members and methods and also return the value
 */
public class Book {
	/**
	 * @param name
	 *            this is first variable to store name of Book
	 */

	private String name;
	/**
	 * @param authoname
	 *            this is the second variable to store name of author
	 */
	private String authorname;
	/**
	 * @param price
	 *            this is the third variable to store price of book
	 */
	private double price;
	/**
	 * @param quantity
	 *            this is the fourth variable to store quantity of book
	 */
	private int quantity;

	/**
	 * declare a parameterized constructor to store a name,authorname,price,quantity
	 * 
	 */
	public Book(String name, String authorname, double price, int quantity) {
		/**
		 * this.name access the instance variable name
		 * 
		 */
		this.name = name;
		/**
		 * this.name access the instance variable authorname
		 * 
		 */
		this.authorname = authorname;
		/**
		 * this.name access the instance variable price
		 * 
		 */
		this.price = price;
		/**
		 * this.name access the instance variable quantity
		 * 
		 */
		this.quantity = quantity;
	}

	/**
	 * getname method is used to get the name of book
	 */

	public String getname() {
		/**
		 * * @return string this return the name of book
		 */

		return name;
	}

	/**
	 * getname method is used to get the name of author
	 */
	public String getauthorname() {
		/**
		 * @return string this return the name of author
		 */
		return authorname;
	}

	/**
	 * getname method is used to get the price of book
	 */
	public double getprice() {

		/**
		 * @return double this return the price of book
		 */
		return price;
	}

	/**
	 * getname method is used to get the quantity of book
	 */
	public int getquantity() {
		/**
		 * @return int this return the quantity of book
		 */
		return quantity;
	}

	/**
	 * toString method is used to return the value of the objects
	 */
	public String toString() {
		/**
		 * return the value of the object
		 */
		return (name + "  " + authorname + "  " + price + "  " + quantity);

	}

	public void setQuantity(int num) {
		quantity = num;
	}

}
