package anotherPkg;

import demoPkg.ClassWithMainMethod;

public class CallingMainMethod 
{

	public static void main(String[] args)
	{
		ClassWithMainMethod abc = new ClassWithMainMethod();
		
		abc.printVar();
	}
	
}
