package Practice2_Project8_iii;

class Company
{
	Company()
	{
		System.out.print("Company ");
	}
}

class manager extends Company
{
	manager()
	{
		super();
		System.out.print("- manager");
	}
	
}

class worker extends Company
{
	worker()
	{
		super();
		System.out.println("-worker");
	}
}

public class super_key 
{
	public static void main(String[] main)
	{
		worker w = new worker();
		manager m = new manager();
	}
	
}