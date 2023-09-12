package com.sgtesting.abstracts;
abstract class instance
{
	void instance1(String name)
	{
		System.out.println("NAME OF THE INSTANCE:"+name);
	}
}
class instance2 extends instance
{
	
}
public class InstanceAbstract 
{

	public static void main(String[] args) 
	{
		instance2 i=new instance2();
		i.instance1("hgfghjk");
		
		

	}

}
