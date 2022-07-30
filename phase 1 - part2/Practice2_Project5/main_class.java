package Practice2_Project5;

public class main_class 
{
	public static void main(String[] main) throws AgeException
	{
		try
		{
			handle_class hc = new handle_class();
			hc.handle(10);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}
}