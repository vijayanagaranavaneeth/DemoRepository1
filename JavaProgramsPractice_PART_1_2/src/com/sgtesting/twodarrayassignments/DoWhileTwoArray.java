package com.sgtesting.twodarrayassignments;

/*4.create a 2D string array read the element from 
 * String array using dowhile loop */

public class DoWhileTwoArray 
{

	public static void main(String[] args) 
	{
		long h[][]= {{10,20,30},{40,50,60},{70,80,90}};
		int i=0;
		do
		{
			int j=0;
			do
			{
				System.out.print(h[i][j]+" ");
				j++;
			}while(j<h[i].length-2);
			System.out.println();
			i++;
		}while(i<h.length);




	}

}
