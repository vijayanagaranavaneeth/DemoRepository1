package com.sgtesting.encapsu;
class Country
{
	String CountryName;
	String Moto;
	String Anthem;
	int NUMofStates;
	String OfficialLanguage;
	String LargestState;	
}

class State
{
	String StateName;
	String Moto;
	String Song;
	int   NUMofDistricts;
	String OfficialLanguage;
	String LargestDistrict;	 
}

class District
{
	String DistrictName;
	String Moto;
	String Song;
	int NUMofTaluk;
	String OfficialLanguage;
	String LargestTaluk;	
}


public class CountryStateDistrict
{

	public static void main(String[] args) 
	{
		System.out.println("COUNTRY");
		Country C=new Country();
		C.CountryName="INDIA";
		C.Moto="SATYAMEVA JAYATE";
		C.Anthem="JANA GANA MANA";
		C.NUMofStates=28;
		C.OfficialLanguage="HINDI AND ENGLISH";
		C.LargestState="RAJASTHAN";

		System.out.println("NAME OF THE COUNTRY:"+C.CountryName);
		System.out.println("MOTO OF THE COUNTRY:"+C.Moto);
		System.out.println("NATIONAL ANTHEM    :"+C.Anthem);
		System.out.println("NUMBER OF STATES   :"+C.NUMofStates);
		System.out.println("OFFICIAL LANGUAGE  :"+C.OfficialLanguage);
		System.out.println("LARGEST STATE      :"+C.LargestState);
		System.out.println("----------------------------------------");

		System.out.println("STATE");
		State S=new State();
		S.StateName="KARNATAKA";
		S.Moto="SATYAMEVA JAYATE";
		S.Song="JAI BARATHA JANANIYA THANUJATHE";
		S.NUMofDistricts=30;
		S.OfficialLanguage="KANNADA";
		S.LargestDistrict="BELAGAVI";

		System.out.println("NAME OF THE STATE     :"+S.StateName);
		System.out.println("MOTO OF THE STATE     :"+S.Moto);
		System.out.println("STATE SONG            :"+S.Song);
		System.out.println("NUMBER OF DISTRICTS   :"+S.NUMofDistricts);
		System.out.println("OFFICIAL LANGUAGE     :"+S.OfficialLanguage);
		System.out.println("LARGEST District      :"+S.LargestDistrict);
		System.out.println("----------------------------------------");

		System.out.println("DISTRICT");
		District D=new District();
		D.DistrictName="CHIKKABALLAPUR";
		D.Moto="SATYAMEVA JAYATE";
		D.Song="JAI BARATHA JANANIYA THANUJATHE";
		D.NUMofTaluk=6;
		D.OfficialLanguage="KANNADA";
		D.LargestTaluk="CHINTAMANI";

		System.out.println("NAME OF THE DISTRICT   :"+D.DistrictName);
		System.out.println("MOTO                   :"+D.Moto);
		System.out.println("SONG                   :"+D.Song);
		System.out.println("NUMBER OF TALUKS       :"+D.NUMofTaluk);
		System.out.println("OFFICIAL LANGUAGE      :"+D.OfficialLanguage);
		System.out.println("LARGEST TALUK          :"+D.LargestTaluk);
		System.out.println("----------------------------------------");

	}

}
