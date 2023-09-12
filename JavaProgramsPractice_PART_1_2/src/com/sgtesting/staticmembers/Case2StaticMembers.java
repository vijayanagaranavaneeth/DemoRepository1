package com.sgtesting.staticmembers;
/*CASE2:IF THE STATIC MEMBERS ARE AVAILABLE IN AN INDEPENDENT CLASS.
 * 
 */
class Maths1
{
	static String mathtype;
	static void addition(int x,int y)
	{
	   int res=(x+y);
	   System.out.println("addition result:"+res);
	}
	
}
public class Case2StaticMembers 
{

	public static void main(String[] args) 
	{
		Maths1.mathtype="Geometric";
		System.out.println(Maths1.mathtype);
		Maths1.addition(20,50);
	}

}
