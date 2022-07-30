package Practice2_Project8_v;

abstract class abst1_cls 
{
	public abstract void display();
}

public class inner_abst
{
	public static void main(String[] args)
	{
		abst1_cls ac = new abst1_cls()
		{

			@Override
			public void display() 
			{
				// TODO Auto-generated method stub
				System.out.println("This is the inner abstract class");
			}
			
		};
		ac.display();
	}
}
