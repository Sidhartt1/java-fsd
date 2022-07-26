package Practice_Project5;

public class innerClass 
{
	public class inner
	{
		public void Display()
		{
			System.out.println("You accessed the Inner class");
		}
	}
	public static void main(String[] args)
	{
		innerClass inc = new innerClass();
		innerClass.inner in = inc.new inner();
		in.Display();
	}
}