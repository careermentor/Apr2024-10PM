package demoPkg;

public class QA2 extends QA1
{

	int x = 200;
	public void printVar()
	{
		
		int x = 300;
		
		System.out.println(x);  //300
		System.out.println(this.x); //200  
		
		System.out.println(super.x); //500
		
		super.sum(40, 50);
	}
	
	
	public void sum(int a, int b)
	{
		int c = a*a+b*b;
		System.out.println("sum of a&b: " + c);
	}
		
	public void sub(int a, int b)
	{
		int c = a-b;
		System.out.println("sub of a&b: " + c);
	}
	
	public static void main(String[] args) 
	{
	
		QA2 q2 = new QA2();
		q2.sub(20, 30);
		
		q2.sum(40, 50);
		//q2.sum(30, 40, 50);
		
		q2.printVar();
		
		
	}


	public void qa1im() {
		System.out.println("this is QA1I");
		
	}
	
}
