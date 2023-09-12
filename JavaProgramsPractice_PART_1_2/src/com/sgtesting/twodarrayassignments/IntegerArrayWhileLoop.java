package com.sgtesting.twodarrayassignments;

public class IntegerArrayWhileLoop {

	public static void main(String[] args) 
	{
	    int k[] []= {{10,20,30},{40,50,60},{70,80,90}};
	        int i=k.length-1;
	        while(i>=0)
	        {
	        	 int j=k[i].length-1;
	        	 while(j>=0)
	        	 {
	        		 System.out.print(k[i][j]+" ");
	        		 j--;
	        	 }
	        	 System.out.println();
	        	 i--;
	        }
	}

}
