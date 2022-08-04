package Practice3_project5;

import java.util.LinkedList;

public class linked_list 
{
	public static void main(String[] main)
	{
		LinkedList<Integer> li = new LinkedList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		
		System.out.println(li);
		
		li.clear();
		System.out.println(li);
		
		li.push(10);
		li.push(20);
		li.push(30);
		System.out.println(li);
		
		li.pop();
		System.out.println(li);
		
		li.offer(30);
		System.out.println(li);
		
		li.poll();
		System.out.println(li);
		
		System.out.println(li.contains(10));
		
		System.out.println(li.isEmpty());
		
		System.out.println(li.size());
		
		
		li.addFirst(20);
		li.addFirst(30);
		
		li.addLast(20);
		li.addLast(30);
		
		System.out.println(li);
		
		li.removeFirst();
		li.removeLast();
		System.out.println(li);
		
		
		
		
	}
}