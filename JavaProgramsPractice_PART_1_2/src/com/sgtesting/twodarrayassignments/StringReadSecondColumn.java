package com.sgtesting.twodarrayassignments;

public class StringReadSecondColumn 
{

	public static void main(String[] args) 
	{
		String sr[][]= {{"apple","bat","cat"},{"dog","ear","flower"},{"god","hat","ink"}};
		System.out.println("Size of the array="+sr.length);
	      for(int i=1;i<sr.length-1;i++)
	      {
	    	  System.out.println("Second Row Of The Element:");
	    	  for(int j=0;j<sr[i].length;j++)  
	    	  {	    		 
	    		  System.out.print(sr[i][j]+"     ");	    	
	    	  }	    	  
	    	       
	      }

	}
}

