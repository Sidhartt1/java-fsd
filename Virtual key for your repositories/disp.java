package File_handle;

import java.io.File;
import java.util.Scanner;

public class disp 
{
	disp()
	{
		disp_files();
	}
	public void disp_files()
	{
		System.out.println("---------------------------------------------------------------------");
		System.out.print("***Operation: Displaying the files***");
		Scanner s = new Scanner(System.in);
		System.out.print("\n");
		System.out.print("\nEnter the folder path: ");
		String folder_path = s.nextLine();
		System.out.println();
		File f = new File(folder_path);
		File flist[] = f.listFiles();
		for(File ff : flist)
		{
			System.out.println(ff.getName());
		}
		System.out.println("---------------------------------------------------------------------");
	}
}