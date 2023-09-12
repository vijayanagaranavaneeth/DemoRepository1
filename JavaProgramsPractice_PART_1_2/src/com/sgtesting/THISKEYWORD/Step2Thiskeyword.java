package com.sgtesting.THISKEYWORD;
class A1
{
	int a;
	A1(int a)
	{
		this.a=a;
		//a=this.a;
		
	}
	void show()
	{
		System.out.println(a);
	}
}
public class Step2Thiskeyword 
{
	public static void main(String[] args) 
	{
		A1 r=new A1(100);
		r.show();
	}
}
/*OUTPUT:0 BECAUSE JVM GETS CONFUSED 
 * WHICH ONE IS LOCAL AND INSTANCE VARIABLE 
 */