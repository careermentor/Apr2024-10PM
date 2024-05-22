package demoPkg;

public class CallDemoAbsClass extends DemoAbsClass
{

	

	
	public static void main(String[] args) 
	{
	
		CallDemoAbsClass cda = new CallDemoAbsClass();
		
		cda.meth1();
		cda.meth2();
		cda.meth3();
	
	}

	public void meth2() 
	{
		System.out.println("this is password");
	}

	@Override
	public void meth5() {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
