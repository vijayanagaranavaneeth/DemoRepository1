package com.sgtesting.inheritance;
class Bmaths01
{
	void addition (int x,int y)
	{
		int res=(x+y);
		System.out.println("ADDITION:"+res);
	}

}
	class Bmaths11 extends Bmaths01
	{
		void multiplication (int x,int y)
		{
			int res=(x*y);
			System.out.println("multiplication:"+res);
		}
	}
	
		class Bmaths22 extends Bmaths11
		{
			void subtraction (int x,int y)
			{
				int res=(x-y);
				System.out.println("subtraction:"+res);
			}
		}
	
public class InheritanceMultilevelInheritance 
{

	public static void main(String[] args)
	{
		Bmaths22 j=new Bmaths22();
		j.subtraction(10,20);
		j.addition(10, 20);
		
		Bmaths11 j1=new Bmaths11();
		j1.multiplication(10,20);
		j1.addition(10, 20);
		
	}

}
