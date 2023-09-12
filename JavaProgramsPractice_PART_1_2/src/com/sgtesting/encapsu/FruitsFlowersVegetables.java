package com.sgtesting.encapsu;
class Fruits
{
	String FruitName;
	String FruitType;
	String Colour;
	String Kingdom;
	String Family;
}

class Flowers
{
	String FlowerName;
	String FamilyName;
	String Flowercolour;
	String Kingdom;
	int    NUMofPetals;	
}
class Vegetables
{
	String VegetablesName;
	String FamilyName;
	String Colour;
	String Kingdom;
	String Taste;
}

public class FruitsFlowersVegetables
{

	public static void main(String[] args) 
	{
		System.out.println("FRUITS");
		Fruits f1=new Fruits();
		f1.FruitName="TOMATO";
		f1.FruitType="CITRUS";
		f1.Colour="RED AND GREEN";
		f1.Kingdom="PLANTAE";
		f1.Family="SOLANACEAE";
		System.out.println("NAME OF FRUIT:--------"+f1.FruitName);
		System.out.println("TYPE OF THE FRUIT:----"+f1.FruitType);
		System.out.println("COLOUR OF FRUIT:------"+f1.Colour);
		System.out.println("KINGDOM OF FRUIT:-----"+f1.Kingdom);
		System.out.println("FAMILY OF FRUIT:------"+f1.Family);
		System.out.println("---------------------------------");

		System.out.println("FLOWERS");		
		Flowers f2=new Flowers();
		f2.FlowerName="Petunia Alba";
		f2.FamilyName="SOLANACEAE";
		f2.Flowercolour="Pink, Purple, White, Red,Yellow";
		f2.Kingdom="Plantae";
		f2.NUMofPetals=5;
		System.out.println("NAME OF THE FLOWER:--------"+f2.FlowerName);
		System.out.println("NAME OF THE FAMILY:--------"+f2.FamilyName);
		System.out.println("COLOUR OF THE FLOWER:------"+f2.Flowercolour);
		System.out.println("KINGDOM OF THE COLOUR:-----"+f2.Kingdom);
		System.out.println("NUMBER OF PETALS:----------"+f2.NUMofPetals);
		System.out.println("------------------------------------------");

		System.out.println("VEGETABLES");	    
		Vegetables v=new Vegetables();
		v.VegetablesName="CARROT";
		v.FamilyName="APIACEAE";
		v.Colour="ORANGE";
		v.Kingdom="PLANTAE";
		v.Taste="SWEET";
		System.out.println("NAME OF THE VEGETABLE:----"+v.VegetablesName);
		System.out.println("NAME OF THE FAMILY:-------"+v.FamilyName);
		System.out.println("COLOUR OF THE CARROT:-----"+v.Colour);
		System.out.println("KINGDOM OF THE VEGETABLE:-"+v.Kingdom);
		System.out.println("TASTE OF THE VEGETABLES:--"+v.Taste);
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");		

	}

}
