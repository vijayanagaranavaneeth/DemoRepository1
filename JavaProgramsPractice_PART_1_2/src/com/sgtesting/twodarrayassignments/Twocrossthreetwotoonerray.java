package com.sgtesting.twodarrayassignments;

public class Twocrossthreetwotoonerray 
{

	public static void main(String[] args)
	{
		int k=0;
		int x[][]= {{10,20,30},{40,50,60}};
		int y[]=new int[x.length * x[0].length];
		 for(int i=0;i<x.length;i++)
		 {
			 for(int j=0;j<x[i].length;j++)
			 {
				 y[k]=x[i][j];
				 k++;
			 }
			 for(int v1:y)
			 {
				 System.out.print(v1+"  ");
			 }
			 System.out.println();
		 }
	}

}
 
	

