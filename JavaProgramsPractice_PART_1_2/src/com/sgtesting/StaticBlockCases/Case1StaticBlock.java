package com.sgtesting.StaticBlockCases;
/*IF A CLASSS CONTAIN STATIC BLOCK ALONE ,
 * HOW TO EXECUTE THE STATIC BLOCK?
 */
class Sample 
{
  static
     {
		System.out.println("ITS A STATIC BLOCK");
	 }
}
public class Case1StaticBlock 
{

	public static void main(String[] args) 
	{
		Sample t=new Sample();
        System.out.println("123456789");
        
	}

}
