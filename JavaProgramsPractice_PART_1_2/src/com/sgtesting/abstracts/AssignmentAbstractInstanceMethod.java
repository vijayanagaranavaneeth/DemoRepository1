package com.sgtesting.abstracts;
////if abstract class name contains only the instance 
//how to execute
abstract class college2
{
	void collegename(String name) 
	{
		System.out.println("college name :" +name);
	}
	
	void studentname(String fn,int rollno)
	{
		System.out.println("Name of the Candidate: " +fn);
		System.out.println("Register number of the candiate: " +rollno);
	}
}

class Enggclg2 extends college2
{	
	
}


public class AssignmentAbstractInstanceMethod 
{

	public static void main(String[] args) 
	{
		Enggclg2 o1 = new Enggclg2();
		o1.collegename("NIE college of engineering");
		o1.studentname("Navaneeth",24);

		
	}

}
