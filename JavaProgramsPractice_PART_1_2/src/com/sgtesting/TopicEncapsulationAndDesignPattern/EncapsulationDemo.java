package com.sgtesting.TopicEncapsulationAndDesignPattern;
class Bank
{
	private String bankname;
	private int accountnumber;
	public void setbankname(String bankname)
	{
		this.bankname=bankname;
	}
	public String getbank()
	{
		return bankname;
	}
	public void setaccountnumber(int accountnumber)
	{
		this.accountnumber=accountnumber;
	}
	public int getaccountnumber()
	{
		return accountnumber;
	}
}
public class EncapsulationDemo 
{

	public static void main(String[] args) 
	{
		Bank o =new Bank();
		o.setbankname("yes bank");
		String s=o.getbank();
		System.out.println(s);
		
		o.setaccountnumber(10012);
		int acc=o.getaccountnumber();
		System.out.println(acc);
		
	}

}
