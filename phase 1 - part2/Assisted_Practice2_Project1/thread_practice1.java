package Practice2_Project1;

class Nameprint
{
	private int a = 10;
	synchronized public void startPrint(int n)
	{
		for(int i=0;i<a;i++)
		{
			if(this.a<n)
			{
				try
				{
					wait();
				}catch(Exception e)
				{
					System.out.println(e);
				}
			}
			a--;
		}
		System.out.println("Your name"+a);
	}
	synchronized public void resumePrint()
	{
		this.a += 10;
		System.out.println("Reached resume");
		notify();
	}
}

public class thread_practice1 extends Thread
{
	public static void main(String[] args)
	{
		Nameprint n = new Nameprint();
		new Thread()
		{
			@Override public void run()
			{
				n.startPrint(20);
			}
		}.start();
		new Thread()
		{
			@Override public void run()
			{
				n.resumePrint();
			}
		}.start();
	}
}