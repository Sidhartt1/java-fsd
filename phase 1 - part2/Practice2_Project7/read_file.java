package Practice2_Project7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class read_file 
{
	public static void main(String[] args) throws IOException
	{
		String path = "D:\\Entertainment\\";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the file Name: ");
		String file_name = s.nextLine();
		String file_path = path+file_name;
		FileReader f = new FileReader(file_path);
		int i =0;
		while((i=f.read())!=-1)
		{
			System.out.print((char)i);
		}
		f.close();
		
		
	}
	
	
}