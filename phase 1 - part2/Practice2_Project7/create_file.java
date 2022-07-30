package Practice2_Project7;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class create_file 
{
	public static void main(String[] main) throws IOException 
	{
		String path = "D:\\Entertainment\\";
		System.out.println("Enter the file name to create : ");
		Scanner s = new Scanner(System.in);
		String fn = s.nextLine();	
		String f1 = path+fn;
		System.out.println(f1);
		File fIle = new File(f1);
		boolean b = fIle.createNewFile();
		if(b)
		{
			System.out.println("File created");
		}
		else
		{
			System.out.println("File not created");
		}
		
		
	}
}