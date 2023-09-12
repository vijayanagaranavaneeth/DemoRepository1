package com.sgtesting.twodarrayassignments;

/*6.create a 2D CHARACTER array read the element from ARRAY */

public class CharacterTwoArrayReadFirstThird 
{

	public static void main(String[] args) 
	{
		char ch[][]= {{'a','b','c'},{'d','e','f'},{'g','h','i'}};
		
		
		 
	      for(int i=0;i<ch.length;i++)
	          {
	    	      for(int j=0;j<ch[i].length-2;j++)
	    	         {	    	    	         	                     	    	          
   		              System.out.print(ch[i][j]+"FIRST  ");
	    	         }
	    	      
	    	      for(int j=ch[i].length-1;j>1;j--)
    	          {
	    	    	  
    	        	  System.out.print("Second:"+ch[i][j]);
    	        	  
    	          }
	    	      
	    	         System.out.println();
	          }
	      
	   	 
	}
	

}
