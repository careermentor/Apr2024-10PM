package demoPkg;

public class CallInterface implements DemoInterface 
{

	
	public void meth4() 
	{
	
		System.out.println("this is interface method");
		
	}
	
	public static void main(String[] args) {
		
		CallInterface ci = new CallInterface();
		ci.meth4();
		
	}

}
