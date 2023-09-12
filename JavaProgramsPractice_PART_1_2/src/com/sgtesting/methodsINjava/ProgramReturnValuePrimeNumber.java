package com.sgtesting.methodsINjava;

// APPLY THE RETURN CONCEPT ON THE PRIME NUMBER

class Isprimenumber
{
	boolean Isprime(int num)
	{
		int flag=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=flag+1;
				break;
			}
		}
		if(flag==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
public class ProgramReturnValuePrimeNumber 
{

	public static void main(String[] args) 
	{
		Isprimenumber p=new Isprimenumber();

		//DISPLAY PRIME NUMBER INBETWEEN 50 TO 100
		for(int a=50;a<=100;a++)
		{
			if(p.Isprime(a)==true)
			{
				System.out.print(a+"   ");
			}
		}

		//DISPLAY PRIME NUMBER INBETWEEN 250 TO 350
		System.out.println();
		System.out.println("======================");
		for(int b=250;b<=350;b++)
		{
			if(p.Isprime(b)==true)
			{
				System.out.print(b+"   ");
			}
		}

		System.out.println();
		System.out.println("===========");
		//DISPLAY PRIME NUMBER INBETWEEN 150 TO 100

		for(int c=150;c>=100;c--)
		{
			if(p.Isprime(c)==true)
			{
				System.out.print(c+"   ");
			}
		}

		System.out.println();
		System.out.println("===========");
		//DISPLAY NUMBER INBETWEEN 150 TO 100 which is not a prime number

		for(int d=50;d<=100;d++)
		{
			if(p.Isprime(d)==false)
			{
				System.out.print(d+"   ");
			}
		}
	}

}
