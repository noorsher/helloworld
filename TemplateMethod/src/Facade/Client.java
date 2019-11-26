package Facade;

public class Client {

public static void main(String[] args) {
ShopKeeper shopKeeper = new ShopKeeper();
shopKeeper.sellIPhone();

shopKeeper.sellSamsung();

shopKeeper.sellBlackBerry();
}
}

