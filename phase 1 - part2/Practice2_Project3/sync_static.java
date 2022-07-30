package Practice2_Project3;

class sample1
{
	synchronized static void printuh(int n)
	{
		int count =0;
		{
			for(int i=0; i<5;i++)
			{
				System.out.println("You are "+count+" thread");
				count++;
			}
			try
			{
				Thread.sleep(500);
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}

class thr5 extends Thread
{
	public void run()
	{
		sample1.printuh(1);
	}
}

class thr6 extends Thread
{
	public void run()
	{
		sample1.printuh(2);
	}
}

public class sync_static
{
	public static void main(String[] args)
	{
		sample1 s1 = new sample1();
		thr5 t1 = new thr5();
		thr6 t2 = new thr6();
		t1.start();
		t2.start();
	}
}