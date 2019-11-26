
public class concreteClass2 extends AbstractClass{

	@Override
	public void abstractMehod1() {
		// TODO Auto-generated method stub
		System.out.println("ConcreteClass2 says: Implemented abstract method1 ");
	}

	@Override
	public void abstractMehod2() {
		// TODO Auto-generated method stub
		hookMethod1();
		System.out.println("ConcreteClass2 says: Implemented abstract method2");
	}
	
	public void hookMethod1() {
		System.out.println(" hook method 1 implemented");
	}

}
