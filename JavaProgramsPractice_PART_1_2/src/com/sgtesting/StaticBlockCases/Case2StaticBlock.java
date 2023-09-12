package com.sgtesting.StaticBlockCases;
/*CASE 2::::IF A CLASS CONTAIN STATIC BLOCK ALONG WITH THE PARAMETERISED
 * CONSTRUCTOR OR NO-ARGS CONSTRUCTOR ,
 * IF WE CAN CREATE AN OBJECT OR INSTANCE WHICH ONE WILL EXECUTE FIRST?
 */
class SampleA
{
	SampleA (String name)
	{
		System.out.println("name of the parameter:"+name);
	}
	static
	{
		System.out.println("IT IS A STATIC BLOCK");
	}
}
public class Case2StaticBlock 
{

	public static void main(String[] args) 
	{
		SampleA o=new SampleA("testing");
	}

}
