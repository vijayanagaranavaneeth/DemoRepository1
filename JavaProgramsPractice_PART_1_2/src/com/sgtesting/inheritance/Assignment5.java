package com.sgtesting.inheritance;
class Inheritence6
{
	Inheritence6(int age,String Name)
	{
		System.out.println("age of " +age);
		System.out.println("Name :"+Name);
	}
	
	Inheritence6(String LName)
	{
		System.out.println("lastname of :" +LName);
	}
}

class Inheritence8 extends Inheritence6
{
	Inheritence8(int age,String Name)
	{
		super (age,Name);
				
	}
	Inheritence8(String LName)
	{
		super(LName);
	}
	
}


public class Assignment5 
{

	public static void main(String[] args) 
	{
		Inheritence8 o3 = new Inheritence8(23,"Navaneeth");
		Inheritence8 o4 = new Inheritence8("M B");

	}

}
