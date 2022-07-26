package Practice_Project8;

public class stringBuffer_class 
{
	public static void main(String[] args)
	{
		StringBuffer s1 = new StringBuffer("Sidhu");
		
		//
		String s = "Sankar";
		StringBuffer s2 = new StringBuffer(s);
		System.out.println(s2);
		
		//
		s2.append("govind");
		System.out.println(s2);
		
		//
		System.out.println(s2.capacity());
		
		//
		System.out.println(s2.charAt(3));
		
		//
		s2.delete(0, 3);
		System.out.println(s2);
		
		//
		System.out.println(s2.equals(s1));
		
		
		//
		System.out.println(s2.indexOf("n"));
		
		//
		s2.reverse();
		System.out.println(s2);
	}
}