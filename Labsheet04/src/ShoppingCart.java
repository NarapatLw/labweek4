import java.util.LinkedList;

public class ShoppingCart {

	public static void main(String[] args) {
		LinkedList<String> cart = new LinkedList<String>();
		//ex1-4
		cart.add("Wireless Mouse");	
		cart.add("Mechanical Keyboard");	
		cart.add("USB-C Hub");	
		System.out.println(cart);
		//ex5,6
		cart.add(1,"Mouse Pad");
		System.out.println(cart);
		//7,8
		cart.remove(3);
		System.out.println(cart);
		//ex9,10
		cart.remove(1);
		System.out.println(cart);
		//ex11,12
		cart.add("Monitor");	
		System.out.println(cart);
		//ex13,14
		cart.set(2,"Phone Holder");	
		System.out.println(cart);
		//ex15
		System.out.println(cart.getLast());
		
	 	}
	}
