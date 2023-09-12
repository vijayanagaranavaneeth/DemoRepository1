package com.sgtesting.returnassignments;
class MatrixTransposeDemo3
{
	int[][] twodimensionarraytranspose (int x[][])
	{
		int z[][]=new int [x.length][x[0].length];
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				z[i][j]=x[i][j];
			}
		}
		return z;
	}
}
public class TransposeReturn 
{

	public static void main(String[] args) 
	{
		MatrixTransposeDemo3 u=new MatrixTransposeDemo3();
		
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		int res[][]=u.twodimensionarraytranspose(a);

		//READ TRANSPOSE OF THE RESULT MATRIX
				for(int i=0;i<res.length;i++)
				{
					for(int j=0;j<res[i].length;j++)
					{
						System.out.print(res[i][j]+"   ");
					}
					System.out.println();
				}
				System.out.println("=================");
    }

}
