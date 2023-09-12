package com.sgtesting.inheritance;
class Bmaths
{
	void addition (int x,int y)
	{
		int res=(x+y);
		System.out.println("ADDITION:"+res);
	}

}
	class Bmaths1 extends Bmaths
	{
		void multiplication (int x,int y)
		{
			int res=(x*y);
			System.out.println("multiplication:"+res);
		}
	}
	
		class Bmaths2 extends Bmaths
		{
			void subtraction (int x,int y)
			{
				int res=(x-y);
				System.out.println("subtraction:"+res);
			}
		}
	

public class InheritanceHierarchicalInheritance 
{

	public static void main(String[] args) 
	{
		
		Bmaths1 b=new Bmaths1();
		b.addition(10,10);
		b.multiplication(10,10);
		
		Bmaths2 b1=new Bmaths2();
		b1.addition(10,10);
		b1.subtraction(10,10);
		
	}

}
