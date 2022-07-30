package Practice2_Project7;

import java.io.File;
import java.util.Scanner;

public class search_file 
{
	public static void main(String[] args)
	{
		String path = "D:\\Entertainment\\";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the file to be searched: ");
		String search_file = s.nextLine();
		File f = new File(path);
		File files[] = f.listFiles();
		int flag = 0;
		for(File ff : files)
		{
			if(ff.getName().equals(search_file))
			{
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("File is found");
		}
		else
		{
			System.out.println("File is not found");
		}
		
	}
}