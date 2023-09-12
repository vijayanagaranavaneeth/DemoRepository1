package com.sgtesting.abstracts;
abstract class A
{
	abstract void aMathtype11(String names);
	abstract void aOperatorused11(String names);
	void mathmul(int res)
	{

	}

}

class B extends A
{
	void  aMathtype11(String names)
	{
		System.out.println("TYPE OF MATH:"+names);
	}
	void  aOperatorused11(String names)
	{
		System.out.println("OPERATOR TYPE OF MATH:"+names);
	}
}
class C extends B
{
	void mathaddition1(int x,int y)
	{
		int res=(x+y);
		{
			System.out.println("MATHADDITION:"+res);
		}

	}
}

class D extends A
{
	void  aMathtype11(String names)
	{
		System.out.println("TYPE OF MATH:"+names);
	}
	void  aOperatorused11(String names)
	{
		System.out.println("OPERATOR TYPE OF MATH:"+names);
	}
	 static void multiplication(int a,int b)
	{
		int res =(a*b);
		System.out.println("MULTIPLICATION OF a AND b:"+res);

	}
}

public class AssignmentAbstractHybrid 
{

	public static void main(String[] args) 
	{
		C u=new C();
		u.aMathtype11("basic");
		u.aOperatorused11("plus");
		u.mathaddition1(10,10);
 
		D t=new D();
		t.aMathtype11("basic");
		t.aOperatorused11("Multiply");
		D.multiplication(10,10);
 


	}

}
