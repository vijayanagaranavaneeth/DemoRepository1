package com.sgtesting.abstracts;
////if abstract class name contains only the instance 
//how to execute
abstract class basicphone1
{
abstract void showphonename1(String name);
//abstract void displaymodel(String modelno);*/
	static 
	{
		System.out.println("RAM Storage in GB");
		
	}

static void Memory(int n)
{
	System.out.println("RAM Storage in GB:"   +n);
	
}

}
class advance1 extends basicphone1
{
void showphonename1(String name)
{
	System.out.println("PHONE NAME:"+name);
}

	/*void displaymodel(String modelno)
	{
		System.out.println("PHONE MODEL:"+modelno);
	}*/
}
public class AbstractStaticBlock 
{

	public static void main(String[] args) 
	{
		advance1 d=new advance1();
		basicphone1.Memory(1);
		
		d.showphonename1("MOTOROLO");
		//d.displaymodel("4iqM68");

	}

}
