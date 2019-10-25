package example.javapackage.no1;

/*Abstract class describes properties and behaviors of 
both concrete and abstract methods*/

public abstract class AbstractDemo 
{

	//concrete method
	public void m1() 
	{
		System.out.println("I am m1 concrete method from AbstractDemo class");
	}
	
	/*Abstract method inside the abstract class
	 we must guve the abstract keyword*/
	public abstract void m2();
	
	
	
	  public static void main(String[] args)
	  {
		//we cannot create object direct to the Abstract class but indirectly we can
	  AbstractDemo a1=new AbstractMethodImpDemo(); 
	  a1.m2(); 
	  a1.m1();
	  
	  }
	 
}
