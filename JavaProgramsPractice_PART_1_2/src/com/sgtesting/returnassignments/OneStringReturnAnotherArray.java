package com.sgtesting.returnassignments;
class StringArr
{
	String [] string()
	{
		String a[]= {"hello","world"};
		return a;
	}
}
public class OneStringReturnAnotherArray 
{

	public static void main(String[] args) 
	{
		StringArr u=new StringArr();
		String a[]=u.string();
		for (int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}

}
