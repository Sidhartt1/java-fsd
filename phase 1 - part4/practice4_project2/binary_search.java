package practice4_project2;

import java.util.Arrays;


public class binary_search 
{
	public int bin_search(int a[],int val,int start,int end)
	{
		if(a.length<1 || start>end)
		{
			System.out.println("Invalid array");
		}
		int mid = (start+end)/2;
		if(a[mid]==val)
		{
			return mid;
		}
		else if(val<a[mid])
		{
			return bin_search(a,val,start,mid-1);
		}
		else 
		{
			return bin_search(a,val,mid+1,end);
		}
		
	}
	
	
	public static void main(String[] args)
	{
		int arr[] = new int[] {1,4,2,3,5};
		Arrays.sort(arr);
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		int sea = 5;
		binary_search bs = new binary_search();
		int index = bs.bin_search(arr,sea,0,arr.length-1);
		System.out.println("index"+index);
		
		
	}
}