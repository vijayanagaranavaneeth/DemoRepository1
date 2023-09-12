package com.sgtesting.constructoroverloadingassignment;

class College1
{
	College1(String NameOfTheCollege,int NoOfBranches)
	{
		System.out.println("NAME OF THE COLLEGE:"+NameOfTheCollege);
		System.out.println("NUMBER OF COLLEGEG BRANCHES:"+NoOfBranches);
	}

	College1(int NoOfCoursesAvailable,String CoursesAvailable,String Location)
	{
		System.out.println("AVAILABLE COURSES:"+CoursesAvailable);
		System.out.println("NUMBER OF COURSES AVAILABLE:"+NoOfCoursesAvailable);
		System.out.println("LOCATION OF THE COLLEGE:"+Location);
	}
}


public class College 
{

	public static void main(String[] args) 
	{
		College1 C1=new College1("S G INSTITUTION",2);
		College1 C2=new College1(3,"MANUAL TESTING,AUTOMATION,SQL","HAMPI NAGARA BANGALORE");


	}

}
