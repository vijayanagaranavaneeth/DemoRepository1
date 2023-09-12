package com.sgtesting.returnassignments;
class Assignelement
{
	int[] twodimensionarray(int d[][])
	{

		int z[]=new int [d.length*d[0].length];
		int n=0;
		for(int i=0;i<d.length;i++)
		{
			for(int j=0;j<d[i].length;j++)
			{
				z[n]=d[i][j];
				n++;
			}

		}

		return z;
	}

}

public class TwoArrayOneArrayReturn 
{

	public static void main(String[] args) 
	{

		Assignelement b=new Assignelement();
		int d[][]= {{10,20,30},{40,50,60}};
		int y[]=b.twodimensionarray(d);

		for(int i=0;i<y.length;i++)
		{
			System.out.print(y[i]+"   ");
		}

	}

}
