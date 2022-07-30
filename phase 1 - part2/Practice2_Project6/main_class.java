package Practice2_Project6;

public class main_class 
{
	public static void main(String[] main) throws ArithException
	{
		try
		{
			int a = 50/0;
		}
		catch(Exception e)
		{
			System.out.println("You have a new arithmetic error : "+e);
			throw new ArithException("Thrown a error");
		}
	}
}