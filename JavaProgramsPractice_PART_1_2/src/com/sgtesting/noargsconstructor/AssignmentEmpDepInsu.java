package com.sgtesting.noargsconstructor;


class Employee
{
	int EmployeeNumber;
	String EmployeeName;
	String Job;
	int Salary;
	Employee()
	{
		EmployeeNumber=01;
		EmployeeName="Navaneeth";
		Job="Engineer";
		Salary=50000;
		System.out.println("EMPLOYEE NUMBER:-"+EmployeeNumber);
		System.out.println("EMPLOYEE NAME:---"+EmployeeName);		
		System.out.println("JOB OF EMPLOYEE:-"+Job);
		System.out.println("Employee Salary:-"+Salary);
		System.out.println("*************************");
	}
}
class Dept
{
	int Deptno;
	String DeptName;
	String Location; 
	Dept()
	{
		Deptno=10;
		DeptName="SALES";
		Location="BANGALORE";
		System.out.println("DEPARTMENT NUMBER:"+Deptno);
		System.out.println("DEPARTMENT NAME:"+DeptName);
		System.out.println("DEPARTMENT LOCATION:"+Location);
		System.out.println("+++++++++++++++++++++++++++++++");
	}
}
class Insurance
{
	String InsuranceName;
	String InsuranceType;
	String StartDate;
	String EndDate;
	Insurance()
	{
		InsuranceName="BAJAJ ALLIANCE";
		InsuranceType="HEALTH INSURANCE";
		StartDate="15-MAR-2022";
		EndDate="14-FEB-2030";
		System.out.println("INSURANCE NAME:"+InsuranceName);
		System.out.println("TYPE OF INSURANCE:"+InsuranceType);
		System.out.println("INSURANCE START DATE:"+StartDate);
		System.out.println("INSURANCE END DATE:"+EndDate);
	}
}
public class AssignmentEmpDepInsu 
{

	public static void main(String[] args)
	{
		Employee E=new Employee();
		Dept D=new Dept();
		Insurance i=new Insurance();

	}

}
