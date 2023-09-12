package com.sgtesting.inheritance;
class variable1
{
	String Countryname;
	void showeuropeancountry()
	{
		System.out.println("european country name:"+Countryname);
	}
}
class variable2 extends variable1
{
	String Countryname;
	variable2(String name)
	{
		super.Countryname=name;
	}
	void showassiancountry()
	{
		System.out.println("the asian country:"+Countryname);
	}
}
public class Case4Inheritence 
{

	public static void main(String[] args) 
	{
		variable2 o=new variable2("german");
		o.Countryname="india";
		o.showassiancountry();
		o.showeuropeancountry();
	}

}
