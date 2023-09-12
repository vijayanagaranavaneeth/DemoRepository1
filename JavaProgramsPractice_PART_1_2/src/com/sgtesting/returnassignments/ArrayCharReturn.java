package com.sgtesting.returnassignments;
class ChaReturn
{
	char[][] twodimensionarraysub (char x[][])
	{
		char z[][]=new char [x.length][x[0].length];
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				z[i][j]=x[i][j]; 
			}
		}
		return z;
	}
}
public class ArrayCharReturn 
{

	public static void main(String[] args) 
	{
		ChaReturn o=new ChaReturn();
		char a[][]= {{'a','b','c'},{'d','e','f'},{'g','h','i'}};
		
		char res[][]=o.twodimensionarraysub(a);
		
		for(int i=res.length-1;i>=0;i--)
		{
			for(int j=res[i].length-1;j>=0;j--)
			{
				System.out.print(res[j][i]+"   ");
			}
			System.out.println();
		}
		System.out.println("=================");
	}

}
