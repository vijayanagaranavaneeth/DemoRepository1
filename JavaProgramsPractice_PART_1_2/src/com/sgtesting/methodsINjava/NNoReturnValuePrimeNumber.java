package com.sgtesting.methodsINjava;
//DISPLAY THE PRIME NUMBER WITHOUT USING RETURN


class PPrime
{
	void Primenumber()
	{
		for(int num=50;num<=100;num++)
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
				System.out.println(num+"    NUMBER IS A PRIME NUMBER");

			}
		}

	}
}
public class NNoReturnValuePrimeNumber 
{

	public static void main(String[] args) 
	{
		PPrime o=new PPrime();
		o.Primenumber();

	}

}
