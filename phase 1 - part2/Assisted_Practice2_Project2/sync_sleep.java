package Practice2_Project2;

class test
{
	synchronized static void printin()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("You entered "+i+" sequence");
			try
			{
				Thread.sleep(1000);
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
	}
}

class thrd extends Thread
{
	public void run()
	{
		test.printin();
	}
}

class thrdt extends Thread
{
	public void run()
	{
		test.printin();
	}
}

public class sync_sleep
{
	public static void main(String[] args)
	{
		thrd t1 = new thrd();
		t1.start();
		thrdt t = new thrdt();
		t.start();
	}
}