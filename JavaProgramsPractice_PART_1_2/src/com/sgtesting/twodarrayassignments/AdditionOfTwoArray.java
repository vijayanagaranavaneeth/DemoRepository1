package com.sgtesting.twodarrayassignments;

public class AdditionOfTwoArray
{

	public static void main(String[] args)
	{
		int x[][]= {{10,20,30},{40,50,60}};
		int y[][] = {{1,2,3},{4,5,6}};
		int z[][]=new int[x.length][x[0].length];
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{                                                          
				z[i][j]=x[i][j]-y[i][j];

			}
		}
		for(int k=0;k<z.length;k++)
		{
			for(int l=0;l<z[k].length;l++)
			{
				System.out.print(z[k][l]+ "   ");
			}
		}
		System.out.println();

	}

}
