package com.sgtesting.inheritance;
class matmat
{
	void addition (int x,int y)
	{
		int res=(x+y);
		System.out.println("ADDITION:"+res);
	}
}
class matmat1 extends matmat
{
	void multiplication (int x,int y)
	{
		int res=(x*y);
		System.out.println("MULTIPLICATION:"+res);
	}
}
public class InheritanceSimpleInheritance1 
{

	public static void main(String[] args) 
	{
		 matmat1 m=new matmat1();
		 m.addition(10,10);
		 m.multiplication(1,1);
	}

}
