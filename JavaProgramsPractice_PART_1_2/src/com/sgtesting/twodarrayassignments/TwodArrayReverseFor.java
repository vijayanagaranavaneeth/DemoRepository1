package com.sgtesting.twodarrayassignments;

public class TwodArrayReverseFor
{

	public static void main(String[] args) 
	{
		char ch[][]= {{'a','b','c'},{'d','e','f'}};
	      for(int i=ch.length-1;i>=0;i--)
	      {
	    	  for(int j=ch[i].length-1;j>=0;j--)
	    	  {
	    		  System.out.print(ch[i][j]+" ");
	    	  }
	    	  System.out.println();
	      }
		

	}

}
