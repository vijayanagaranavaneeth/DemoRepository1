package com.sgtesting.encapsu;

class WhellerFour
{
	String  brandName;
	String  transmissionType;
	String  fuelTankCapacity;
	String    fuelType;
	String  colourOfCar;
	int     seaterCapacity;
}
class WheelerHeavy
{
	String  BrandName;
	String  FuelTankCapacity;
	int     SeaterCapacity;
	int     MaxTonnage;
	int     NumOfTyres;
	String  VechicleType;
}

class WheelerTwo
{
	String BrandName;
	String StrokeType;
	int 	 SeaterCapacity;
	int 	 Milage;
	String Colour;
}

public class FourTwoHeavyWheelers
{

	public static void main(String[] args) 
	{
		WhellerFour V= new WhellerFour();
		V.brandName="Maruthi";
		V.transmissionType="Automatic";
		V.fuelTankCapacity="50L";
		V. fuelType="Petrol";
		V.colourOfCar="Navy Blue";
		V.seaterCapacity=4;	
		System.out.println("BRAND NAME:"+V.brandName);
		System.out.println("TRANSMISSION TYPE:"+V.transmissionType);
		System.out.println("FUEL TANK CAPACITY:"+V.fuelTankCapacity);
		System.out.println("FUEL TYPE:"+V. fuelType);
		System.out.println("COLOUR OF CAR:"+V.colourOfCar);
		System.out.println("SEATER CAPACITY:"+V.seaterCapacity);		
		System.out.println("---------------------------------");

		WheelerHeavy t=new WheelerHeavy();
		t.BrandName="TATA";
		t.FuelTankCapacity="Disel";
		t.SeaterCapacity=3;
		t.MaxTonnage=40;
		t.NumOfTyres=8+1;
		t.VechicleType="Goods";
		System.out.println("BRAND NAME:"+t.BrandName);
		System.out.println("FUEL TANK CAPACITY:"+t.FuelTankCapacity);
		System.out.println("SEATER CAPACITY:"+t.SeaterCapacity);
		System.out.println("TONNAGE CAPACITY:"+ t.MaxTonnage);
		System.out.println("NUMBER OF TYRES CONTAINS"+t.NumOfTyres);
		System.out.println("VECHICLE TYPE:"+t.VechicleType);
		System.out.println("/////////////////////////////");

		WheelerTwo h=new WheelerTwo();
		h.BrandName="BAJAJ";
		h.StrokeType="4SSTROKE PULSAR 150 Dtsi";
		h.SeaterCapacity=2;
		h.Milage=50;
		h.Colour="NAVY BLUE";
		System.out.println("BRAND NAME:"+h.BrandName);
		System.out.println("STROKE TYPE:"+h.StrokeType);
		System.out.println("SEATER CAPACITY:"+h.SeaterCapacity);
		System.out.println("MILAGE PER LITRE:"+h.Milage);
		System.out.println("COLOUR OF VIECHLE:"+h.Colour);
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");        
	}

}
