package File_handle;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class del_file 
{
	del_file() throws IOException
	{
		del();
	}
	public void del() throws IOException
	{
		System.out.println("---------------------------------------------------------------------");
		System.out.print("***Operation: Deleting a file***\n");
		System.out.println();
		String path = "";
		System.out.print("Enter the file path");
		Scanner s = new Scanner(System.in);
		path = s.nextLine();
		System.out.print("\nEnter the file name to be deleted: ");
		String file_name = s.nextLine();
		System.out.println();
		String file_path = path+file_name;
		File f = new File(file_path);
		f.delete();
		System.out.println("File successfully deleted!!");
		System.out.println("---------------------------------------------------------------------");
	}
}