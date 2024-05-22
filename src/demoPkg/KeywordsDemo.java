package demoPkg;

public class KeywordsDemo 
{

	static int a = 20;  //global variable
	
	public void printVar()
	{
		int a = 30;
		System.out.println(a); //30   //local variable
		
		System.out.println(this.a);  //20
	}
	
	
	public static void staticMeth()
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) 
	{
	
		KeywordsDemo.staticMeth();
		
		
		KeywordsDemo kd = new KeywordsDemo();
		kd.printVar();
		
	}
	
}
