package com.sgtesting.inheritance;
/*
 * TO OVERCOME THE LIMITATION OF HARDCODED s
 */

class Studentss1
{
	Studentss1(String firstname,int age)
	{
		System.out.println("FIRST NAME:"+firstname);
		System.out.println("AGE:"+age);
	}
}
class Library1 extends Studentss1
{
	Library1(String fn,int age)
	{
		super(fn,age);
	}
}
public class Case2OF1Inheritance 
{

	public static void main(String[] args) 
	{
		Library1 l=new Library1("navaneeth",1);
		Library1 l1=new Library1("navaneeth1",11);
		Library1 l2=new Library1("navaneeth2",12);
	}

}
