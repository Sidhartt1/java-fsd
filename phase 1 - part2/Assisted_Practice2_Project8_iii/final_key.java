package Practice2_Project8_iii;

final class Company1
{
	final public void display()
	{
		System.out.println("This is our company");
	}
}

class worker1 extends Company1
{
	public void disp()
	{
		super.display();
	}
}


public class final_key 
{
	public static void main(String[] main)
	{
		worker1 w1 = new worker1();
		w1.disp();
	}
}
