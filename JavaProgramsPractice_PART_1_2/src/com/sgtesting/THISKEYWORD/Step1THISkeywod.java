package com.sgtesting.THISKEYWORD;
class A
{
	void show()
	{
		System.out.println(this);
	}
}
public class Step1THISkeywod 
{

	public static void main(String[] args) 
	{
		A r=new A();
		System.out.println(r);
		r.show();
	}

}

/*OUTPUT:com.sgtesting.THISKEYWORD.A@626b2d4a
 *       com.sgtesting.THISKEYWORD.A@626b2d4a
 */