package com.sgtesting.inheritance;
class Bmaths02
{
	void addition (int x,int y)
	{
		int res=(x+y);
		System.out.println("ADDITION:"+res);
	}

}
	class Bmaths12 extends Bmaths02
	{
		void multiplication (int x,int y)
		{
			int res=(x*y);
			System.out.println("multiplication:"+res);
		}
	}
	
		class Bmaths21 extends Bmaths12
		{
			void subtraction (int x,int y)
			{
				int res=(x-y);
				System.out.println("subtraction:"+res);
			}
		}
		class Bmaths30 extends Bmaths02
		{
			void division (int x,int y)
			{
				int res=(x/y);
				System.out.println("Division:"+res);
			}
		}
	
public class InheritanceHybridLevelInheritance 
{

	public static void main(String[] args) 
	{
		Bmaths30 h=new Bmaths30();
		h.division(20, 10);
		h.addition(10, 10);
		
		Bmaths21 h1=new Bmaths21();
		h1.addition(10, 10);
		h1.subtraction(10, 20);
		
		Bmaths12 h2=new Bmaths12();
		h2.multiplication(10, 10);
		h2.addition(10, 10);
		
		
		
	}

}
