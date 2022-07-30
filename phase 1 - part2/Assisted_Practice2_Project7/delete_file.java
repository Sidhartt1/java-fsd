package Practice2_Project7;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class delete_file 
{
	public static void main(String[] args) throws IOException
	{
		String path = "D:\\Entertainment\\";
		Scanner s = new Scanner(System.in);
		String file_name = s.nextLine();
		String file_path = path+file_name;
		File f1 = new File(file_path);
		boolean b = f1.createNewFile();
		f1.delete();
	}
}