package com.sgtesting.inheritance;
class A2
{
	A2(int a)
	{
		System.out.println("hello"+a);
	}
}
class B2 extends A2
{
	
	B2()
	{
		/* if we use default constructor no need to use super
		 * keyword in the sub class,java compiler itself create the super keyword 
		 * by default to access the super class  .
		 * but in parameterized constructor if we want to access the super class 
		 * we must use the super keyword with the variable value */
		super(100);
		System.out.println("hello world");
	}
	
}
public class SUPER1ConstructorSuperClassHowToUse 
{

	public static void main(String[] args) 
	{
		B2 r=new B2();
	}

}
