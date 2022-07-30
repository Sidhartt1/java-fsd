package Practice_Project8;

public class stringconvert 
{
	public static void main(String[] args)
	{
		String s1 = "Sidhu";
		StringBuffer s2 = new StringBuffer(s1);
		StringBuilder s3 = new StringBuilder(s1);
		
		System.out.println("String : "+s1);
		System.out.println("String Buffer : "+s2);
		System.out.println("String Builder : "+s3);

	}
}