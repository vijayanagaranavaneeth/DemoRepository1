package com.sgtesting.StaticBlockCases;
/*WHETHER THE STATIC METHOD CAN RETURN THE VALUE ?
 * YES(REFER NOTES).
 */
class Samplec
{
	static int sumnumber()
	{
		int sum=0;
		for(int i=0;i<=10;i++)
		{
			sum=sum+i;
		}
		return sum;
	}
}
public class Case4StaticBlock 
{

	public static void main(String[] args) 
	{
		int x=Samplec.sumnumber();
		System.out.println(x);

	}

}
