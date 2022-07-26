package Practice_Project5;

public class innerclsMethod 
{
	
	public void Display()
	{
		class inner
		{
			void display()
			{
				System.out.println("You have accessed the inner class within the method");
			}
		}
		inner in = new inner();
		in.display();
	}
	
	
	public static void main(String[] args)
	{
		innerclsMethod icm = new innerclsMethod();
		icm.Display();
	}
}