package com.sgtesting.constructoroverloadingassignment;
//WAP to verify factorial of given number? 


class Maths
{
	Maths(int num)
	{
		int fact=1;
		for(int i=num;i>=1;i--) 
		{
			fact=fact*i;
		}
		System.out.println(+num+"is"+fact);
	}
}
public class FactorialNumber 
{

	public static void main(String[] args) 
	{
		Maths m=new Maths(3);

	}

}
