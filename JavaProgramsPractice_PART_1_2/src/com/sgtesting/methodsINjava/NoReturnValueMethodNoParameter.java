package com.sgtesting.methodsINjava;
/*METHODS WHICH DO NOT HAVE A PARAMETER
 * SYNTAX:
 * class demo
 * {
 * void <Method n>()
 *    {
 *    }
 * }
 */
class Calculation
{
    void addition()
    {
    	int res,x,y;
    	x=40;
    	y=50;
    	res=(x+y);
    	System.out.println("ADDITION RESULT:"+res);
    	
    }
    void display()
    {
    	String s;
    	s="hello";
    	System.out.println("STRING DISPLAY:"+s);
    }
    void factorial()
    {
    	int num=4;
    	int fact=1;
    	for(int i=num;i>=1;i--)
    	{
    		fact=fact*i;
    	}
    	System.out.println("FACTORIAL OF NUMBER:"+fact);
    	
    }
}
public class NoReturnValueMethodNoParameter 
{

	public static void main(String[] args) 
	{
		Calculation c=new Calculation();
		c.addition();
		c.display();
		c.factorial();
	}

}
