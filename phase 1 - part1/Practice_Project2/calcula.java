package Assisted_Practice2;

import java.util.Scanner;

public class calcula 
{
	
	public static int add(int a, int b)
	{
		return(a+b);
	}
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int input;
		int count = 0;
		System.out.print("Enter the count of numbers : ");
		count = s.nextInt();
		int temp1 = 0;
		char ope = ' ';
		while(count!=0)
		{
			System.out.print("Enter the input number: ");
			input = s.nextInt();
			if(count!=1)
			{
				System.out.print("Enter the operator : ");
				ope = s.next().charAt(0);
			}
			if(ope=='+')
			{
				temp1 = temp1+input;
			}
			else if(ope=='-')
			{
				temp1 = temp1-input;
			}
			else if(ope=='*')
			{
				temp1 = temp1-input;
			}
			else if(ope=='/')
			{
				temp1 = temp1-input;
			}
			else
			{
				System.out.println("Enter a valid operator");
				break;
			}
			count --;			
		}
		System.out.println(temp1);
	}
	
}
	
