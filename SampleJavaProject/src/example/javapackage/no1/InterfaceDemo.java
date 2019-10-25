package example.javapackage.no1;


/*In interface we can create methods but we will implement somewhere else and
we cannot create object in main method for Interface*/
public interface InterfaceDemo 
{
	//Abstract Methods does not contain bodies
      public void AbstractMethodEx();
      
     //we cannot create object direct to the Interface but indirectly we can
      public static void main(String args[])
      {
    	 // InterfaceDemo i=new InterfaceDemo();
    	  
		/*
		 * InterfaceDemo i; i=new InterfaceImplementationDemo(); i.AbstractMethodEx();
		 * 
		 * InterfaceDemo i2=new InterfaceImpDemo2(); i2.AbstractMethodEx();
		 */
		 
    	  InterfaceDemo i;
    	  
    	  i=new InterfaceImplementationDemo();
    	  i.AbstractMethodEx();
    	  
    	  i=new InterfaceImpDemo2();
    	  i.AbstractMethodEx();
    	  
      }
      
}
