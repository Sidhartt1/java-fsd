package Practice2_Project8_iii;

class Community
{
	public void display()
	{
		System.out.println("This is our X Community");
	}
}

class school extends Community
{
	public void display()
	{
		System.out.println("This is our school in X community");
		super.display();
	}
}


public class single 
{
	public static void main(String[] main)
	{
		school venus = new school();
		venus.display();
	}
}