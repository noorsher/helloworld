
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub=
		
		
		System.out.println("client code working with the ConcreteClass1:");  
		AbstractClass c = new conceteClass1();  
		c.templateMethod();  
		System.out.print("\n");  
		System.out.println("client code working with the ConcreteClass2:"); 
		c = new concreteClass2();  
		c.templateMethod(); 
	
	}

}
