package com.sgtesting.inheritance;
class inheritence1
{
	inheritence1(int age)
	{
		System.out.println("Age of a Person :" +age);
	}
}
class inheritence2 extends inheritence1
{
	inheritence2(int libno)
	{
		super (libno);
		System.out.println("Librery number of a person" +libno);
	}
	
}
class inheritence3 extends inheritence1
{
	inheritence3(int call)
	{
		super(call);
		System.out.println("Contact Number" +call);
	}
}

public class Assignment4 
{

	public static void main(String[] args) 
	{
		inheritence2 o1= new inheritence2(12);
		inheritence3 o2 = new inheritence3(23);
		


	}

}
