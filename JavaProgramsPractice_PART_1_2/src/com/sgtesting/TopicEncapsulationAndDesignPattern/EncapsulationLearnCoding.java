package com.sgtesting.TopicEncapsulationAndDesignPattern;
//combination of data hiding and abstraction is encapsulation
class A
{
	private int value;//data hiding
	public void setvalue(int x)//data abstraction
	{
		value=x;
	}
	public int getvalue()
	{
		return value;
	}
	
}
public class EncapsulationLearnCoding 
{

	public static void main(String[] args) 
	{
		A r=new A();
		r.setvalue(100);
		System.out.println(r.getvalue());
		
	}

}
