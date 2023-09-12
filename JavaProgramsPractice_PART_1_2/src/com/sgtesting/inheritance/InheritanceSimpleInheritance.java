package com.sgtesting.inheritance;
// inheritance at variable level
class maths
{
	int x,y,z;
}
class matmaths extends maths
{
	int a,b,c;
}
public class InheritanceSimpleInheritance 
{

	public static void main(String[] args) 
	{
		matmaths o=new matmaths();
	o.a=10;
	o.b=20;
	o.c=30;
	o.x=40;
	o.y=50;
	o.z=60;
	
	}

}
