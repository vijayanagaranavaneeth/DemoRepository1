package com.sgtesting.twodarrayassignments;

/*3.create a 2D string array read the element from 
 * String array using while loop */
public class ArrWhilestring 
{

	public static void main(String[] args) 
	{
		String s[][]= {{"void","main","length"},{"String","args","Array"},{"one","two","three"}};
		int i=0;
		while(i<s.length-2)
		{
			int j=0;
			while(j<s[i].length-2)
			{
			System.out.println(s[0][2]+"    ");
			System.out.println(s[1][1]+"    ");
			System.out.println(s[2][0]+"    ");
			j++;
			}
			System.out.println();
			i++;
		}
		

	}

}
