package com.sgtesting.constructoroverloadingassignment;

/*BY USING CONSTRUCTOR OVERLOADING AND BY USING 2 INTEGER PARAMETER 
 * ACHIVE ALL BASIC MATHEMATICAL ACTIONS? */

class BasicMaths
{
	BasicMaths(int x,int y,String action)
	{
		int res=0;
		switch (action)
		{
		case"add":
			res=(x+y);
			System.out.println("ADDITION RESULT:"+res);
			break;

		case"sub":
			res=(x-y);
			System.out.println("SUBTRACTION RESULT:  "+res);
			break;

		case"mul":
			res=(x*y);
			System.out.println("MULTIPLICATION RESULT:     "+res);
			break;
		}
	}
}

public class OverAlBasic 
{

	public static void main(String[] args) 
	{
		BasicMaths M1=new BasicMaths(20,10,"add");
		BasicMaths M2=new BasicMaths(20,10,"sub");
		BasicMaths M3=new BasicMaths(20,10,"mul");
	}

}
