package com.sgtesting.constructoroverloadingassignment;

class Students 
{
	Students(String FirstName,String LastName)
	{
		System.out.println("FIRST NAME OF THE STUDENT:"+FirstName);
		System.out.println("LAST NAME OF THE STUDENT:"+LastName);
	}

	Students(int stuno,String FatherName,String Location)
	{
		System.out.println("STUDENT NUMBER:"+stuno);
		System.out.println("FATHER NAME:"+FatherName);
		System.out.println("LOCATION:"+Location);	
	}
	Students()
	{
		System.out.println("TOTAL NUMBER OF PERCENTAGE IN PUC:92%");
	}
}
public class Student 
{

	public static void main(String[] args)
	{
		Students S1=new Students("RAM","KUMAR");
		Students S2=new Students(10,"RAJU","MYSORE");
		Students S3=new Students();


	}

}
