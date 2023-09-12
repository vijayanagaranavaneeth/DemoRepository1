package com.sgtesting.inheritance;
/*IF SUPER CLASS CONTAINS PARAMETERIZESD CONSTRUCTOR 
 * BASED ON THE SUBCLASS OBJECT HOW CAN WE EXECUTE 
 * THE PARAMETERIZED CONSTRUCTOR OF SUPER CLASS?
 * HERE THE VALUES ARE HARDCODED.
 */

class Studentss
{
	Studentss(String firstname,int age)
	{
		System.out.println("FIRST NAME:"+firstname);
		System.out.println("AGE:"+age);
	}
}
class Library extends Studentss
{
	Library()
	{
		super("Navaneeth",30);
		
	}
}
public class Case2Inheritance 
{

	public static void main(String[] args) 
	{
		Library l=new Library();
		
		
	}

}
