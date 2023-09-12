package com.sgtesting.twodarrayassignments;

public class StringArrayReverse {

	public static void main(String[] args)
	{
		String sr[][]= {{"apple","bat","cat"},{"dog","ear","flower"}};
	      for(int i=sr.length-1;i>=0;i--)
	      {
	    	  for(int j=sr[i].length-1;j>=0;j--)
	    	  {
	    		  System.out.print(sr[i][j]+"    ");
	    	  }
	    	  System.out.println();
	      }

	}

}
