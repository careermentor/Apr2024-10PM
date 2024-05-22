package demoPkg;

public class QA4 extends QA2 implements QA3I
{

		
	public void div(int a, int b)
	{
		int c = a/b;
		System.out.println("div of a&b: " + c);
	}
	
	public static void main(String[] args) 
	{
	
		QA4 q4 = new QA4();
		
		q4.div(60, 30);
		
		//q4.mul(50, 60);
		
		q4.sub(20, 30);
		
		q4.sum(70, 80);
		q4.qa1im();
		q4.qa3im();
		
		
	}

	
	public void qa3im() {
		System.out.println("this is QA3I");
	}
	
}
