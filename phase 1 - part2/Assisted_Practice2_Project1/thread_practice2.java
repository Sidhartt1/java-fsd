package Practice2_Project1;

public class thread_practice2 implements Runnable
{
	public void run()
	{
		System.out.println("Ho");
	}
	public static void main(String[] args)
	{
		thread_practice2 t1 = new thread_practice2();
		Thread t = new Thread(t1);
		t.start();
	}
}