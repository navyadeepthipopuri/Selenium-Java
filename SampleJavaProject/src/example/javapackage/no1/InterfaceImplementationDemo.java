package example.javapackage.no1;

/*we can implement the Interface by creating a Child Class 
and using IMPLEMENTS keyword*/
public class InterfaceImplementationDemo implements InterfaceDemo
{

	public static void main(String[] args) 
	{
		/*we can call the Abstract Methods in Main method by creation an reference
		 variable to the Child class*/
		
        InterfaceImplementationDemo iid = new InterfaceImplementationDemo();
        iid.AbstractMethodEx();
	}
	
	//we must implement the Abstract Methods from InterfaceDemo in ChildClass

	  @Override 
	  public void AbstractMethodEx()
	  {
		  System.out.println("i am overridden AbstractMethd From InterfaceImplementDemo");
	  }
	 
}
