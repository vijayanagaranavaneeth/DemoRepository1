/*THERE IS A CLASS DEMO1 IT HAS A INSTANCE METHOD,
 * THERE IS A CLASS DEMO2 IT HAS A STATIC METHOD ,
 * CAN WE ACCESS INSTANCE METHOD OF DEMO1 WITHIN THE
 * BODY OF STATIC METHOD OF DEMO2 CLASS?
 * 
 * RULE:THE INSTANCE MEMBER OF THE ONE CLASS MAY CANT ACCESS DIRECTLY 
 * WITHIN THE BODY OF STATIC METHOD OR STSTIC BLOCK OF ANOTHER CLASS
 * IN ORDER TO ACHIVE IT WE MUST CREATE AN OBJECT OR INSTANCE.
 */

package com.sgtesting.staticmembers;
class Demo1
{
   void ShowFirstName(String Name)
   {
	   System.out.println("First Name :"+Name);
   }
   
}
class Demo2
{
	static void displaystatename(String Statename) 
	{
		Demo1 o=new Demo1();
		o.ShowFirstName("Santosh");
		System.out.println("State Name:"+Statename);
		
	}
}

public class Case3StaticMember 
{

	public static void main(String[] args) 
	{
		Demo2.displaystatename("karnataka");

	}

}
