package com.sgtesting.twodarrayassignments;

public class WapAdditionOfTwoMAtrix 
{

	public static void main(String[] args) 
	{
     int x[][]= {{1,2,3},{4,5,6}};
     int y[][]= {{1,2,3},{4,5,6}};
     System.out.println("ADDITION OF TWO MATRIX:");
     for(int i=0;i<x.length;i++)
     {
    	 for(int j=0;j<x[i].length;j++)
    	 {
    		 int n=x[i][j]*y[i][j];
    		 
    		 System.out.print(n+"    ");
    	 }
    	 System.out.println();
     }

	}

}
