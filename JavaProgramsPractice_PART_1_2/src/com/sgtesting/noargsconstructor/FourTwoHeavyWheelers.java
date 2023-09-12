package com.sgtesting.noargsconstructor;


class WhellerFour
{
	String  brandName;
	String  transmissionType;
	String  fuelTankCapacity;
	String    fuelType;
	String  colourOfCar;
	int     seaterCapacity;
	WhellerFour()
	{
		brandName="Maruthi";
		transmissionType="Automatic";
		fuelTankCapacity="50L";
		fuelType="Petrol";
		colourOfCar="Navy Blue";
		seaterCapacity=4;	
		System.out.println("BRAND NAME:"+brandName);
		System.out.println("TRANSMISSION TYPE:"+transmissionType);
		System.out.println("FUEL TANK CAPACITY:"+fuelTankCapacity);
		System.out.println("FUEL TYPE:"+ fuelType);
		System.out.println("COLOUR OF CAR:"+colourOfCar);
		System.out.println("SEATER CAPACITY:"+seaterCapacity);		
        System.out.println("---------------------------------");
	}
}

class WheelerHeavy
{
String  BrandName;
String  FuelTankCapacity;
int     SeaterCapacity;
int     MaxTonnage;
int     NumOfTyres;
String  VechicleType;
WheelerHeavy()
{
	BrandName="TATA";
    FuelTankCapacity="Disel";
    SeaterCapacity=3;
    MaxTonnage=40;
    NumOfTyres=8+1;
    VechicleType="Goods";
    System.out.println("BRAND NAME:"+BrandName);
    System.out.println("FUEL TANK CAPACITY:"+FuelTankCapacity);
    System.out.println("SEATER CAPACITY:"+SeaterCapacity);
    System.out.println("TONNAGE CAPACITY:"+ MaxTonnage);
    System.out.println("NUMBER OF TYRES CONTAINS"+NumOfTyres);
    System.out.println("VECHICLE TYPE:"+VechicleType);
    System.out.println("/////////////////////////////");
}
}
public class FourTwoHeavyWheelers 
{

	public static void main(String[] args)
	{
		WhellerFour V= new WhellerFour();
		 WheelerHeavy t=new WheelerHeavy();

	}

}
