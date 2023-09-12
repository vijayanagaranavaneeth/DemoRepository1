package com.sgtesting.inheritance;
/* super class and sub class contains 
 * same method name and same signature.
 */

class omat
{
	void addition(int a,int b)
	{
		int re=(a+b);
		System.out.println("add:"+re);
	}
}
class omat1 extends omat
{
	omat1(int u,int i)
	{
		super.addition( u, i);
	}
	void addition(int x,int y)
	{
		int re1=(x+y);
		System.out.println("omat1 addition:"+re1);
				
	}
}
public class PRACTICESUPERSUBSAMEMETHOD 
{

	public static void main(String[] args) 
	{
		omat1 m=new omat1(10,10);
		m.addition(10, 10);
		
		//m1.addition(10,20);

	}

}
