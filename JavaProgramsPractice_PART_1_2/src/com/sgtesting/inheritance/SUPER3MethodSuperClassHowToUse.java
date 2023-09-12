package com.sgtesting.inheritance;

class A1
{
	void show()
	{
		System.out.println("hello");
	}
	
}
class B1 extends A1
{
	
	void show()
	{
		super.show();
		System.out.println("hello world");
		
	}
	
}
public class SUPER3MethodSuperClassHowToUse 
{

	public static void main(String[] args) 
	{
		B1 r =new B1();
		r.show();

	}

}
