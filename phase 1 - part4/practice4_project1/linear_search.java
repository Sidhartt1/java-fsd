package practice4_project1;

public class linear_search 
{
	public static void main(String[] args)
	{
		int a[] = new int[] {1,5,2,4,3};
		int sea = 5;
		int flag = 0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==sea)
			{
				flag +=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not found");
		}
	}
}