package com.sgtesting.twodarrayassignments;

/*5.create a 2D INTEGER DOUBLE array read the element from 
 * String array using dowhile loop */

public class DoubleArrayWhileLoop {

	public static void main(String[] args) 
	{
		double n[] []={{0.1,0.2,0.3},{1.1,1.2,1.3},{2.1,2.2,3.3},{3.1,3.2,3.3}};
		   int i=0;
		   while(i<n.length)
		{
			int j=0;
			while(j<n[i].length)
			{
				System.out.print(n[i][j]+" ");
				j++;
			}
			System.out.println();
			i++;
			
		}
	}

}
