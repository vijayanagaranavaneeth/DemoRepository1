package com.sgtesting.returnassignments;
class Xxx
{
	int Factorial(int num)
	{
		
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		//System.out.println(fact);
			return fact ;		
	}
}

	
public class FactoDemo 

{

	public static void main(String[] args) 
	{
		Xxx y=new Xxx();
		int res=y.Factorial(5);
		System.out.println(res);
		
       // y.Factorial(10);
	}

}
