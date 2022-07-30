package Assisted_Practice1;

import java.util.Scanner;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class email_valid 
{
	public static int check_conditions(String mail)
	{
		if(mail.isEmpty())
		{
			return -1;
		}
		else if(!mail.isEmpty())
		{
			if(mail.contains(" "))
			{
				System.out.println("Not valid email\n\tContains Space");
				return -1;
				
			}
			
			for(int i = 0; i<mail.length();i++)
			{
				if(Character.isUpperCase(mail.charAt(i)))
				{
					System.out.println("Not valid email\n\tContains uppercase");
					return -1;
				
				}
			}
			if(!mail.contains(".com") || !mail.contains("@"))
			{
				System.out.println("Not valid email\n\t Enter a valid email");
				return -1;
			}
			
			Pattern p = Pattern.compile("^[a-z]");
			Matcher m = p.matcher(mail);
			if(!m.find())
			{
				System.out.println("Not a valid email\n\tstart with a alphabetic character");
				return -1;
			}
			return 1;
		}
		return 1;
		
	}	
	
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int input;
		System.out.println("Enter the number of mails : ");
		input = s.nextInt();
		System.out.println();
		String arr[] = new String[input];
		for (int i = 0; i< input; i++)
		{
			System.out.println("Enter mail id : ");
			String name = s.next();
			int result = check_conditions(name);
			if(result == 1)
			{
				System.out.println("Valid.Taken into array");
				System.out.println();
				arr[i] = name;
			}
			else if(result == -1)
			{
				System.out.println("Enter a valid mail to add in array");
				System.out.println();
			}
		}
		System.out.println("The mails in the array are :");
		for(int j = 0; j<arr.length; j++)
		{
			System.out.println(arr[j]+" ");
		}
		
		System.out.println("Enter the mail to search : ");
		String search_mail = s.next();
		for(int in = 0; in<arr.length; in++)
		{
			if(search_mail.equals(arr[in]))
			{
				System.out.println("Yes it is found in the String array");
				System.out.println();
				break;
			}
			else
			{
				System.out.println("Not found in the String array");
				System.out.println();
			}
		}
	}
}
