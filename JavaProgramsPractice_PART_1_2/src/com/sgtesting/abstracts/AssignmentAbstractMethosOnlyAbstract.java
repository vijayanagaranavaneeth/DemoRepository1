package com.sgtesting.abstracts;
abstract class phonebasic
{
	abstract void showphonename(String name);
	abstract void displayphonemodel2(int modelno);
}
class latest extends phonebasic
{
	void showphonename(String name)
	{
		System.out.println("PHONE NAME:"+name);
	}
	
		void displayphonemodel2(int modelno)
		{
			System.out.println("PHONE MODEL:"+modelno);
		}
}
public class AssignmentAbstractMethosOnlyAbstract 
{

	public static void main(String[] args) 
	{
		latest l=new latest();
         l.showphonename("Nokia");
         l.displayphonemodel2(1100);
	}

}
