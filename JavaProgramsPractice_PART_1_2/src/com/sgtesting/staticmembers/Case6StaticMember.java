package com.sgtesting.staticmembers;
/*CASE6:::::THERE IS A CLASS DEMO1 IT HAS STATIC METHOD,
 * THERE IS A CLASS DEMO2 IT HAS INSTANCE METHOD,
 * CAN WE ACCESS STATIC METHOD IN DEMO1 CLASS
 * INTO WITHIN THE BODY OF INSTANCE METHOD OF DEMO2 CLASS
 */
class Demo61
{
	static void showfirstname(String name)
	{
		System.out.println("first name:"+name);
	}
}
class Demo62
{
	void displaystatename(String statename)
	{
		Demo61.showfirstname("santosh");
		System.out.println("state name:"+statename);
	}
}
public class Case6StaticMember 
{

	public static void main(String[] args) 
	{
		Demo62 o=new Demo62();
		o.displaystatename("karnataka");
	}

}
