package com.sgtesting.constructoroverloadingassignment;
class Stude 
{
	Stude(int StudentNo,String FirstName,String Lastname)
	{
		System.out.println("STUDENT ID:"+StudentNo);
		System.out.println("STUDENT FIRST NAME:"+FirstName);
		System.out.println("STUDENT LAST NAME:"+Lastname);
	}
	
	Stude(String Location,String FatherName)
	{
		System.out.println("LOCATION:"+Location);
		System.out.println("FATHER NAME:"+FatherName);
	}
	Stude(int PhoneNumber)
	{
		System.out.println("PHONE NUMBER:"+PhoneNumber);
	}
}
public class StudentStudent 
{

	public static void main(String[] args) 
	{
	   Stude S1=new Stude(1,"RAJU","KUMAR");
	   Stude S2=new Stude("BANGALORE","john");
	   Stude S3=new Stude(999999999);
	   
	}

}
