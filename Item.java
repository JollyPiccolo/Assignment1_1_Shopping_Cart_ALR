/**
 * 
 */

/**
 * @author AdelineLR
 *
 */
public class Item{
	/**
	 * Instantiation of variables for class use
	 */
	private String product;
	private double price;
	
	/**
	 * Constructor
	 * Constructor for Blank Data
	 */
	public Item() {
		product = null;
		price = 0.00;
	}
	
	/**
	 * Constructor
	 * Constructor, with inputs for pre-determined data
	 * @param newProduct
	 * @param newPrice
	 */
	public Item(String newProduct, double newPrice) {
		this.product = newProduct;
		this.price = newPrice;
	}
	
	/**
	 * Mutator
	 * Sets the value of product within the item
	 * @param newProduct
	 */
	public void setProduct(String newProduct) {
		this.product = newProduct;
	}
	
	/**
	 * Mutator
	 * Sets the value of the price within the item
	 * @param newPrice
	 */
	public void setPrice(double newPrice) {
		this.price = newPrice;
	}
	
	/**
	 * Accessor 
	 * Returns the value of product
	 * @return{@value product}
	 */
	public String getProduct() {
		return product;
	}
	
	/**
	 * Accessor
	 * Returns the value of price
	 * @return {@value price}
	 */
	public double getPrice() {
		return price;
	
	}
	
	/**
	 * Command
	 * Changes the value of toString() to better fit the class
	 * @return a string with the product and price
	 */
	public String toString() {
		String text = "";
		text += product.toString() + ": $";
		text += price;
		return text;
	}
}
