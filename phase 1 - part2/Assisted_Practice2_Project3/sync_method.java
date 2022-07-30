package Practice2_Project3;

class sync
{
	synchronized void printin(int n)
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i*n);
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

class thr1 extends Thread
{
	sync s;
	thr1(sync s) 
	{
		this.s =s;
	}
	public void run()
	{
		s.printin(10);
	}
}

class thr2 extends Thread
{
	sync s;
	thr2(sync s) 
	{
		this.s =s;
	}
	public void run()
	{
		s.printin(10);
	}
}

public class sync_method
{
	public static void main(String[] args)
	{
		sync s1 = new sync();
		thr1 t1 = new thr1(s1);
		thr2 t2 = new thr2(s1);
		t1.start();
		t2.start();
	}
	
	
}