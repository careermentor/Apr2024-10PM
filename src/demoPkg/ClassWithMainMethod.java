package demoPkg;

 public class ClassWithMainMethod 
{
	int a = 10;   //global variable
	
	float b = 10.5f;
	char c = 'X';
	String d = "Java";
	boolean e = true;
	
	
	
	
	 public void printVar()
	{
		final int a = 100;  //local variable  //constant
		//a=200;
		
		System.out.println(a);  //100/200
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
	
	 void meth2()
	{
		System.out.println(a);  //10
	}

	
	public static void main(String[] args)
	{
		ClassWithMainMethod abc = new ClassWithMainMethod();
		
		abc.printVar();
		abc.meth2();
	}

}
