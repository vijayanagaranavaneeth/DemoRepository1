package com.sgtesting.constructorchinningassignments;

class Department
{
	Department(String dname)
	{
		System.out.println("Department Name:"+dname);
	}
	Department(int deptno)
	{
		this("Accounting");
		System.out.println("Department:"+deptno);
	}
}
public class Practiceprogram 
{

	public static void main(String[] args)
	{
		Department O=new Department(20);
	}

}
