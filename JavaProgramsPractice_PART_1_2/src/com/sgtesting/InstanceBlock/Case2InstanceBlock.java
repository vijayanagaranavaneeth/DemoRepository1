/*CAN WE DEFINE MORETHAN ONE INSTANCE BLOCK IN A SAME CLASS ?
 * YES,
 * IF ANSWER IS YES WHAT CAN BE THE EXECUTION ORDER?
 * 
 */
package com.sgtesting.InstanceBlock;
class Testc
{
	{
		System.out.println("IT IS A first INSTANCE BLOCK");
	}
	{
		System.out.println("IT IS A second INSTANCE BLOCK");
	}
	{
		System.out.println("IT IS A third INSTANCE BLOCK");
	}
}
public class Case2InstanceBlock 
{

	public static void main(String[] args) 
	{
		Testc d=new Testc();
	}

}
