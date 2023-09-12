package com.sgtesting.POLYMORPHISMandTYPES;
class A
{
	void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("ADDITION OF NUM:"+c);
	}
	void add(int x,int y)
	{
		int c=x+y;
		System.out.println("ADDITION:"+c);
	}
	void add(int x,double y)
	{
		double c=x+y;
		System.out.println("ADDITION:"+c);
	}
}
public class YTCompilertimePOLYMORPHISMmethodOverloading 
{

	public static void main(String[] args) 
	{
		A r=new A();
		r.add();
		r.add(20,20);
		r.add(20,20.2);
	}

}
