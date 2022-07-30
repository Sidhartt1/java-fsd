package Practice2_Project4;

public class try_catch 
{
	public static void main(String[] main)
	{
		try
		{
			int a = 50/0;
		}
		catch(Exception e)
		{
			System.out.println("Your error is "+e);
		}
		finally
		{
			System.out.println("You have reached finally block");
		}
	}
}