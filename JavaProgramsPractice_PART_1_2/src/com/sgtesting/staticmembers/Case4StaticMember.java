/*CASE4:THERE IS 2 CLASS DEMO1 AND DEMO2 
 * DEMO1 CONTAIN INSTANCE METHOD 
 * DEMO2 CONTAIN INSTANCE MENTOD 
 * CAN WE EXECUTE INSTANCE METHOD F DEMO1 
 * INTO WITHIN THE BODY OF INSTANCE METHOD OF 
 * DEMO2 CLASS
 */
package com.sgtesting.staticmembers;
class Demo11
{
	void showfirstname(String name)
	{
		System.out.println("first name:"+name);
	}
}
class Demo12
{
	void displaystatename(String statename)
	{
		Demo11 o=new Demo11();
		o.showfirstname("Santosh");
		System.out.println("statename:"+statename);
	}
}
public class Case4StaticMember 
{

	public static void main(String[] args) 
	{
		Demo12 o=new Demo12();
		o.displaystatename("karnataka");

	}

}
/*CONCLUSION:::::THE INSTANCE METHOD OF ONE CLASS CAN BE ACCESSIBLE 
 * WITHIN THE BODY OF INSTANCE METHOD OF ANOTHER CLASS 
 * ONLY BASED ON CERTAIN OF OBJECT OR INSTANCE.
 * 
 */
