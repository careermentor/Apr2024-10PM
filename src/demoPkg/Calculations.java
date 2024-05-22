package demoPkg;

public class Calculations 
{
	public float sum()
	{
		float a = 5.5f;
		float b = 5.5f;
		
		float g = a+b;
		
		String d = "Santosh";
		String e = "modi";
		
		float c = a+b;
		
		System.out.println("This is sum of a&b: " + c);  //50
		
		System.out.println(10+20);  //30
		System.out.println("a" + "b");  //ab
		System.out.println("a" + 20);  //a20
		return c;
	}
	
	public int addition(int i, int j)
	{
		int k = i+j;
		System.out.println("addition of i&j: " + k);
		return k;
	}
	
	//20+30+40
	// int x = 20+30
	// x+40
	
	public static void main(String[] args) 
	{
		Calculations cal = new Calculations();
		
		float y = cal.sum();
		
		int x = cal.addition(20, 30);
		cal.addition(x, 60);
	}
	
	
	
	
	
	
	
	
	
}
