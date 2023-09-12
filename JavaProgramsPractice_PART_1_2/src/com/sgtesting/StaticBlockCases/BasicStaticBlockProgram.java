package com.sgtesting.StaticBlockCases;
class Employee 
{
	static String firstname;
	static int age;
	static
	{
		firstname="navaneeth";
		age=21;
		/*firstname="jhghjkl";
		firstname="jhgffghjkghjkl";*/
		Showfn();
		Showage();
	}
	static void Showfn()
	{
		System.out.println("First name:"+firstname);
		//System.out.println("First name:"+firstname);
		
	}
	static void Showage()
	{
		
		System.out.println("age:"+age);
	}
}
public class BasicStaticBlockProgram 
{

	public static void main(String[] args) 
	{
		Employee.age=21;
		System.out.println("Employee age in main method:"+Employee.age);

	}

}
