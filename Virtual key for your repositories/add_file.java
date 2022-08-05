package File_handle;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class add_file 
{
	add_file() throws IOException
	{
		add();
	}
	public void add() throws IOException
	{
		System.out.println("---------------------------------------------------------------------");
		System.out.println("***Operation : Adding a file***");
		System.out.println();
		String path = "";
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your destination path: ");
		path = s.nextLine();
		System.out.println();
		System.out.print("Enter your file name: ");
		String file_name = s.nextLine();
		System.out.println();
		String file_path = path+file_name;
		File f = new File(file_path);
		boolean b = f.createNewFile();
		if(f!=null)
		{
			System.out.println("Your file is created in the destination!!");
		}
		System.out.println("---------------------------------------------------------------------");
	}
}