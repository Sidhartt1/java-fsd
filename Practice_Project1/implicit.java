package Practice_Project1;

public class implicit 
{
	public static void main(String[] args)
	{
		byte a = 10;
		short b = 20;
		int c = 30;
		long d = 40;
		float e = 50;
		double f = 60;
		char ch = '0' ;
		
		//implicit type casting
		f = e;
		System.out.println(f);
		
		e = d;
		System.out.println(e);
		
		d = c;
		System.out.println(d);
		
		c = b;
		System.out.println(c);
		
		b = a;
		System.out.println(b);
		
		c = ch;
		System.out.println(c);
	
	}
}
