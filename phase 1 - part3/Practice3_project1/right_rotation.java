package Practice3_project1;

public class right_rotation 
{
	public static void main(String[] args)
	{
		int arr[] = new int[] {1,2,3,4,5};
		int n = 5;
		System.out.print("This is the original array: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int rotate=0;rotate<n;rotate++)
		{
			System.out.println("In"+" "+(rotate+1)+" Rotation");
			int last,j;
			last = arr[arr.length-1];
			for(j=arr.length-1;j>0;j--)
			{
				arr[j]=arr[j-1];
			}
			arr[0] = last;
			System.out.print("\t");
			for(int p=0;p<arr.length;p++)
			{
				System.out.print(arr[p]+" ");
			}
			System.out.println();
		}
		System.out.println("After 5 right rotations: ");
		System.out.print("\t");
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k]+" ");
		}
	}
	
}