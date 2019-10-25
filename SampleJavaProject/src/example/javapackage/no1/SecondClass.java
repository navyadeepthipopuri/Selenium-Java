package example.javapackage.no1;

//Class creation
public class SecondClass 
{
	//class is set of 
    //data -- properties(data variables)
	// operations -- behaviours(methods)
	
	int a=20, b=10, c; //properties
	 public void add() //behaviours
	 {
		c=a+b;
		System.out.println("Addition of a+b is :" + c); 
		//combining string and integer using + sign is called concatination
	
	 }
	 
	 public void sub() //behaviours
	 {
		c=a-b;
		System.out.println("Subtraction of a-b is :" + c);

	}
	 
	 public void mul()
	 {
		c=a*b;
		System.out.println("Multipliction of a*b :"+ c);
	 }
	
	public static void main(String[] args)
	{
		
		System.out.println("Hello This is my Second Class");
		
		//creating class object or reference variable 
		SecondClass obj= new SecondClass();
		obj.add();
		obj.sub();
		System.out.println(obj.c);
		
		//we can create morethan one class object
		SecondClass obj2=new SecondClass();
		//obj2.add();
		//obj2.sub();
		obj2.mul();
		System.out.println(obj2.c);

	}

}
