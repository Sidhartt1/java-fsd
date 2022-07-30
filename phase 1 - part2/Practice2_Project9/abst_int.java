package Practice2_Project9;

interface company
{
	public abstract void display();
}

interface worker extends company
{
	public abstract void display_work();
}

interface manager extends company
{
	public abstract void display_manage();
}

class ComImp implements worker,manager,company
{
	public void display()
	{
		System.out.println("This is our company");
	}
	public void display_work()
	{
		System.out.println("I am a worker");
	}
	public void display_manage()
	{
		System.out.println("I am a manager");
	}
}
public interface abst_int 
{
	public static void main(String[] args)
	{
		ComImp ci = new ComImp();
		ci.display();
		ci.display_manage();
		ci.display_work();
	}
}

