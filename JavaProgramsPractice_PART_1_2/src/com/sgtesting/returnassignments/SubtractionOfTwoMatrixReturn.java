package com.sgtesting.returnassignments;



class MatrixSubtractionDemo3
{
	int[][] twodimensionarraysub (int x[][],int y[][])
	{
		int z[][]=new int [x.length][x[0].length];
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				z[i][j]=x[i][j]*y[i][j];
			}
		}
		return z;
	}
}
public class SubtractionOfTwoMatrixReturn 
{

	public static void main(String[] args) 
	{
		MatrixSubtractionDemo3 o=new MatrixSubtractionDemo3();
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]= {{10,20,30},{40,50,60},{70,80,90}};
		int res[][]=o.twodimensionarraysub(a,b);

		//READ sub OF THE RESULT MATRIX
				for(int i=0;i<res.length;i++)
				{
					for(int j=0;j<res[i].length;j++)
					{
						System.out.print(res[j][i]+"   ");
					}
					System.out.println();
				}
				System.out.println("=================");
	}

}
