package Practice2_Project8_i;

class bike
{
	bike()
	{
		System.out.println("You have entered the bike zone");
	}
	int speed = 100;
	
	public void disp()
	{
		System.out.println("The speed of the bike is "+speed);
	}
}
class Yamaha extends bike
{
	Yamaha()
	{
		super();
		System.out.println("This is Yamaha bike");
	}
	int speed = 150;
	public void display()
	{
		System.out.println("The normal speed of the bike is: "+super.speed);
		System.out.println("The speed of yamaha bike is: "+speed);
	}
}

public class Cls_obj 
{
	public static void main(String[] args)
	{
		Yamaha y = new Yamaha();
		y.display();
	}
}
