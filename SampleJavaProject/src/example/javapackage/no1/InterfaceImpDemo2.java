package example.javapackage.no1;

public class InterfaceImpDemo2 implements InterfaceDemo
{

	public static void main(String[] args) 
	{
		InterfaceImpDemo2 iid2=new InterfaceImpDemo2();
		iid2.AbstractMethodEx();
	}

	@Override
	public void AbstractMethodEx() 
	{
		System.out.println("I am Overidden Abstract Method from InterfaceImpDemo2");
	}

}
