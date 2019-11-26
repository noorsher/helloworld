package StrategyPattern;

public class Demo {
	   public static void main(String[] args) {
	   ShoppingCart cart = new ShoppingCart();

	   Item item1 = new Item("Code complete",120);
	   Item item2 = new Item("Design patterns in java",100);

	   cart.addItem(item1);
	   cart.addItem(item2);

	   //pay by paypal
	   cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));

	   //pay by credit card
	   cart.pay(new CreditCardStrategy("Syed Sajid Hussain","1234567890123456", "1234", "12/19"));
	   }
	}
