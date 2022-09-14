/**
 * 
 */

/**
 * @author AdelineLR
 *
 */

public class Application{
	public static void main(String[] args) {
		/**
		 * Variable Instantiation
		 */
		Item grapes = new Item("Grapes", 6.49);	
		Item bananaBread = new Item("Banana Bread", 7.49);
		Item toothpaste = new Item("Tube of Toothpaste", 5.99);	
		Item pickles = new Item("Jar of Pickles", 4.99);
		Item shampoo = new Item("Bottle of Shampoo", 8.99);
		
		/**
		 * Constructor Test
		 */
		
		ShoppingCart<Item> testcart = new ShoppingCart<Item>();
		
		/**
		 * addItem Test
		 */
		testcart.addItem(pickles);
		testcart.addItem(toothpaste);
		testcart.addItem(bananaBread);
		testcart.addItem(bananaBread);
		testcart.addItem(grapes);
		testcart.addItem(toothpaste);
		
		/**
		 * printList test
		 */
		System.out.println("Cart 1 Contains: ");
		testcart.printList();
		
		/**
		 * removeItem test
		 */
		System.out.println("Removing: Banana Bread");
		testcart.removeItem(bananaBread);
		
		System.out.println("Cart 1 Now Contains: ");
		testcart.printList();
		
		/**
		 * viewItem test
		 */
		System.out.println("Index 1 Contains: " + testcart.viewItem(1));
		
		/**
		 * contains test
		 */
		System.out.println("Is a jar of pickles in the cart? " + testcart.contains(pickles));
		System.out.println("Is a bottle of shampoo in the cart? " + testcart.contains(shampoo));
		
		/**
		 * currentSize test
		 */
		System.out.println("The size of the cart is: " + testcart.currentSize());
		
		/**
		 * itemFreq test
		 */
		System.out.println("How many pieces of Banana Bread are in the cart? " + testcart.itemFreq(bananaBread));
		
		/**
		 * totalPrice test
		 */
		System.out.println("Total Price: $" + testcart.totalPrice());
		
		/**
		 * isEmpty and clear test
		 */
		System.out.println("Is the cart Empty? " + testcart.isEmpty());
		
		System.out.println("Clearing Cart...");
		testcart.clearCart();
		
		System.out.println("Is the cart Empty? " + testcart.isEmpty());
	}
}