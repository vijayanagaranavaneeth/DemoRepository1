package com.sgtesting.THISKEYWORD;
/*THIS KEYWORD IS ALSO USED WHEN WE WANT TO CALL 
 * THE DEFAULT CONSTRUCTOROF ITS OWN CLASS */
class A3
{
	
	A3()//DEFAULT CONSTRUCTOR
	{
		System.out.println("learn coding");
	}
	
	A3(int a)//PARAMETERIZED CONSTRUCTOR
	{
		this();//THIS KEYWORD CALLS THE DEFAULT CONSTRUCTOR
		System.out.println(a);
		
	}
	
}
public class Step3ThisKeyword 
{

	public static void main(String[] args) 
	{
		A3 r=new A3(100);
	}

}
