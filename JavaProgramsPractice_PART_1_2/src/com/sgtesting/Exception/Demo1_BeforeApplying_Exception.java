package com.sgtesting.Exception;
class basicmaths
{
	static void addition(int x,int y)
	{
		int res=(x+y);
		System.out.println("Addition:"+res);
	}
	static void subtraction(int x,int y)
	{
		int res=(x-y);
		System.out.println("Subtraction:"+res);
	}
	static void multiplication(int x,int y)
	{
		int res=(x*y);
		System.out.println("Multiplication:"+res);
	}
	static void division(int x,int y)
	{
		int res=(x/y);
		System.out.println("Division:"+res);
	}
	static void modulus(int x,int y)
	{
		int res=(x%y);
		System.out.println("Modulus:"+res);
	}
	static void averagevalue(int x,int y)
	{
		int res=((x+y)/2);//bodmas concept
		System.out.println("Averagevalue:"+res);
	}
	static void isEvenNumber(int x)
	{
		if(x%2==0)
		{
			System.out.println(x+":Even number");
		}
		
	}
	static void isOddNumber(int x)
	{
		if(x%2!=0)
		{
			System.out.println(x+":Odd number");
		}
		
	}
	static void positiveinteger(int x)
	{
		if(x%2!=0)
		{
			System.out.println(x+":PositivNumber");
		}
		
	}
	static void negativeinteger(int x)
	{
		if(x<0)
		{
			System.out.println(x+":NegativeNumber");
		}
		
	}
}


public class Demo1_BeforeApplying_Exception
{

	public static void main(String[] args) 
	{
		basicmaths.addition(10, 0);
		basicmaths.subtraction(10, 10);
		basicmaths.multiplication(10,10);
		basicmaths.division(25, 5);
		basicmaths.modulus(30, 30);
		basicmaths.isEvenNumber(1244);
		basicmaths.isOddNumber(111);
		basicmaths.positiveinteger(111);
		basicmaths.negativeinteger(-111);
		basicmaths.averagevalue(20, 30);
	}

}
