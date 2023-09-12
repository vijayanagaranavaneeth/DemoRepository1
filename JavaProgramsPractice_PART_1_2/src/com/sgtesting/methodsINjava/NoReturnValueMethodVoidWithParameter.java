package com.sgtesting.methodsINjava;
/*METHODS WITH A PARAMETER
 * SYNTAX:
 * class demo
 * {
 *    void <METHOD n>(PARAMETER)
 *    {
 *    <STSTEMENT>
 *    }
 * }
 */
class Calculation1
{
    void addition1(int x,int y)
    {
    	int res=(x+y);
    	System.out.println("ADDITION RESULT:"+res);
    	
    }
    void display(String s)
    {
    	
    	System.out.println("STRING DISPLAY:"+s);
    }
    void factorial(int num)
    {
    	
    	int fact=1;
    	for(int i=num;i>=1;i--)
    	{
    		fact=fact*i;
    	}
    	System.out.println("FACTORIAL OF NUMBER:"+fact);
    	
    }
}
public class NoReturnValueMethodVoidWithParameter 
{

	public static void main(String[] args) 
	{
	Calculation1 c1=new Calculation1();
	c1.addition1(10,20);
	c1.display("hello computer");
	c1.factorial(5);
	}

}
