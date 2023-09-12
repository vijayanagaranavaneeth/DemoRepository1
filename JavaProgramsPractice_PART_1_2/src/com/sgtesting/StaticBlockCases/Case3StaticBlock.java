package com.sgtesting.StaticBlockCases;
/*WHETHER CLASS CAN HAVE MULTIPLE STATIC BLOCK 
 * IF THE ANSWER 'YES' WHAT ARE THE ORDER OF EXECUTION 
 */
class Sampleb
{
	static 
	{
	System.out.println("its a first static block");	
	}
	static 
	{
	System.out.println("its a second static block");	
	}
	static 
	{
	System.out.println("its a third ststic block");	
	}
}
public class Case3StaticBlock 
{

	public static void main(String[] args) 
	{
	Sampleb n=new Sampleb();

	}

}
