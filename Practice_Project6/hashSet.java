package Practice_Project6;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet
{
	public static void main(String[] args)
	{
		HashSet<String> hs = new HashSet<String>();
		hs.add("Sidhu");
		hs.add("is a ");
		hs.add("good boy");
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}