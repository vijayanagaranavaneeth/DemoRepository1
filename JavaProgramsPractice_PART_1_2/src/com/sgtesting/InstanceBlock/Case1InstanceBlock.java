package com.sgtesting.InstanceBlock;
/*If a class contain instance block,static block ,no args constructor
 * which one will execute first?
 */
class TestB
{
	TestB()
	{
		System.out.println("NO ARGS CONSTRUCTOR");
	}
	{
		System.out.println("IT IS A INSTANCE BLOCK");
	}
	static
	{
		System.out.println("IT IS A STATIC BLOCK");
	}
}
public class Case1InstanceBlock 
{

	public static void main(String[] args) 
	{
		TestB h=new TestB();
	}

}
