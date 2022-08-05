package File_handle;

import java.io.File;
import java.util.Scanner;

public class sea_file 
{
	sea_file()
	{
		search_file();
	}

	public void search_file()
	{
		System.out.println("---------------------------------------------------------------------");
		System.out.print("Operation: Searching a file");
		System.out.println();
		String path= "";
		System.out.print("\nEnter the Folder path: ");
		Scanner s = new Scanner(System.in);
		path = s.nextLine();
		System.out.println();
		System.out.print("\nEnter the file name to be searched: ");
		String file_name = s.nextLine();
		System.out.println();
		File f = new File(path);
		File flist[] = f.listFiles();
		int flag =0;
		for(File ff : flist)
		{
			if(ff.getName().equals(file_name))
			{
				flag += 1;
				break;
			}
			
		}
		if(flag == 1)
		{
			System.out.println("File is found");
		}
		else
		{
			System.out.println("File not found");
		}
		System.out.println("---------------------------------------------------------------------");
		
	}
}