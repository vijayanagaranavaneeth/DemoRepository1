package com.sgtesting.methodsINjava;
/*APPLY THE RETURN ON ADDITION OF 2 MATRIX AND RETURN THE RESULT BASED ON 
 * THE RETURN VALUE,YOU CAN ACHIVE N NUMBER OF TASK.*/
class MatrixAdditionDemo2
{
	int[][] twodimensionarrayadd (int x[][],int y[][])
	{
		int z[][]=new int [x.length][x[0].length];
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				z[i][j]=x[i][j]+y[i][j];
			}
		}
		return z;
	}
}
public class ProgramReturnAddOfTwoMatrix 
{

	public static void main(String[] args) 
	{
		MatrixAdditionDemo2 o=new MatrixAdditionDemo2();
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]= {{10,20,30},{40,50,60},{70,80,90}};
		int res[][]=o.twodimensionarrayadd(a,b);

		//READ TRANSPOSE OF THE RESULT MATRIX
		for(int i=0;i<res.length;i++)
		{
			for(int j=0;j<res[i].length;j++)
			{
				System.out.print(res[j][i]+"   ");
			}
			System.out.println();
		}
		System.out.println("=================");

		//READ REVERSE OF THE RESULT MATRIX
		for(int i=res.length-1;i>=0;i--)
		{
			for(int j=res[i].length-1;j>=0;j--)
			{
				System.out.print(res[i][j]+"   ");
			}
			System.out.println();
		}
		System.out.println("=================");

		//READ ONLY FIRST ROW OF THE RESULT ARRAY
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[0][i]+"   ");
		}
		System.out.println();
		System.out.println("=================");


		//READ ONLY THIRD ROW OF THE RESULT ARRAY
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[2][i]+"   ");
		}
		System.out.println();
		System.out.println("=================");
	}

}
