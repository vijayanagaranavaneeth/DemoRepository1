package com.sgtesting.constructorchinningassignments;

class Product1
{
	Product1(String Pname,String mname)
	{		
		System.out.println("Product Name:"+Pname);
		System.out.println("MODEL NAME:"+mname);
	}

	Product1(int Modelno)
	{
		this ("THAR","MAHINDRA");
		System.out.println("MODEL NUMBER:"+Modelno);
	}
	Product1(int yom,int nooftyres)
	{
		this (4780);
		System.out.println("YEAR OF MANUFACTURE:"+nooftyres);
		System.out.println("NUMBER OF TYRES:"+yom);
	}		
}
public class Product
{
	public static void main(String[] args) 
	{
		Product1 P1=new Product1(2018,5);

	}
}
