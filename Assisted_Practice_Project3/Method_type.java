package Practice_Project3;

public class Method_type 
{
	public int mulNum(int a, int b)
	{
		int result = a*b;
		return result;
	}
	
	public static void main(String[] args)
	{
		int num1 = 10;
		int num2 = 20;
		Method_type mul = new Method_type();
		System.out.println(mul.mulNum(num1,num2));
	}
}
