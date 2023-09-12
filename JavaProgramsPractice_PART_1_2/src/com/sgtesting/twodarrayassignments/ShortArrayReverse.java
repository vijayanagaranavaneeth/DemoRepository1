package com.sgtesting.twodarrayassignments;

public class ShortArrayReverse {

	public static void main(String[] args)
	{
     short y[] []= {{100,200,300},{400,500,600},{700,800,900}};
                  for(int i=y.length-1;i>=0;i--)
                  {
                	  for(int j=y[i].length-1;j>=0;j--)
                	  {
                		  System.out.print(y[i][j]+" ");
                	  }
                	  System.out.println();
                  }

	}

}
