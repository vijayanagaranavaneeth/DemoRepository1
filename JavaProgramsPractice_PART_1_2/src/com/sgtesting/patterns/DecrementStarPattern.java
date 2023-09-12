package com.sgtesting.patterns;

public class DecrementStarPattern 
{

	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("*  ");
			}
			System.out.println();
		}
	}

}
