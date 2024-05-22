package demoPkg;

public class Calculations2 
{
	
	
	public void sum()
	{
		float a = 5.5f;
		float b = 5.5f;
		float c = a+b;
		
		System.out.println("This is sum of a&b: " + c);  //50
	}
	
	public int addition(int i, int j)
	{
		int k = i+j;
		System.out.println("addition of i&j: " + k);
		return k;
	}
	
	public Calculations2()
	{
		System.out.println("this is a constructor");
		int a = 20;
		int b = 30;
		int c = a+b;
		System.out.println(c);
	}
	
	public Calculations2(int a, int b)
	{
		int c = a+b;
		System.out.println(c);
		
	}
	
	public static void main(String[] args) 
	{
		Calculations2 cal = new Calculations2(50, 100);  //constructor automatically get called
		
		Calculations2 cal2 = new Calculations2();
		
		cal2.sum();
		cal2.addition(30, 40);
	}
	
	
	
	
	
	
	
	
	
}
