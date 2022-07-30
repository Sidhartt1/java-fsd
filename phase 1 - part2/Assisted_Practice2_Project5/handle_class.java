package Practice2_Project5;

public class handle_class 
{
	public void handle(int age) throws AgeException
	{
		if(age>18)
		{
			System.out.println("You are eligible to vote");
		}
		else
		{
			throw new AgeException("You are not eligible to Vote");
		}
	}
}