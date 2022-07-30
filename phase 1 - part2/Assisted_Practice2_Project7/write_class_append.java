package Practice2_Project7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class write_class_append
{
	public static void main(String[] main) throws IOException
	{
		String path = "D:\\Entertainment\\";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the file to be created : ");
		String file_name = s.nextLine();
		String file_path = path+file_name;
		FileWriter f1 = new FileWriter(file_path,true);
		f1.write("how are you?");
		f1.close();		
	}
}