package com.sgtesting.constructoroverloadingassignment;

class University
{
	University(String UniversityName,int NoOfColleges)
	{
		System.out.println("UNIVERSITY NAME:"+UniversityName);		
		System.out.println("NUMBER OF COLLEGE UNDER UNIVERSITY:"+NoOfColleges);
	}

	University(String Location)
	{
		System.out.println("LOCATION:"+Location);
	}

	University(int NoOfGovtColleges ,String TypeOfUniversity)
	{
		System.out.println("NUMBER OF GOVT COLLEGE UNDER UNIVERSITY:"+NoOfGovtColleges);
		System.out.println("TYPE OF UNIVERSITY:"+TypeOfUniversity);
	}


}
public class UniversityConstOverLoad 
{


	public static void main(String[] args) 
	{
		University U1=new University("BANGALORE",133);
		University U2=new University("BANGALORE");
		University U3=new University(70,"PUBLIC UNIVERSITY");
	}

}
