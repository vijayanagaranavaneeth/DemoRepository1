package com.sgtesting.abstracts;

abstract class college
{
	abstract void showcollegename(String name);
	abstract void displatcityname(String name);
	 void showbrancges(String branches[])
	{
		System.out.println("BRANCHES NAME");
		for(int i=0;i<branches.length;i++)
		{
			System.out.println(branches[i]);
		}
	}
}
class Enggcollege extends college
{
	void showcollegename(String name)
	{
		System.out.println("engg college name:"+name);
	}
	void displatcityname(String name)
	{
		System.out.println("city name engg college:"+name);
	}
	/*void showaddress(String address)
	{
		System.out.println("address of the engg college :"+address);
	}*/
}
public class AbsrtactclassBaseProgram 
{

	public static void main(String[] args) 
	{
		college o=new Enggcollege();
		o.showcollegename("smce campus");
		o.displatcityname("bangalore");
		//o.showaddress("2nd main vijayanagar bangalore");
		String s[]= {"civil","mech","cs","ece"};
		o.showbrancges(s);
	}

}
