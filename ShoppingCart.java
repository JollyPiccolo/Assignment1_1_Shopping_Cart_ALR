/**
 * 
 */

/**
 * @author AdelineLR
 *
 */
public class ShoppingCart<T> implements ShoppingCartInterface<Item>{
	
	//Variable Instantiation - creating the ArrayBag to be used in the cart
	private ResizableArrayBag<Item> cartbag = new ResizableArrayBag<Item>();
	
	/**
	 * Constructor - Empty
	 */
	public ShoppingCart() {
	}
	
	/**
	 * Constructor - with an array of items
	 */
	public ShoppingCart(Item[] newItems) {
		for(int count = 0; count < newItems.length; count++) {
			cartbag.add(newItems[count]);
		}
	}
	
	/**
  	* Accessor
  	* Returns the item located at the specified key
  	* @param key
  	* @return result if present; returns as null if no item is found
  	*/
	public Item viewItem(int key) {
	
		Item result = new Item();
		Object[] tempArray = cartbag.toArray();	
		
		result = (Item) tempArray[key];
		return result;
	}
	
	/**
	 * Accessor
	  	* Checks to see if the cart contains a certain object
	  	* @param key
	  	* @return true if the item is in the cart; returns false if not
	  	*/
	public boolean contains(Item key){
		return cartbag.contains(key);
	}
	
	/**
	 * Accessor
	 * Checks to see if the cart is empty
	 * @return true if no items are in the cart; returns false if otherwise
	 */
	public boolean isEmpty() {
		return cartbag.isEmpty();
	}
	
	/**
	 * Accessor 
	 * Returns an Integer that represents the number of items in the cart, starting at 1
	 * @return size
	 */
	public int currentSize() {
		return cartbag.getCurrentSize();
	}
	
	/**
	 * Mutator
	 * adds an item to the next spot in the list
	 * @param newItem
	 */
	public boolean addItem(Item newItem) {
		return cartbag.add(newItem);
	}

	/**
	 * Mutator
	 * removes the first instance of the specified target
	 * @param target
	 */
	public boolean removeItem(Item target) {
		return cartbag.remove(target);
	}
	
	/**
	 * Command
	 * Completely empties the cart
	 */
	public void clearCart() {
		cartbag.clear();
	}

	/**
	 * Command
	 * Adds the prices of all the items together and returns it
	 * @return total
	 */
	public double totalPrice(){
		double total = 0;
		int MAX = cartbag.getCurrentSize();
		Object[] tempArray = cartbag.toArray();
		
		for(int loop = 0; loop < MAX; loop++){
			total += ((Item) tempArray[loop]).getPrice();
		}
		
		return total;
	}
	
	/**
	 * Command
	 * Checks for the number of items in the list with the same information as the target, and returns the number
	 * @param target
	 * @return total
	 */
	public int itemFreq(Item target) {
		return cartbag.getFrequencyOf(target);
	}
	
	/**
	 * Command
	 * Turns the cart into an array
	 */
	public void toArray() {
		cartbag.toArray();
	}
	
	/**
	 * Command
	 * Automatically prints the list in order, one at a time
	 */
	public void printList() {
		
		int MAX = cartbag.getCurrentSize();;
		Object[] tempArray = cartbag.toArray();
		
		for(int loop = 0; loop < MAX; loop++){
			System.out.println("\t" + tempArray[loop]);
		}
	}
	
}
