package Practice2_Project8_ii;

public class overload_ing 
{
	public int add(int a,int b)
	{
		return a+b;
	}
	
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}
	
	
	public static void main(String[] main)
	{
		overload_ing ol = new overload_ing();
		System.out.println(ol.add(1, 2));
		System.out.println(ol.add(1,2,3));
	}
}