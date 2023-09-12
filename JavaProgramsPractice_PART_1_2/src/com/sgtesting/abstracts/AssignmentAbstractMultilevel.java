package com.sgtesting.abstracts;
abstract class BasicCalculation
{
	abstract void Mathtype(String name);
	abstract void Operatorused(String name);
	void mathaddition(int x,int y)
	{
		 /*int res=(x+y);
		 {
			 System.out.println("MATHADDITION:"+res);
		 }*/
		 
	}
}
class advancekkk extends BasicCalculation
{
	void Mathtype(String name)
	{
		System.out.println("TYPE OF MATH:"+name);
	}
	void Operatorused(String name)
	{
		System.out.println("OPERATOR TYPE OF MATH:"+name);
	}
}

class advance123 extends advancekkk
{
	void mathaddition(int x,int y)
	{
		 int res=(x+y);
		System.out.println("RESULT OF ADDITION:"+res);
	}
}
public class AssignmentAbstractMultilevel 
{

	public static void main(String[] args) 
	{
		advance123 a=new advance123();
		a.Mathtype("BasicMathsOperation");
		a.Operatorused("+ plus operator used");
		a.mathaddition(10, 10);
	}

}
