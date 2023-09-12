package com.sgtesting.twodarrayassignments;

public class ArraytwoStoreOneDarray1 
{

	public static void main(String[] args) 
	{
		int x[][]= {{10,20,30},{40,50,60}};
		int y[]=new int [x.length*x[0].length];
		int n=0;
		for(int i=0;i<x.length;i++)
		{
			
			for(int j=0;j<x[i].length;j++)
			{
				y[n]=x[i][j];
				n++;
			}
			
		}
		for(int z=0;z<y.length;z++)
		{
			System.out.print(y[z]+"    ");
		}
         System.out.println();
	}

}
