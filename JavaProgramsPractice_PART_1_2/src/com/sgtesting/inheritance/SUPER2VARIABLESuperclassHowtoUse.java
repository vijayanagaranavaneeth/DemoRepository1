package com.sgtesting.inheritance;
class A
{
	int a=10;
	
}
class B extends A
{
	int a=20;
	void show()
	{
		System.out.println(super.a);
		System.out.println(a);
	}
	
}
public class SUPER2VARIABLESuperclassHowtoUse {

	public static void main(String[] args) 
	{
		B r =new B();
		r.show();

	}

}
