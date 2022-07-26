package Practice_Project8;

public class String_class 
{
	public static void main(String[] args)
	{
		String s1 = "Sidhu";
		String s2 = "Sankar";
		
		//
		String con = s1.concat(s2);
		System.out.println(con);
		
		//
		char str[] = s1.toCharArray();
		for(char ch : str)
		{
			System.out.println(ch);
		}
		
		//
		System.out.println(s1.compareTo(s2));
		
		//
		System.out.println(s1.isEmpty());
		
		//
		System.out.println(s1.contains("idhu"));
		
		//
		System.out.println(s1.contentEquals(s2));
		
		//
		System.out.println(s1.equals(s2));
		
		//
		System.out.println(s1.getBytes());
		
		//
		System.out.println(s1.length());
		
		//
		String s5 = s1.replace('s','k');
		System.out.println(s5);
		
		//
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s2.substring(0, 3));
		
		//
		System.out.println(s1.substring(0,4));
		
		
	}
}