package com.sgtesting.constructoroverloadingassignment;
/*WRITE A CONSTRUCTOR OVERLOADING TO ACHIVE FACTORIAL OF GIVEN NUMBER AND VRIFY
 * THEGIVEN NUMBER IS PRIME OR NOT
 */
class Maths1
{
	Maths1(int num)
	{
		int fact=1;
		for(int i=num;i>=1;i--) 
		{
			fact=fact*i;
		}
		System.out.println(+num+"is"+fact);
	}

	Maths1()
	{
		int num=11;
		int f=0;
		for(int j=2;j<num;j++)
		{
			if(num%2==0)
			{
				f=f+1;
				break;
			}
		}
		if(f==0)
		{
			System.out.print("PRIME NUMBER:   "+num);
		}
		else
		{
			System.out.println("NOT A PRIME NUMBER:   "+num);
		}
	}

}
public class FactoAndPrimeNumber 
{

	public static void main(String[] args) 
	{
		Maths1 m=new Maths1(5);
		Maths1 m1=new Maths1();
	}

}
