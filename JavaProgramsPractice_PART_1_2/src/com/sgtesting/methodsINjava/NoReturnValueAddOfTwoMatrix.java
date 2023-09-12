package com.sgtesting.methodsINjava;
//PERFORM THE ADDITION OF 2 MATRIX "WITHOUT" USING "REYURN CONCEPT"
class Matrixaddition
{
	void TwodArrAdd(int x[][],int y[][])
	{
		for(int a=0;a<x.length;a++)
		{
			for(int b=0;b<x[a].length;b++)
			{
				int res=x[a][b]+y[a][b];
				System.out.print(res+"   ");
			}
			System.out.println();
		}
	}
}

public class NoReturnValueAddOfTwoMatrix 
{

	public static void main(String[] args) 
	{
		Matrixaddition q=new Matrixaddition();
		int i[][]= {{1,2,3},{4,5,6}};
		int j[][]= {{10,20,30},{40,50,60}};
		q.TwodArrAdd(i,j);
	}

}
