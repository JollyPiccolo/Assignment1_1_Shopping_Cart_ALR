/**
 * 
 */

/**
 * @author AdelineLR
 *
 */
public interface ShoppingCartInterface<T>{

		/**
		 * Instantiation of variables for class use
		 */
	
	 	/**
	  	* Accessor
	  	* Returns the item located at the specified key; returns as "Empty - 0.0" if no item is found"
	  	* @param key
	  	* @return thing
	  	*/
		public Item viewItem(int key);
	 
		/**
		 * Accessor
   	  	* Checks to see if the cart contains a certain object
   	  	* @param key
   	  	* @return true if the item is in the cart; returns false if not
   	  	*/
		public boolean contains(T key);
		
		/**
		 * Accessor
		 * Checks to see if the cart is empty
		 * @return true if no items are in the cart; returns false if otherwise
		 */
		public boolean isEmpty();
		
		/**
		 * Accessor 
		 * Returns an int that represents the number of items in the cart, starting at 1
		 * @return size
		 */
		public int currentSize();
		
		/**
		 * Mutator
		 * adds an item to the next spot in the list
		 * @param newItem
		 */
		public boolean addItem(T newItem);
	
		/**
		 * Mutator
		 * removes the first instance of the specified target
		 * @param target
		 */
		public boolean removeItem(T target);
		
		/**
		 * Command
		 * Completely empties the cart
		 */
		public void clearCart();

		/**
		 * Command
		 * Adds the prices of all the items together and returns it
		 * @return total
		 */
		public double totalPrice();
		
		/**
		 * Command
		 * Checks for the number of items in the list with the same information as the target, and returns the number
		 * @param target
		 * @return total
		 */
		public int itemFreq(T target);
		
		/**
		 * Command
		 * Turns the cart into an array
		 */
		public void toArray();
		
		/**
		 * Command
		 * Automatically prints the list in order onto the terminal, one at a time
		 */
		public String toString();
}

