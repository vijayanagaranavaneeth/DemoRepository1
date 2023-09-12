package com.sgtesting.staticmembers;

public class Case1StaticMembers 
{
	/*case1: if the main class contain static variables and how to execute them.
	 * 
	 * 1.if we would like to access any INSTANCE MEMBERS within the body of the STATIC METHOD OR STATIC BLOCK 
	 * of the same class or different class or anything "OBJECT IS REQUIRED".
	 * 
	 * RULE1:in a same class the static members can be accessible within the body of another static method or static block.
	 * 
	 * RULE2:IN A SAME CLASS THE INSTANCE MEMBERS WE CANNOT ACCESS WITHIN THE BODY OF THE STATIC METHOD OR STATIC BLOCK OF 
	 * THE SAME CLASS IN ORDER TO ACCESS WE MUST CREATE AN OBJECT OR INSTANCE .
	 * 
	 * public class Person 
	 * {
	 *   string firstname;
	 *   int age;
	 *   public static void main(String args [])
	 *     {
	 *      Person p=new Person();
	 *      p.firstname="santosh";
	 *      p.age=21;
	 *      s.o.pln("FIRST NAME:"+firstname)
	 *      s.o.pln("FIRST NAME:"+age)
	 *      }
	 * }     
	 */
	//Here first name and age are the static variables or members
static String firstname;
static int age;


	public static void main(String[] args) 
	{
		
		firstname="nani";
		age=21;
		System.out.println("Firstname:"+firstname);
		System.out.println("Age:"+age);
		
	}

}

