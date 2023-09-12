package com.sgtesting.TopicEncapsulationAndDesignPattern;
class OneBasic
{
	static OneBasic obj=null;
	private OneBasic()
	{
		//private No-Args constructor 
	}
	void addition(int x,int y)
	{
		int res=(x+y);
		System.out.println("Addition Result:"+res);
	}
	void multiplication(int x,int y)
	{
		int res=(x*y);
		System.out.println("Multiplication Result:"+res);
	}
	public static OneBasic getInstance()
	{
		if(obj==null)
		{
			obj=new OneBasic();
		}
		return obj;
	}
}
public class AfterSingleTonDesignPattern 
{

	public static void main(String[] args) 
	{
		OneBasic a= OneBasic.getInstance();
		a.addition(20,30);
		a.multiplication(20,30);

		OneBasic b= OneBasic.getInstance();
		b.addition(20,40);
		b.multiplication(20,40);

		OneBasic c= OneBasic.getInstance();
		c.addition(20,50);
		c.multiplication(20,50);

		if (a==b && b==c)
		{
			System.out.println("ALL THE OBJECT HAVE SAME REFERENCE");
		}
		else
		{
			System.out.println("ALL THE OBJECT DOES NOT HAVE SAME REFERENCE");
		}

	}

}


