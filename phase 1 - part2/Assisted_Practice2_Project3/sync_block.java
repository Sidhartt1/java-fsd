package Practice2_Project3;

class sample
{
	void printuh(int n)
	{
		int count =0;
		synchronized(this)
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

class thr3 extends Thread
{
	sample s;
	thr3(sample s)
	{
		this.s = s;
	}
	public void run()
	{
		s.printuh(1);
	}
}

class thr4 extends Thread
{
	sample s;
	thr4(sample s)
	{
		this.s = s;
	}
	public void run()
	{
		s.printuh(2);
	}
}

public class sync_block
{
	public static void main(String[] args)
	{
		sample s = new sample();
		thr3 t1 = new thr3(s);
		thr4 t2 = new thr4(s);
		t1.start();
		t2.start();
	}
}