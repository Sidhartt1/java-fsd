package Practice3_project9;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_demo 
{
	public static void main(String[] args)
	{
		Queue<Integer> q = new PriorityQueue<>();
		q.offer(10);
		q.offer(20);
		q.offer(30);
		q.offer(40);
		q.offer(50);
		System.out.println(q);
		
		System.out.println(q.poll());
		System.out.println(q.poll());
		
		System.out.println(q);
		
		System.out.println(q.isEmpty());
		
		System.out.println(q.size());
		
		System.out.println(q.remove(30));
		
		System.out.println(q);
		
		
	}
}