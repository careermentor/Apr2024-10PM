package anotherPkg;

public class DemoClass 
{

	public DemoClass(int a)
	{
		int b = a*a;
		System.out.println(b);
	}
	
	int a=10;
	float b = 10.5f;
	char c = 'X';
	String d = "Test";
	boolean e = true;
	
	public void printValues()
	{
		int a = 10;
		
		System.out.println(a);
		System.out.println("This is a text" + a); //concatenation
	}
	
	public int sum()
	{
		int a = 20;
		int b = 30;
		int c = a+b;
		System.out.println(c);
		return c;
		
	}
	
	public void add(int a)
	{
		int b = a*a;
		System.out.println(b);
	}
	
	public static void main(String[] args)
	{
	
		DemoClass dc = new DemoClass(20);
		
		dc.printValues();
		
		int x = dc.sum();
		
		dc.add(x);
		
		
	}
	
}