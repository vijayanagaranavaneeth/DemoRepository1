package com.sgtesting.abstracts;
//if abstract class contains static method alone 
//how to execute
abstract class basicphone
{
	abstract void showphonename(String name);
	abstract void displayphonemodel(String modelno);
	static void storage(int num[])
	{
		System.out.println("");
		for(int i=0;i<num.length;i++)
		{
			System.out.println("RAM Storage in GB:"+num[i]);
		}
	}
}
class advance extends basicphone
{
	void showphonename(String name)
	{
		System.out.println("PHONE NAME:"+name);
	}
	
		void displayphonemodel(String modelno)
		{
			System.out.println("PHONE MODEL:"+modelno);
		}
		
			void colourofmobile(String col)
			{
				System.out.println("mobile colour:"+col);
			}
}
public class AssignmentAbstractStaticamethods 
{

	public static void main(String[] args) 
	{
		advance m=new advance();
		m.showphonename("MOTOROLO");
		m.displayphonemodel("4iqM68");
		m.colourofmobile("NAVY BLUE");
		int num[]= {4,6,8};
		m.storage(num);
		

	}

}
