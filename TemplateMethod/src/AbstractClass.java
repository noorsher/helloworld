
public abstract class AbstractClass {
	public AbstractClass() {
		// TODO Auto-generated constructor stub
	}
	
	void templateMethod() {
		
		 ConcreteMethod1();
		 abstractMehod1();
		
		 ConcreteMethod2();
		 abstractMehod2();
		 ConcreteMethod3();
	}
	public void ConcreteMethod1() {
		System.out.println("AbstractClass says: I am doing the bulk of the work");
	}
	
	public void ConcreteMethod2() {
		System.out.println("AbstractClass says: But I let subclasses override some methods");
	}

	public void ConcreteMethod3() {
	System.out.println("AbstractClass says: But I am doing all the work myself "); 
			
	}
	
	public abstract void abstractMehod1();
	public abstract void abstractMehod2();
	
	public void hookMethod1() {
		System.out.println(" hook method 1 implemented");
	}
	public void hookMethod2() {
		System.out.println("this is hook method 2 implemented");
	}
}
