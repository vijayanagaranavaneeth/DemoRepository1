 package com.sgtesting.returnassignments;
class Onearr1
{
	int [] Array(int ar[])
	{
		//int a[]= {1,2,3,4,5,6,7,8};
		return ar;
	}
}
public class OneArrSecondHAlf 
{

	public static void main(String[] args) 
	{
		Onearr1 p=new Onearr1();
		int arr[]= {1,2,3,4,5,6,7,8};
		int x[]=p.Array(arr);
		
		for (int i=x.length/2;i>=0;i--)
		{
			System.out.println(x[i]);
		}
	}

}
