package com.sgtesting.inheritance;
/*IF THE SUB CLASS HAS ITS OWN MEMBER ?*/
class Stu1
{
	Stu1(String firstname,int age)
	{
		System.out.println("Firstname:"+firstname);
		System.out.println("Age:"+age);
	}
}
class Lib extends Stu1
{
	String bookname;
	int deptno;
		Lib(String fn,int age,String bookname,int deptno)
		{
			super(fn,age);
          this.deptno=deptno;         
          this.bookname=bookname;
          System.out.println("Bookname:"+bookname);
          System.out.println("DEPARTMENT NUMBER:"+deptno);
		}
}
public class Case2of2Inheritance 
{

	public static void main(String[] args) 
	{
		Lib k=new Lib("Navi",21,"Core Java",21);
		Lib k1=new Lib("Navi1",22,"Core Java1",22);
	}

}
