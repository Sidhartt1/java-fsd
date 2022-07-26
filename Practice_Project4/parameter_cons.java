package Practice_Project4;

public class parameter_cons 
{
	int a;
	int b;
	parameter_cons(int a, int b)
	{
		this.a = a;
		this.b = b;
		display();
		addDisplay();
	}
	void display()
	{
		System.out.println("The entered numbers are : "+this.a+" and "+this.b);
	}
	
	void addDisplay()
	{
		int result = a+b;
		System.out.println("Addition of Numbers : "+result);
	}
	
	
	public static void main(String[] args)
	{
		parameter_cons pc = new parameter_cons(12,10);		
	}
}
