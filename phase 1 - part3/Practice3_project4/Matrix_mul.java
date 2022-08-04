package Practice3_project4;

public class Matrix_mul 
{
	public static void main(String[] args)
	{
		int a[][] = new int[][] {{1,2},{4,5}};
		int b[][] = new int[][] {{3,2},{6,5}};
		int r1 = 2;
		int r2 =2;
		int c1 =2;
		int c2=2;
		int c[][] = new int[r1][c2];
		
		if(r1!=c2)
		{
			System.out.println("Multiplication not possible");
		}
		else
		{
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c2;j++)
				{
					for(int k=0;k<r2;k++)
					{
						c[i][j] += (a[i][k]*b[k][j]);
					}
				}
			}
		}
		for(int x =0;x<r1;x++)
		{
			for(int y=0;y<c1;y++)
			{
				System.out.print(c[x][y]+" ");
			}
			System.out.println();
		}
	}
}