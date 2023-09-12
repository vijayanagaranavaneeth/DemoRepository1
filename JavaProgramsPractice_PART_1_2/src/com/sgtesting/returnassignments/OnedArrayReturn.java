package com.sgtesting.returnassignments;
class Onearr
{
	int [] numbers(int a[])
	{
		//int a[]= {1,2,3,4,5,6,7,8};
		return a;
	}

	/*public int[] Array(int[] arr) {
		// TODO Auto-generated method stub
		return null;
	}*/
}


public class OnedArrayReturn 
{

	public static void main(String[] args) 
	{
		Onearr p=new Onearr();
		int arr[]= {1,2,3,4,5,6,7,8};
		int x[]=p.numbers(arr);
		for (int i=0;i<x.length/2;i++)
		{
			System.out.println(x[i]);
		}
	}

}
