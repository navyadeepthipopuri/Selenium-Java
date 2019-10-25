package example.javapackage.no1;

public class AbstractMethodImpDemo extends AbstractDemo {

	public static void main(String[] args) {
		AbstractMethodImpDemo a = new AbstractMethodImpDemo();
		a.m1();
		a.m2();
	}

	
	  public void m1() 
	  { 
		  /*child class can reuse properties and if child class does
	  not like the parent class behavior we can change the behavior in child class*/
	   
		  System.out.println("I am m1 overridden concrete method from AbstractMethodImpDemo class"); 
	  }
	 

	@Override
	public void m2() {
		System.out.println("I am overridden Abstract method m2 from AbstractMethodImpDemo");

	}

}
