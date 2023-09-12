package com.sgtesting.Exception;
class basicmaths3
{
	static void addition(int x,int y)
	{
		/*catch should contains the specific class name  
		 * then only it catch the EXCEPTION
		 *here if we can specify null pointer exception it wont catch*/
		try
		{
			int res=(x+y);
			System.out.println("Addition:"+res);
		}catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		
	}
	static void subtraction(int x,int y)
	{
		try
		{
		int res=(x-y);
		System.out.println("Subtraction:"+res);
		}catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
	}
	
	static void multiplication(int x,int y)
	{
		try 
		{
		int res=(x*y);
		System.out.println("Multiplication:"+res);
		}catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
	}
	static void division(int x,int y)
	{
		try 
		{
			int res=(x/y);
			System.out.println("Division:"+res);
		}catch(NullPointerException n)
		{
			n.printStackTrace();
		}
		finally 
		{
		System.out.println("The finally block is optional !!!");	
		}
		
	}
	static void modulus(int x,int y)
	{
		try
		{
		int res=(x%y);
		System.out.println("Modulus:"+res);
		}catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
	}
	static void averagevalue(int x,int y)
	{
		try
		{
			int res=((x+y)/2);//bodmas concept
			System.out.println("Averagevalue:"+res);
		}catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		
	}
	static void isEvenNumber(int x)
	{
		try 
		{
		if(x%2==0)
		{
			System.out.println(x+":Even number");
		}
		}catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		
	}
	static void isOddNumber(int x)
	{
		try
		{
		if(x%2!=0)
		{
			System.out.println(x+":Odd number");
		}
		}catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		
	}
	static void positiveinteger(int x)
	{
		try
		{
		if(x%2!=0)
		{
			System.out.println(x+":PositivNumber");
		}
		}catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		
	}
	static void negativeinteger(int x)
	{
		try
		{
		if(x<0)
		{
			System.out.println(x+":NegativeNumber");
		}
		
		}catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		
	}
}
public class Demo4_ExampleOf_FinallyBlock_CatchBlock 
{

	public static void main(String[] args) 
	{
		basicmaths3.addition(10, 10);
		basicmaths3.subtraction(10, 10);
		basicmaths3.multiplication(10,10);
		basicmaths3.division(25, 0);
		basicmaths3.modulus(30, 10);
		basicmaths3.isEvenNumber(124);
		basicmaths3.isOddNumber(112);
		basicmaths3.positiveinteger(111);
		basicmaths3.negativeinteger(-111);
		basicmaths3.averagevalue(20, 30);

	}

}
