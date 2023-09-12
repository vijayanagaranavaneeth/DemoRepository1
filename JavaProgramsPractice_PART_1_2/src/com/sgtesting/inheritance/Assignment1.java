package com.sgtesting.inheritance;
class maths1
{
	void addition(int x , int y) 
	{
		int res = (x+y);
		System.out.println("Addition reuslt :" +res);
	}
}

class maths2 extends maths1
{
	void multiplication(int x,int y) 
	{
		int res = (x*y);
		System.out.println("multiplication result:" +res);
	}
}

class maths3 extends maths2
{
	void division(int a , int b) 
	{
		int res = (a/b);
		System.out.println("division result:" +res);
	}
}

public class Assignment1 
{

	public static void main(String[] args) 
	{
		maths3 o1  =new maths3();
		o1.addition(100, 300);
		o1.division(10, 2);
		o1.multiplication(12,20);
	
	}

}
