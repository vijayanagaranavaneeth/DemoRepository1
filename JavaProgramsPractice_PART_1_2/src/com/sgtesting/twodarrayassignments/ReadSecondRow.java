package com.sgtesting.twodarrayassignments;


public class ReadSecondRow {

	public static void main(String[] args) 
	{
		int l[ ] [ ]= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("read");    
		for(int i=2; i<l.length;i++)
		{
			for(int j=0; j<l[i].length;j++)
			{
				System.out.print(l[i][j]+" ");
			}
			
			System.out.println("read1");
			for(int m=0;m<l.length-2;m++)
			{
				for(int k=0;k<l[m].length;k++)
				{
					System.out.print(l[m][k]+" ");
				}
			}
			System.out.println();
		}

	}

}
