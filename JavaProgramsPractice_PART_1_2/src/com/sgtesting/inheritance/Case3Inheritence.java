package com.sgtesting.inheritance;
/*METHOD OVERLOADING:
 * IF THE SUPERCLASS AND SUBCLASS HAVE SAME NAME WITH SIGNATURE,
 * WHAT CAN BE THE IMPACT?
 *  */

class Capitalcity
{
	void display (String cityname)
	{
		System.out.println("the capital city name:"+cityname);
	}
}
class metrocity extends Capitalcity 
{
	metrocity(String cityname)
	{
	     super. display(cityname);
	}
	void display(String cityname)
	{
		System.out.println("the metrocity name:"+cityname);
	}
}
public class Case3Inheritence 
{

	public static void main(String[] args) 
	{
	metrocity m=new metrocity("bangalore");
	m.display("chennai");
		

	}

}

/*output:the capital city name:bangalore
the metrocity name:chennai  */

