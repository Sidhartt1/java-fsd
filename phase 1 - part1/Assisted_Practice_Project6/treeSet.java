package Practice_Project6;

import java.util.Iterator;
import java.util.TreeSet;

public class treeSet 
{
	public static void main(String[] args)
	{
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Sidhu");
		ts.add("is a ");
		ts.add("good boy");
			
		Iterator<String> itr = ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
	}
}
