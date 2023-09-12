package com.sgtesting.staticmembers;
/*CASE5::::::::THERE IS A CLASS DEMO1, IT HAS A STATIC METHOD,
 *THERE IS A ANOTHER CLASS DEMO 2 IT HAS ALSO STATIC METHOD,
 *CAN WE ACCESS STATIC METHOD OF CLASS WITHIN THE BODY OF STATIC METHOD OF ANOTHER CLASS? 
 * 
 * <class name><.><methodname><()>
 */
class Demo51
{
	static void shortfirstname(String name)
	{
		System.out.println("first name:"+name);
	}
}
class Demo52
{
	static void displayststename(String statename)
	{
		Demo51.shortfirstname("santosh");
		System.out.println("state name:"+statename);
	}
}
public class Case5StaticMember
{

	public static void main(String[] args) 
	{
		Demo52.displayststename("maharastra");
	}

}
