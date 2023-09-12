package com.sgtesting.constructorchinningassignments;

class Project1
{
	Project1(String Pname,String ProLocation)
	{
		System.out.println("PROJECT NAME:"+Pname);
		System.out.println("PROJECT LOCATION:"+ProLocation);
	}
	
	Project1(int ProDuration)
	{
		this("BUILDING CONSTRUCTION","BANGALORE");
		System.out.println("Project Duration in MONTHS:"+ProDuration);
	}
	 
	Project1(int noofworkers,String Section)
	{
		this(24);
		System.out.println("NUM OF WORKERS:"+noofworkers);
		System.out.println("PROJECT SECTION:"+Section);
	}
	
}
public class Project 
{

	public static void main(String[] args)
	{
		Project1 L=new Project1(10,"Basement");

	}

}
