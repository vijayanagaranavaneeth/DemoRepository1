package com.sgtesting.THISKEYWORD;
/*IT ALSO CALLED THE PARAMETERIZED CONSTRUCTOR OF ITS OWN CLASS*/
class A4
{
	
	A4()//DEFAULT CONSTRUCTOR
	{
		this(100);//this KEYWORD CALLS THE PARAMETERIZED CONSTRUCTOR
		//System.out.println("learn coding");
	}
	
	A4(int a)//PARAMETERIZED CONSTRUCTOR
	{
		
		
		System.out.println(a);
		
	}
	
}
public class Step4Thiskeyword {

	public static void main(String[] args) {
		A4 r=new A4();

	}

}
