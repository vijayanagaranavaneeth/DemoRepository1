package com.sgtesting.practise;
class demo1
{
	void addition (int x,int y)
	{
		int res=(x+y);
		System.out.println(res);
	}
}
class demo2
{
	static void display(String operator)
	{
		demo1 o=new demo1();
		System.out.print(operator+":used in the condition and the result is:::   ");
		o.addition(10,10);
		
	}	
}
public class StaticMethoDinstancetostatic 
{

	public static void main(String[] args)
	{
		demo2.display("plus '+'");

	}

}
