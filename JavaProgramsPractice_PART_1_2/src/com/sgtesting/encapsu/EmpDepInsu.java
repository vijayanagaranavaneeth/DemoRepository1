package com.sgtesting.encapsu;

class Employee
{
	int EmployeeNumber;
	String EmployeeName;
	String Job;
	int Salary;
}
class Dept
{
	int Deptno;
	String DeptName;
	String Location; 

}
class Insurance
{
	String InsuranceName;
	String InsuranceType;
	String StartDate;
	String EndDate; 


}
public class EmpDepInsu
{        
	public static void main(String[] args) 
	{
		Employee E=new Employee();
		E.EmployeeNumber=01;
		E.EmployeeName="Navaneeth";
		E.Job="Engineer";
		E.Salary=50000;
		System.out.println("EMPLOYEE NUMBER:-"+E.EmployeeNumber);
		System.out.println("EMPLOYEE NAME:---"+E.EmployeeName);		
		System.out.println("JOB OF EMPLOYEE:-"+E.Job);
		System.out.println("Employee Salary:-"+E.Salary);
		System.out.println("*************************");

		Dept D=new Dept();


		Insurance i=new Insurance();
		i.InsuranceName="BAJAJ ALLIANCE";
		i.InsuranceType="HEALTH INSURANCE";
		i.StartDate="15-MAR-2022";
		i.EndDate="14-FEB-2030";
		System.out.println("INSURANCE NAME:"+i.InsuranceName);
		System.out.println("TYPE OF INSURANCE:"+i.InsuranceType);
		System.out.println("INSURANCE START DATE:"+i.StartDate);
		System.out.println("INSURANCE END DATE:"+i.EndDate);


	}
}

