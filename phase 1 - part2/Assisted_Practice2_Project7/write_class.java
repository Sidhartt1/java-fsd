package Practice2_Project7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class write_class 
{
	public static void main(String[] main) throws IOException
	{
		String path = "D:\\Entertainment\\";
		Scanner s = new Scanner(System.in);
		String Filename = s.nextLine();
		String FilePath = path+Filename;
		File f1 = new File(FilePath);
		boolean b = f1.createNewFile();
		if(b)
		{
			System.out.println("New file created");
		}
		FileWriter f = new FileWriter(FilePath);
		if(f!=null)
		{
			System.out.println("Created");
		}
		String get_input = s.nextLine();
		f.write(get_input);
		f.close();
		
	}
}