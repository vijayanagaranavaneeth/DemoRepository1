package com.sgtesting.TopicEncapsulationAndDesignPattern;
class BasicMaths
{
	void addition(int x,int y)
	{
		int res=(x+y);
		System.out.println("Addition Resulrt:"+res);
	}
	void multiplication(int x,int y)
	{
		int res=(x*y);
		System.out.println("Multiplication Resulr:"+res);
	}
}
public class BeforeSingleTonDesignPattern 
{

	public static void main(String[] args) 
	{
		BasicMaths o1=new BasicMaths();
		o1.addition(20,30);
		o1.multiplication(20,30);
		
		BasicMaths o2=new BasicMaths();
		o2.addition(20,40);
		o2.multiplication(20,40);
		
		BasicMaths o3=new BasicMaths();
		o3.addition(20,50);
		o3.multiplication(20,50);
		
	}

}
