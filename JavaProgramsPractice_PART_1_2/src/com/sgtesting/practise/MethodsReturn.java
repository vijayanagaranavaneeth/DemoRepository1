package com.sgtesting.practise;

class ReturnMethods
{
	int res;
	int Addition()
	{
		int a=5,b=6;
		res=a+b;
		return res;
		
	}
	
	public void Multiplication()
	{
		int c=5,res1;
		res1=res*c;
		System.out.println("Multiplication:"+res1);
	}
	
	public void subtraction()
	{
		int d=5, res2;
		res2=res-d;
		System.out.println("Subtraction:"+res2);
	}
}


public class MethodsReturn {

	public static void main(String[] args) 
	{
		ReturnMethods obj=new ReturnMethods();
		int result=obj.Addition();
		System.out.println("Addition:"+result);
		obj.Multiplication();
		obj.subtraction();
		
		
		
	}

}
