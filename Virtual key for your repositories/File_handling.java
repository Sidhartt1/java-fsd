package File_handle;
import java.io.IOException;
import java.util.Scanner;
public class File_handling 
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("         ----File handling operations----       \n");
		System.out.println("                 Operations:\n\nEnter 1 : Display all files in the folder\nEnter 2: Perform *sub-operations mentioned below\nEnter 3: End the operation\n");
		System.out.println("            (((Sub-operations*))): \n\n\t1.To create a file\n\t2.To delete a file\n\t3.To search for a file\n\t4.Return to main Operation list\n");
		Scanner s = new Scanner(System.in);
		boolean temp1 = true;
		while(temp1)
		{
			System.out.println();
			System.out.print("-----Enter your operation to be performed: ");
			int opt = s.nextInt();
			System.out.print("\n");
			System.out.println("---------------------------------------------------------------------");

			switch(opt)
			{
			case 1:
			{
				disp dp = new disp();
				break;
			}
			case 2:
			{
				boolean temp = true;
				while(temp)
				{
					System.out.println();
					System.out.print("-----Enter your suboperation option: ");
					int opt2 = s.nextInt();
					System.out.println("---------------------------------------------------------------------");

					switch(opt2)
					{
					case 1:
					{
						add_file ad = new add_file();
						break;
					}
					case 2:
					{
						del_file df = new del_file();
						break;
					}
					case 3:
					{
						sea_file sf = new sea_file();
						break;
					}
					case 4:
					{
						temp = false;
						break;
					}
					default:
					{
						System.out.println("Enter a valid Sub operations!!");
						break;
					}
					}
				}
				
			}
			case 3:
			{
				temp1 = false;
				System.exit(0);
				
			}
			default:
			{
				System.out.println("Enter a valid operation!!");
			}
			}
		}
	}
}