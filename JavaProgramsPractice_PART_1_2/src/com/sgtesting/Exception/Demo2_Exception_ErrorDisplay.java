package com.sgtesting.Exception;
class basicmaths1
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

public class Demo2_Exception_ErrorDisplay 
{

	public static void main(String[] args) 
	{
		basicmaths1.addition(10, 10);
		basicmaths1.subtraction(10, 10);
		basicmaths1.multiplication(10,10);
		basicmaths1.division(25, 0);
		basicmaths1.modulus(30, 10);
		basicmaths1.isEvenNumber(1244);
		basicmaths1.isOddNumber(111);
		basicmaths1.positiveinteger(111);
		basicmaths1.negativeinteger(-111);
		basicmaths1.averagevalue(20, 30);

	}

}
