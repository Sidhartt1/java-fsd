package Practice_Project8;

public class stringBuilder_class 
{
	public static void main(String[] args)
	{
		StringBuilder s1 = new StringBuilder("Sidhu");
		
		//
		String s = "sankar";
		StringBuilder s2 = new StringBuilder(s);
		System.out.println(s2);
		
		//
		s2.append(s1);
		System.out.println(s2);
		
		//
		System.out.println(s2.capacity());
		
		//
		System.out.println(s2.charAt(3));
		
		//
		s2.delete(0, 2);
		System.out.println(s2);
		
		//
		s2.insert(0, 'k');
		System.out.println(s2);
		
		//
		System.out.println(s2.reverse());
	}
}