package demoPkg;

public abstract   class DemoAbsClass //concrete class
{
	
	int x = 20;
	

	public void meth1()
	{
		int x = 30;
		x=50;
		
		System.out.println("this is concrete method");
	}
	
	
	public void meth3()
	{
		System.out.println("this is method3");
	}
	
	public abstract   void meth2();
	
	public abstract   void meth5();
	
	
	public static void main(String[] args) {
		
		//DemoAbsClass dac = new DemoAbsClass();
		
	}
	
}
