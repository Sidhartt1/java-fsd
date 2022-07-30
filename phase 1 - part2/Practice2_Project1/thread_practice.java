package Practice2_Project1;

public class thread_practice extends Thread
{
	public void run()
	{
		System.out.println("You have initiated the thread '"+Thread.currentThread().getName()+"' with the priority : "+Thread.currentThread().getPriority());
	}	
	public static void main(String[] args)
	{
		thread_practice t1 = new thread_practice();
		thread_practice t2 = new thread_practice();
		t1.setName("Sidhu");
		t2.setName("Sankar");
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		t1.start();
		t2.start();
	}
}