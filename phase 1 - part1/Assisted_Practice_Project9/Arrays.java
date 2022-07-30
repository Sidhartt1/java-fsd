package Practice_Project9;

public class Arrays 
{
	int rollNo;
	String Name;
	
	Arrays(int rollNo, String Name)
	{
		this.rollNo = rollNo;
		this.Name = Name;
		Display();
	}
	
	void Display()
	{
		System.out.println("The Employee Roll Number : "+rollNo+"\n"+"The Employee Name : "+Name);
	}
	
	
	public static void main(String[] args)
	{
		///
		int a[] = new int[5];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		for(int i = 0; i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		
		///
		int arr[] = {1,2,3,4,5};
		for(int j = 0; j<a.length;j++)
		{
			System.out.print(a[j]+" ");
		}
		
		///
		Arrays emp[] = new Arrays[5];
		emp[0] = new Arrays(12345,"sidhu");
		emp[1] = new Arrays(5678,"Sankar");
		
						
	}
}