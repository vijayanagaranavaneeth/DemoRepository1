package com.sgtesting.POLYMORPHISMandTYPES;
class A4
{
	int add()
	{
		int a=10;
		int b=20;
		int c=a+b;
	    return c;
	}
	void add(int x,int y)
	{
		int c=x+y;
		System.out.println("A4DDITION:"+c);
	}
	void add(int x,double y)
	{
		double c=x+y;
		System.out.println("A4DDITION:"+c);
	}
}

public class YTMethodOverloadingPOLYMORPHISMreturnTYPE {

	public static void main(String[] args) 
	{
		A4 r=new A4();
		int e=r.add();
		System.out.println(e);
		r.add(20,20);
		r.add(20,20.2);
	}

}
