package Practice_Project1;

public class explicit 
{
	public static void main(String[] args)
	{
		byte a = 10;
		short b = 20;
		int c = 30;
		long d = 40;
		float e = 50;
		double f = 60.0;
		char ch = 'a';
		
		//explicit type casting
		short sh = (short) a;
		System.out.println(sh);
		
		int in = (int) b;
		System.out.println(in);
		
		long lo = (long) c;
		System.out.println(lo);
		
		float fl = (float) d;
		System.out.println(fl);
		
		double db = (double) e;
		System.out.println(db);
		
		int in1 = (int) ch;
		System.out.println(in1);
	}
}