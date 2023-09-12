package com.sgtesting.noargsconstructor;


class Country
{
	String CountryName;
	String Moto;
	String Anthem;
	int NUMofStates;
	String OfficialLanguage;
	String LargestState;
	Country()
	{
		CountryName="INDIA";
		Moto="SATYAMEVA JAYATE";
		Anthem="JANA GANA MANA";
		NUMofStates=28;
		OfficialLanguage="HINDI AND ENGLISH";
		LargestState="RAJASTHAN";

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
	State()
	{
		StateName="KARNATAKA";
		Moto="SATYAMEVA JAYATE";
		Song="JAI BARATHA JANANIYA THANUJATHE";
		NUMofDistricts=30;
		OfficialLanguage="KANNADA";
		LargestDistrict="BELAGAVI";

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
	District()
	{
		DistrictName="CHIKKABALLAPUR";
		Moto="SATYAMEVA JAYATE";
		Song="JAI BARATHA JANANIYA THANUJATHE";
		NUMofTaluk=6;
		OfficialLanguage="KANNADA";
		LargestTaluk="CHINTAMANI";

		System.out.println("NAME OF THE DISTRICT   :"+DistrictName);
		System.out.println("MOTO                   :"+Moto);
		System.out.println("SONG                   :"+Song);
		System.out.println("NUMBER OF TALUKS       :"+NUMofTaluk);
		System.out.println("OFFICIAL LANGUAGE      :"+OfficialLanguage);
		System.out.println("LARGEST TALUK          :"+LargestTaluk);
		System.out.println("----------------------------------------");
	}
}

public class CountryStateDistrict {

	public static void main(String[] args) {
		Country C=new Country();
		State S=new State();
		District D=new District();

	}

}
