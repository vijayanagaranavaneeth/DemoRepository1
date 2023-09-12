package com.sgtesting.practise;
class Basicmaths
{
	static Basicmaths obj=null;
	private Basicmaths()
	{
		//private No-args constructor
	}
	
	void addition(int x, int y)
	{
		int res=(x+y);
		System.out.println("addition:"+res);
	}
	void multiplication(int x, int y)
	{
		int res=(x*y);
		System.out.println("multiplication:"+res);
	}
	public static Basicmaths getinstance()
	{
		if(obj==null)
		{
			obj=new Basicmaths();
			
		}
		return obj;
	}
}
public class BasicmathsDebug 
{

	public static void main(String[] args) 
	{
		Basicmaths o1=Basicmaths.getinstance();
		 o1.addition(20, 20);
		 o1.multiplication(12,40);
		 Basicmaths o2=Basicmaths.getinstance();
		 o1.addition(20, 20);
		 o1.multiplication(12,40);
		 Basicmaths o3=Basicmaths.getinstance();
		 o1.addition(20, 20);
		 o1.multiplication(12,40);
		 if(o1==o2 && o2==o3)
		 {
			 System.out.println("all the object have same reference");
			 
		 }
		 else
		 {
			 System.out.println("all the object have same reference");
		 }
	}

}
