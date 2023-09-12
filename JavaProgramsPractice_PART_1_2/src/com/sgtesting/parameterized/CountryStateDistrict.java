package com.sgtesting.parameterized;

class Country
{
	String CountryName;
	String Moto;
	String Anthem;
	int NUMofStates;
	String OfficialLanguage;
	String LargestState;
	Country(String cname,String mname,String aname,int nstate,String olang,String lstate)
	{

		CountryName=cname;
		Moto=mname;
		Anthem=aname;
		NUMofStates=nstate;
		OfficialLanguage=olang;
		LargestState=lstate;

		System.out.println("NAME OF THE COUNTRY:"+CountryName);
		System.out.println("MOTO OF THE COUNTRY:"+Moto);
		System.out.println("NATIONAL ANTHEM    :"+Anthem);
		System.out.println("NUMBER OF STATES   :"+NUMofStates);
		System.out.println("OFFICIAL LANGUAGE  :"+OfficialLanguage);
		System.out.println("LARGEST STATE      :"+LargestState);
		System.out.println("----------------------------------------");
	}
}

class State
{
	String StateName;
	String Moto;
	String Song;
	int   NUMofDistricts;
	String OfficialLanguage;
	String LargestDistrict;
	State(String sname,String mname,String stname,int dno,String olname,String ldname)
	{
		StateName=sname;
		Moto=mname;
		Song=stname;
		NUMofDistricts=dno;
		OfficialLanguage=olname;
		LargestDistrict=ldname;

		System.out.println("NAME OF THE STATE     :"+StateName);
		System.out.println("MOTO OF THE STATE     :"+Moto);
		System.out.println("STATE SONG            :"+Song);
		System.out.println("NUMBER OF DISTRICTS   :"+NUMofDistricts);
		System.out.println("OFFICIAL LANGUAGE     :"+OfficialLanguage);
		System.out.println("LARGEST District      :"+LargestDistrict);
		System.out.println("----------------------------------------");
	}

}
class District
{
	String DistrictName;
	String Moto;
	String Song;
	int NUMofTaluk;
	String OfficialLanguage;
	String LargestTaluk;
	District(String dname,String Mname,String Sname,int ntak,String olang,String ltak)
	{
		DistrictName=dname;
		Moto=Mname;
		Song=Sname;
		NUMofTaluk=ntak;
		OfficialLanguage=olang;
		LargestTaluk=ltak;

		System.out.println("NAME OF THE DISTRICT   :"+DistrictName);
		System.out.println("MOTO                   :"+Moto);
		System.out.println("SONG                   :"+Song);
		System.out.println("NUMBER OF TALUKS       :"+NUMofTaluk);
		System.out.println("OFFICIAL LANGUAGE      :"+OfficialLanguage);
		System.out.println("LARGEST TALUK          :"+LargestTaluk);
		System.out.println("----------------------------------------");
	}
}

public class CountryStateDistrict
{

	public static void main(String[] args) 
	{
		Country A =new Country("india","satyameva jayathe","janaganamana",29,"hindi","Rajasthan");
		Country B =new Country("USA","xxxx","yyyyy",50,"English","zzzzzzz");
		State a =new State("Karnataka","sathyamevajayathe","jaibarathajananiya",29,"Kannada","belagavi");
		District q= new District("chikkaballapur","satyamevajayathe","jaibarathiya",29,"kannada","Gauribidnur");
	}

}
