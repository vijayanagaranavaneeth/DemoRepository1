package com.sgtesting.constructorchinningassignments;

class Customer
{
	Customer(int cusnum,String cusname)
	{
		System.out.println("CUSTOMER NUMBER:"+cusnum);
		System.out.println("CUSTOMER NAME:"+cusname);
	}
	Customer(String cusloc)
	{
		this(1,"SURESH");
		System.out.println("CUSTOMER LOCATION:"+cusloc);
	}
	Customer(String cussex,int age)
	{
		this("VIJAPURA");
		System.out.println("CUSTOMER SEX:"+cussex);
		System.out.println("CUSTOMER AGE:"+age);
	}
}
public class Customer1 
{

	public static void main(String[] args) 
	{
		Customer C=new Customer("MALE",30);

	}

}
