package com.sgtesting.constructoroverloadingassignment;

class Employee
{
	Employee(int empno,String ename)
	{
		System.out.println("Employee ID:"+empno);
		System.out.println("Employee Name:"+ename);
	}
	Employee(int deptno,int hiredate)
	{
		System.out.println("Department number:"+deptno);
		System.out.println("Hire Date:"+hiredate);
	}
	Employee(String job,int salary)
	{
		System.out.println("JOB:"+job);
		System.out.println("SALARY:"+salary);
	}
	Employee()
	{
		System.out.println("LOCATION:MYSORE");
	}
}
public class EmployeeTable
{

	public static void main(String[] args)
	{
		Employee E1=new Employee(7566,"jones");
		Employee E2=new Employee(10,11-12-2012);
		Employee E3=new Employee("manager",50000);
		Employee E4=new Employee();
	}

}
