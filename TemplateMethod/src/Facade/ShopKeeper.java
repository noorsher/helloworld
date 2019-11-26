package Facade;

public class ShopKeeper {
private MobileShop iphone;  
private MobileShop samsung;  
private MobileShop BlackBerry;

public ShopKeeper(){  
iphone= new IPhone();  
samsung= new Samsung();  
BlackBerry=new BlackBerry();  
}  
public void sellIPhone(){  
iphone.modelNo();  
iphone.price();  
}  
public void sellSamsung(){  
samsung.modelNo();  
samsung.price();  
}   
public void sellBlackBerry(){  
samsung.modelNo();  
samsung.price(); 
}  

}