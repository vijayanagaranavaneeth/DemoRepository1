package com.sgtesting.returnassignments;
class DoubArr1
{
	double[] onedimensionarraydub (double x[],double y[])
	{
		
		double z[]=new double [x.length];
		for(int i=0;i<x.length;i++)
		{
			
			z[i]=x[i]*y[i];
			
		}
		return z;
	}
}
public class MulRet 
{

	public static void main(String[] args) 
	{
		DoubArr1 m=new DoubArr1();
		double x[]= {1.1,1.2,1.3};
		double y[]= {1.1,1.2,1.3};
		double t[]=m.onedimensionarraydub(x,y);
		 for(int j=0;j<t.length;j++)
			 
		 {
			 System.out.println(t[j]+"     ");                        
		 }
	}

}
